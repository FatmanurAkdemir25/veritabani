/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.university.coursemanagement.controller;

/**
 *
 * @author Fatmanur Akdemir
 */


import edu.university.coursemanagement.model.Advisor;
import edu.university.coursemanagement.repository.AdvisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/advisors")
public class AdvisorController {

    @Autowired
    private AdvisorRepository advisorRepository;

    @GetMapping
    public List<Advisor> getAllAdvisors() {
        return advisorRepository.findAll();
    }

    @PostMapping
    public Advisor createAdvisor(@RequestBody Advisor advisor) {
        return advisorRepository.save(advisor);
    }

    @GetMapping("/{id}")
    public Advisor getAdvisorById(@PathVariable int id) {
        return advisorRepository.findById(id).orElse(null);
    }
}

