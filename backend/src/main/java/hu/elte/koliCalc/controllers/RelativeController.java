/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.koliCalc.controllers;

import hu.elte.koliCalc.entities.Relative;
import hu.elte.koliCalc.repositories.RelativeRepo;
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
@RequestMapping("relatives")
public class RelativeController {

    @Autowired
    private RelativeRepo relativeRepo;
    
    /**
     * Visszaadja az összes relative infót az adatbázisból.
     * @return 
     */
    @GetMapping("")
    public ResponseEntity<Iterable<Relative>> getAllRelative(){
        return ResponseEntity.ok(relativeRepo.findAll());
    }
    
}
