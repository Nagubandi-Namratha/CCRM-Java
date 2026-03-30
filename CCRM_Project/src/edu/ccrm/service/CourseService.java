package edu.ccrm.service;

import edu.ccrm.domain.Course;
import java.util.List;

public interface CourseService {
    Course addCourse(String code, String title, int credits, edu.ccrm.domain.Semester semester, String dept);
    Course findByCode(String code);
    List<Course> listAll();
}
