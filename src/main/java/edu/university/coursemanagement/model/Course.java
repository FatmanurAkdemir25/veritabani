package edu.university.coursemanagement.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseID;

    @Column(unique = true, nullable = false)
    private String courseCode;

    private String courseName;
    private boolean isMandatory;
    private int credit;
    private String department;

    // Getter ve Setter metodları
    // ...
}