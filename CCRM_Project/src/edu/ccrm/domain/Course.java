package edu.ccrm.domain;

public class Course {
    private final String code;
    private String title;
    private int credits;
    private String instructorId;
    private Semester semester;
    private String department;

    public Course(String code, String title, int credits, Semester semester, String department) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.semester = semester;
        this.department = department;
    }

    public String getCode() { return code; }
    public String getTitle() { return title; }
    public int getCredits() { return credits; }
    public String getInstructorId() { return instructorId; }
    public Semester getSemester() { return semester; }
    public String getDepartment() { return department; }

    public void setInstructorId(String id) { this.instructorId = id; }

    @Override
    public String toString() {
        return String.format("Course[code=%s,title=%s,credits=%d,sem=%s,dept=%s,instr=%s]",
                code, title, credits, semester, department, instructorId);
    }
}
