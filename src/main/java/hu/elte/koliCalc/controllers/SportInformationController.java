/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.koliCalc.controllers;

import hu.elte.koliCalc.entities.SportInformation;
import hu.elte.koliCalc.repositories.SportInformationRepo;
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
@RequestMapping("sport_information")
public class SportInformationController {

    @Autowired
    private SportInformationRepo sportInfoRepo;
    
    /**
     * Visszaadja az összes sport infót az adatbázisból.
     * @return 
     */
    @GetMapping("")
    public ResponseEntity<Iterable<SportInformation>> getAllSportInfo(){
        return ResponseEntity.ok(sportInfoRepo.findAll());
    }
    
}
