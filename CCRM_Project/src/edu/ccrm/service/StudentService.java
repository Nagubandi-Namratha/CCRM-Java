package edu.ccrm.service;

import edu.ccrm.domain.Student;
import java.util.List;

public interface StudentService {
    Student addStudent(String id, String regNo, String name, String email);
    Student findById(String id);
    List<Student> listAll();
}
