/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.koliCalc.controllers;

import hu.elte.koliCalc.entities.FamilyInformation;
import hu.elte.koliCalc.repositories.FamilyInformationRepo;
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
@RequestMapping("family_information")
public class FamilyInformationController {

    @Autowired
    private FamilyInformationRepo familyInfoRepo;
    
    /**
     * Visszaadja az összes family infót az adatbázisból.
     * @return 
     */
    @GetMapping("")
    public ResponseEntity<Iterable<FamilyInformation>> getAllFamilyInfo(){
        return ResponseEntity.ok(familyInfoRepo.findAll());
    }
    
}
