/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Fatmanur Akdemir
 */
package edu.university.coursemanagement.controller;

import edu.university.coursemanagement.model.Transcript;
import edu.university.coursemanagement.repository.TranscriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transcripts")
public class TranscriptController {

    @Autowired
    private TranscriptRepository transcriptRepository;

    @GetMapping
    public List<Transcript> getAllTranscripts() {
        return transcriptRepository.findAll();
    }

    @PostMapping
    public Transcript createTranscript(@RequestBody Transcript transcript) {
        return transcriptRepository.save(transcript);
    }

    @GetMapping("/{id}")
    public Transcript getTranscriptById(@PathVariable int id) {
        return transcriptRepository.findById(id).orElse(null);
    }
}
