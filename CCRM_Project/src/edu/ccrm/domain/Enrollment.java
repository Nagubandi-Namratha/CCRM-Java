package edu.ccrm.domain;

import java.time.LocalDate;

public class Enrollment {
    private final String id;
    private final String studentId;
    private final String courseCode;
    private double marks = -1;
    private LocalDate enrolledOn;

    public Enrollment(String id, String studentId, String courseCode) {
        this.id = id;
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.enrolledOn = LocalDate.now();
    }

    public String getId() { return id; }
    public String getStudentId() { return studentId; }
    public String getCourseCode() { return courseCode; }
    public double getMarks() { return marks; }
    public void setMarks(double marks) { this.marks = marks; }

    @Override
    public String toString() {
        return String.format("Enrollment[id=%s, student=%s, course=%s, marks=%.2f]", id, studentId, courseCode, marks);
    }
}
