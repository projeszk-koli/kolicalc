/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.koliCalc.controllers;

import hu.elte.koliCalc.entities.SportInformation;
import hu.elte.koliCalc.entities.User;
import hu.elte.koliCalc.repositories.FamilyInformationRepo;
import hu.elte.koliCalc.repositories.PersonalInformationRepo;
import hu.elte.koliCalc.repositories.SportInformationRepo;
import hu.elte.koliCalc.repositories.StudyInformationRepo;
import hu.elte.koliCalc.repositories.UserRepo;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Dorka
 */
@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserRepo userRepo;
    
    @Autowired
    private SportInformationRepo sportRepo;
    
    @Autowired
    private FamilyInformationRepo familyRepo;

    @Autowired
    private PersonalInformationRepo personalRepo;
    
    @Autowired
    private StudyInformationRepo studyRepo;
    
    /**
     * Visszaadja az összes user-t az adatbázisból.
     * @return 
     */
    @GetMapping("")
    public ResponseEntity<Iterable<User>> getAllUser(){
        return ResponseEntity.ok(userRepo.findAll());
    }
    
    /**
     * 
     * @param id
     * @return 
     */
    @GetMapping("/{id}")
    public ResponseEntity<User> getId(@PathVariable Integer id){
        Optional<User> user = userRepo.findById(id);
        if(user.isPresent()){
            //System.out.println(user.get().getSportInfo().getOutstandingCommunityActivity());
            return ResponseEntity.ok(user.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    
    /**
     * Adott ID alapján a user sport infójának a lekérése.
     * Optional: Opcionálisan ha van egy adott ID-jú user.
     * isPresent: ha létezik.. akkor ok különben nem talál.
     * @param id
     * @return 
     */
    @GetMapping("/{id}/sport")
    public ResponseEntity<SportInformation> getSport(@PathVariable Integer id){
        Optional<User> user = userRepo.findById(id);
        if(user.isPresent()){
            return ResponseEntity.ok(user.get().getSportInfo());
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    
    /**
     * Adott id-hoz tartozó user sport bejegyzésének a módosítása.
     * @param sport
     * @param id
     * @return 
     */
    @PutMapping("/{id}/sport")
    public ResponseEntity<SportInformation> putSport(@RequestBody SportInformation sport, @PathVariable Integer id){
        Optional<User> oUser = userRepo.findById(id);
        if(oUser.isPresent()){
            sport.setId(oUser.get().getSportInfo().getId());
            return ResponseEntity.ok(sportRepo.save(sport));
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    
    /**
     * Adott user-hez hozzáfűzi az adott sport eredmények adatait.
     * @param id
     * @param sport
     * @return 
     */
    @PostMapping("/{id}/sport")
    public ResponseEntity<User> postSport(@RequestBody SportInformation sport, @PathVariable Integer id){
        Optional<User> oUser = userRepo.findById(id);
        if(oUser.isPresent()){
            User user = oUser.get();
            
            User savedUser = userRepo.save(user);
            SportInformation save = sportRepo.save(sport);
            user.setSportInfo(sport);
            sport.setUser(user);
            
            return ResponseEntity.ok(savedUser);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    
    /**
     * Adott user törlése.
     * Adott user törlése esetén töröljük a hozzá tartozó adatokat is.
     * @param id
     * @return 
     */
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id){
        Optional<User> oUser = userRepo.findById(id);
        if(oUser.isPresent()){
            if(oUser.get().getSportInfo() != null){
                int sportID = oUser.get().getSportInfo().getId();
                sportRepo.deleteById(sportID);
            }
            if(oUser.get().getFInfo() != null){
                int familyID = oUser.get().getFInfo().getId();
                familyRepo.deleteById(familyID);
            }
            if(oUser.get().getPInfo() != null){
                int personalID = oUser.get().getPInfo().getId();
                personalRepo.deleteById(personalID);
            }
            if(oUser.get().getSInfo() != null){
                int studyID = oUser.get().getSInfo().getId();
                studyRepo.deleteById(studyID);
            }
            userRepo.deleteById(id);
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    
    /**
     * Adott sport infó törlése.
     * @param id
     * @return 
     */
    @DeleteMapping("/{id}/sport")
    public ResponseEntity deleteSport(@PathVariable Integer id){
        Optional<User> oUser = userRepo.findById(id);
        if(oUser.isPresent()){
            if(oUser.get().getSportInfo() != null){
                int sportID = oUser.get().getSportInfo().getId();
                sportRepo.deleteById(sportID);
            }
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    
    
}
