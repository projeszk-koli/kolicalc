/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.koliCalc.controllers;

import hu.elte.koliCalc.entities.StudyInformation;
import hu.elte.koliCalc.repositories.StudyInformationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Dorka
 */
@RestController
@RequestMapping("study_information")
public class StudyInformationController {

    @Autowired
    private StudyInformationRepo studyInfoRepo;
    
    /**
     * Visszaadja az összes study infót az adatbázisból.
     * @return 
     */
    @GetMapping("")
    public ResponseEntity<Iterable<StudyInformation>> getAllStudyInfo(){
        return ResponseEntity.ok(studyInfoRepo.findAll());
    }
}
