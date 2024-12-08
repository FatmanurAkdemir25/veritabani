/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Fatmanur Akdemir
 */
package edu.university.coursemanagement.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "StudentCourseSelections")
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

    // Getter ve Setter'lar
}