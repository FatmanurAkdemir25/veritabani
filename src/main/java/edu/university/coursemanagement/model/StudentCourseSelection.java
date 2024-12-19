package edu.university.coursemanagement.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;


import java.util.Date;

@Entity
@Table(name = "student_course_selections")
public class StudentCourseSelection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int selectionID;

    @ManyToOne
    @JoinColumn(name = "studentID")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "courseID")
    private Course course;

    @Temporal(TemporalType.DATE)
    private Date selectionDate;

    private boolean isApproved;

    // Getter ve Setter metodları
    // ...
}
