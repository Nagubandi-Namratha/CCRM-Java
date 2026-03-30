package edu.ccrm.service;

import edu.ccrm.domain.Enrollment;
import java.util.List;

public interface EnrollmentService {
    Enrollment enroll(String id, String studentId, String courseCode);
    List<Enrollment> listForStudent(String studentId);
}
