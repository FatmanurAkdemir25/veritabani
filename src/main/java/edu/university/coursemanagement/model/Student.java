package edu.university.coursemanagement.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentID;

    private String firstName;
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "advisorID")
    private Advisor advisor;

    @Temporal(TemporalType.DATE)
    private Date enrollmentDate;

    // Getter ve Setter metodları
    // ...
}
