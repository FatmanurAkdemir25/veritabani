package edu.university.coursemanagement.repository;

import edu.university.coursemanagement.model.StudentCourseSelection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCourseSelectionRepository extends JpaRepository<StudentCourseSelection, Integer> {
}
