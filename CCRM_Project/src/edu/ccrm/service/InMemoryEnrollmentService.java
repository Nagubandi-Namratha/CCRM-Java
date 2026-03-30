package edu.ccrm.service;

import edu.ccrm.domain.Enrollment;
import java.util.*;
import java.util.stream.Collectors;

public class InMemoryEnrollmentService implements EnrollmentService {
    private final Map<String, Enrollment> map = new HashMap<>();

    @Override
    public Enrollment enroll(String id, String studentId, String courseCode) {
        Enrollment e = new Enrollment(id, studentId, courseCode);
        map.put(id, e);
        return e;
    }

    @Override
    public List<Enrollment> listForStudent(String studentId) {
        return map.values().stream().filter(e -> e.getStudentId().equals(studentId)).collect(Collectors.toList());
    }
}
