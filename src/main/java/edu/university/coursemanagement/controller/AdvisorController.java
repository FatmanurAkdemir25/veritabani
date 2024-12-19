package edu.university.coursemanagement.controller;

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
    public Advisor getAdvisorById(@PathVariable Long id) {
        return advisorRepository.findById(id).orElse(null);
    }
}