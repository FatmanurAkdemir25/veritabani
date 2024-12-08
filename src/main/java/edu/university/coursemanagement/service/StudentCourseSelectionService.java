/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Fatmanur Akdemir
 */
package edu.university.coursemanagement.service;

import edu.university.coursemanagement.model.StudentCourseSelection;
import edu.university.coursemanagement.repository.StudentCourseSelectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentCourseSelectionService {

    @Autowired
    private StudentCourseSelectionRepository selectionRepository;

    public List<StudentCourseSelection> getAllSelections() {
        return selectionRepository.findAll();
    }

    public StudentCourseSelection createSelection(StudentCourseSelection selection) {
        return selectionRepository.save(selection);
    }
}
