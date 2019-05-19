/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.koliCalc.repositories;

import hu.elte.koliCalc.entities.SportInformation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dorka
 */
@Repository
public interface SportInformationRepo extends CrudRepository<SportInformation, Integer> {
  
}
