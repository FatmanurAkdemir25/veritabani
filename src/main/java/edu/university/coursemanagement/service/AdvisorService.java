/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Fatmanur Akdemir
 */
package edu.university.coursemanagement.service;

import edu.university.coursemanagement.model.Advisor;
import edu.university.coursemanagement.repository.AdvisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdvisorService {

    @Autowired
    private AdvisorRepository advisorRepository;

    public List<Advisor> getAllAdvisors() {
        return advisorRepository.findAll();
    }

    public Advisor createAdvisor(Advisor advisor) {
        return advisorRepository.save(advisor);
    }
}
