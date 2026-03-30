package edu.ccrm.service;

import edu.ccrm.domain.Course;
import edu.ccrm.domain.Semester;
import java.util.*;

public class InMemoryCourseService implements CourseService {
    private final Map<String, Course> map = new HashMap<>();

    @Override
    public Course addCourse(String code, String title, int credits, Semester semester, String dept) {
        Course c = new Course(code, title, credits, semester, dept);
        map.put(code, c);
        return c;
    }

    @Override
    public Course findByCode(String code) { return map.get(code); }

    @Override
    public List<Course> listAll() { return new ArrayList<>(map.values()); }
}
