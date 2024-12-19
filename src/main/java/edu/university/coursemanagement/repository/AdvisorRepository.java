package edu.university.coursemanagement.repository;

import edu.university.coursemanagement.model.Advisor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvisorRepository extends JpaRepository<Advisor, Long> {
}
