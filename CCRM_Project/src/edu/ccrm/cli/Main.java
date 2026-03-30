package edu.ccrm.cli;

import edu.ccrm.config.AppConfig;
import edu.ccrm.domain.*;
import edu.ccrm.service.*;
import edu.ccrm.io.FileUtil;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    private static final StudentService studentService = new InMemoryStudentService();
    private static final CourseService courseService = new InMemoryCourseService();
    private static final EnrollmentService enrollmentService = new InMemoryEnrollmentService();

    public static void main(String[] args) {
        AppConfig.getInstance();
        seedSampleData();
        runCli();
    }

    private static void seedSampleData() {
        studentService.addStudent("S1", "24BCE10132", "Vaibhav Kumar Singh", "vaibhav@example.com");
        courseService.addCourse("CS101", "Intro to CS", 3, Semester.FALL, "CSE");
        courseService.addCourse("MA101", "Calculus I", 4, Semester.FALL, "Math");
    }

    private static void runCli() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            printMenu();
            String choice = sc.nextLine().trim();
            switch (choice) {
                case "1" -> listStudents();
                case "2" -> listCourses();
                case "3" -> enrollStudent(sc);
                case "4" -> exportData();
                case "0" -> { System.out.println("Exiting"); return; }
                default -> System.out.println("Unknown option");
            }
        }
    }

    private static void printMenu() {
        System.out.println("=== CCRM Menu ===");
        System.out.println("1. List students");
        System.out.println("2. List courses");
        System.out.println("3. Enroll student in course");
        System.out.println("4. Backup data (demo)");
        System.out.println("0. Exit");
        System.out.print("Choice: ");
    }

    private static void listStudents() {
        List<Student> s = studentService.listAll();
        s.forEach(System.out::println);
    }

    private static void listCourses() {
        List<Course> c = courseService.listAll();
        c.forEach(System.out::println);
    }

    private static void enrollStudent(Scanner sc) {
        System.out.print("Enter student id: ");
        String sid = sc.nextLine().trim();
        System.out.print("Enter course code: ");
        String cc = sc.nextLine().trim();
        Student st = studentService.findById(sid);
        Course co = courseService.findByCode(cc);
        if (st == null) { System.out.println("Student not found"); return; }
        if (co == null) { System.out.println("Course not found"); return; }
        st.enroll(cc);
        Enrollment e = enrollmentService.enroll(UUID.randomUUID().toString(), sid, cc);
        System.out.println("Enrolled: " + e);
    }

    private static void exportData() {
        try {
            Path sampleSource = Path.of(".");
            Path backup = FileUtil.createTimestampedBackup(sampleSource);
            System.out.println("Backup created at: " + backup.toAbsolutePath());
        } catch (IOException ex) {
            System.err.println("Backup failed: " + ex.getMessage());
        }
    }
}
