/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Fatmanur Akdemir
 */
package edu.university.coursemanagement.controller;

import edu.university.coursemanagement.model.StudentCourseSelection;
import edu.university.coursemanagement.repository.StudentCourseSelectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/selections")
public class StudentCourseSelectionController {

    @Autowired
    private StudentCourseSelectionRepository selectionRepository;

    @GetMapping
    public List<StudentCourseSelection> getAllSelections() {
        return selectionRepository.findAll();
    }

    @PostMapping
    public StudentCourseSelection createSelection(@RequestBody StudentCourseSelection selection) {
        return selectionRepository.save(selection);
    }

    @GetMapping("/{id}")
    public StudentCourseSelection getSelectionById(@PathVariable int id) {
        return selectionRepository.findById(id).orElse(null);
    }
}
