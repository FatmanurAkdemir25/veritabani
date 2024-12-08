/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Fatmanur Akdemir
 */
package edu.university.coursemanagement.repository;

import edu.university.coursemanagement.model.Advisor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvisorRepository extends JpaRepository<Advisor, Integer> {
    // Burada, Advisor'a özgü sorgular eklenebilir.
}