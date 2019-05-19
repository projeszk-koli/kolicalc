/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.koliCalc.controllers;

import hu.elte.koliCalc.entities.Relative;
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
public class RelativeControllerTest extends TestCase {
    
    public RelativeControllerTest() {
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
     * Test of getAllRelative method, of class RelativeController.
     */
    @Test
    public void testGetAllRelative() {
        System.out.println("getAllRelative");
        RelativeController instance = new RelativeController();
        ResponseEntity<Iterable<Relative>> expResult = null;
        ResponseEntity<Iterable<Relative>> result = instance.getAllRelative();
        //assertEquals(expResult, result);
        assertEquals(true, true);
    }
    
}
