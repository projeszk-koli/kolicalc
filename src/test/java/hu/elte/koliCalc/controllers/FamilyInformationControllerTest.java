/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.koliCalc.controllers;

import hu.elte.koliCalc.entities.FamilyInformation;
import hu.elte.koliCalc.repositories.FamilyInformationRepo;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author tibor_horvath
 */
public class FamilyInformationControllerTest extends TestCase {

    public FamilyInformationControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }
/*
    //test repair - Dorka
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }*/

    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllFamilyInfo method, of class FamilyInformationController.
     */
    @Test
    public void testGetAllFamilyInfo() {
        System.out.println("getAllFamilyInfo");
        FamilyInformationController instance = new FamilyInformationController();
        ResponseEntity<Iterable<FamilyInformation>> expResult = null;
        ResponseEntity<Iterable<FamilyInformation>> result = instance.getAllFamilyInfo();
        
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
   /*
    //test repair - Dorka
    @InjectMocks
    private FamilyInformationController familyController;

    //test repair - Dorka
    @Mock
    private FamilyInformationRepo familyRepo;

    //test repair - Dorka
    @Test
    public void testGetAllFamilyInfo() {
        FamilyInformation fm = new FamilyInformation();
        
    }*/
    
    @Test
    public void testSuccess() {
        assertTrue(1 == 1);
    }

}
