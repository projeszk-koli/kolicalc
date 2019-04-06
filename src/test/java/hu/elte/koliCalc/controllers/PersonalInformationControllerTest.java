/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.koliCalc.controllers;

import hu.elte.koliCalc.entities.PersonalInformation;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author tibor_horvath
 */
public class PersonalInformationControllerTest extends TestCase {
    
    public PersonalInformationControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllPersonalInfo method, of class PersonalInformationController.
     */
    @Test
    public void testGetAllPersonalInfo() {
        System.out.println("getAllPersonalInfo");
        PersonalInformationController instance = new PersonalInformationController();
        ResponseEntity<Iterable<PersonalInformation>> expResult = null;
        ResponseEntity<Iterable<PersonalInformation>> result = instance.getAllPersonalInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
