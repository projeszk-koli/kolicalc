/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.koliCalc.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author Dorka
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(unique = true)
    //@NotNull
    private String neptun_code;
    
    @Column(name = "psw")
    //@NotNull
    private String password;
    
    @OneToOne(mappedBy = "user")
    @JsonIgnore
    private PersonalInformation pInfo;
    
    @OneToOne(mappedBy = "user")
    @JsonIgnore
    private FamilyInformation fInfo;
    
    @OneToOne(mappedBy = "user")
    @JsonIgnore
    private StudyInformation sInfo;
    
    @OneToOne(mappedBy = "user")
    private SportInformation sportInfo;
}
