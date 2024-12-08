/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Fatmanur Akdemir
 */
package edu.university.coursemanagement.service;

import edu.university.coursemanagement.model.Transcript;
import edu.university.coursemanagement.repository.TranscriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TranscriptService {

    @Autowired
    private TranscriptRepository transcriptRepository;

    public List<Transcript> getAllTranscripts() {
        return transcriptRepository.findAll();
    }

    public Transcript createTranscript(Transcript transcript) {
        return transcriptRepository.save(transcript);
    }
}
