package edu.ccrm.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String regNo;
    private boolean active;
    private final List<String> enrolledCourseCodes = new ArrayList<>();
    private LocalDate dob;

    public Student(String id, String regNo, String fullName, String email) {
        super(id, fullName, email);
        this.regNo = regNo;
        this.active = true;
    }

    public String getRegNo() { return regNo; }
    public boolean isActive() { return active; }
    public void deactivate() { this.active = false; }

    public void enroll(String courseCode) { enrolledCourseCodes.add(courseCode); }
    public void unenroll(String courseCode) { enrolledCourseCodes.remove(courseCode); }
    public List<String> getEnrolledCourseCodes() { return List.copyOf(enrolledCourseCodes); }

    @Override
    public String getProfile() {
        return String.format("Student[id=%s, reg=%s, name=%s, email=%s, active=%s]", id, regNo, fullName, email, active);
    }

    @Override
    public String toString() { return getProfile(); }
}
