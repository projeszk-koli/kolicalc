/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.koliCalc.controllers;

import hu.elte.koliCalc.entities.PersonalInformation;
import hu.elte.koliCalc.repositories.PersonalInformationRepo;
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
@RequestMapping("personal_information")
public class PersonalInformationController {

    @Autowired
    private PersonalInformationRepo personalInfoRepo;
    
    /**
     * Visszaadja az összes personal infót az adatbázisból.
     * @return 
     */
    @GetMapping("")
    public ResponseEntity<Iterable<PersonalInformation>> getAllPersonalInfo(){
        return ResponseEntity.ok(personalInfoRepo.findAll());
    }
    
}
