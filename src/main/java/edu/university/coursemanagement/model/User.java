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
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;

    @Column(unique = true, nullable = false)
    private String username;

    private String passwordHash;
    private String role;

    @ManyToOne
    @JoinColumn(name = "relatedID", nullable = true)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "relatedID", nullable = true)
    private Advisor advisor;

    // Getter ve Setter'lar
}
