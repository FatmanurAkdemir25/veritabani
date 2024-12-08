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
@Table(name = "Advisors")
public class Advisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int advisorID;

    private String fullName;
    private String title;
    private String department;

    @Column(unique = true, nullable = false)
    private String email;

    // Getter ve Setter'lar
}
