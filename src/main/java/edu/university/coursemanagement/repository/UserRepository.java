package edu.university.coursemanagement.repository;

import edu.university.coursemanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}