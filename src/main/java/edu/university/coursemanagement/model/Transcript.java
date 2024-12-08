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
@Table(name = "Transcripts")
public class Transcript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transcriptID;

    @ManyToOne
    @JoinColumn(name = "studentID")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "courseID")
    private Course course;

    private String grade;
    private String semester;

    // Getter ve Setter'lar
}