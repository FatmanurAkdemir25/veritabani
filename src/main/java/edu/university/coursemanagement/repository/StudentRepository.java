package edu.university.coursemanagement.repository;

import edu.university.coursemanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}