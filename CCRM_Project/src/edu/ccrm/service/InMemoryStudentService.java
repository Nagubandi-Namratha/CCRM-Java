package edu.ccrm.service;

import edu.ccrm.domain.Student;
import java.util.*;

public class InMemoryStudentService implements StudentService {
    private final Map<String, Student> map = new HashMap<>();

    @Override
    public Student addStudent(String id, String regNo, String name, String email) {
        Student s = new Student(id, regNo, name, email);
        map.put(id, s);
        return s;
    }

    @Override
    public Student findById(String id) { return map.get(id); }

    @Override
    public List<Student> listAll() { return new ArrayList<>(map.values()); }
}
