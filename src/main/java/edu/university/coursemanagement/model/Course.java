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

@Entity
@Table(name = "Courses")
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

    // Getter ve Setter'lar
}
