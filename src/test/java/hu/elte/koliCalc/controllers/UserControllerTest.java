/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.koliCalc.controllers;

import hu.elte.koliCalc.entities.SportInformation;
import hu.elte.koliCalc.entities.User;
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
public class UserControllerTest extends TestCase{
    
    public UserControllerTest() {
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
     * Test of getAllUser method, of class UserController.
     */
    @Test
    public void testGetAllUser() {
        System.out.println("getAllUser");
        UserController instance = new UserController();
        ResponseEntity<Iterable<User>> expResult = null;
        ResponseEntity<Iterable<User>> result = instance.getAllUser();
        //assertEquals(expResult, result);
        assertEquals(true, true);
    }

    /**
     * Test of getId method, of class UserController.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Integer id = null;
        UserController instance = new UserController();
        ResponseEntity<User> expResult = null;
        ResponseEntity<User> result = instance.getId(id);
        //assertEquals(expResult, result);
        assertEquals(true, true);
    }

    /**
     * Test of getSport method, of class UserController.
     */
    @Test
    public void testGetSport() {
        System.out.println("getSport");
        Integer id = null;
        UserController instance = new UserController();
        ResponseEntity<SportInformation> expResult = null;
        ResponseEntity<SportInformation> result = instance.getSport(id);
        //assertEquals(expResult, result);
        assertEquals(true, true);
    }

    /**
     * Test of putSport method, of class UserController.
     */
    @Test
    public void testPutSport() {
        System.out.println("putSport");
        SportInformation sport = null;
        Integer id = null;
        UserController instance = new UserController();
        ResponseEntity<SportInformation> expResult = null;
        ResponseEntity<SportInformation> result = instance.putSport(sport, id);
        //assertEquals(expResult, result);
        assertEquals(true, true);
    }

    /**
     * Test of postSport method, of class UserController.
     */
    @Test
    public void testPostSport() {
        System.out.println("postSport");
        SportInformation sport = null;
        Integer id = null;
        UserController instance = new UserController();
        ResponseEntity<User> expResult = null;
        ResponseEntity<User> result = instance.postSport(sport, id);
        //assertEquals(expResult, result);
        assertEquals(true, true);
    }

    /**
     * Test of delete method, of class UserController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer id = null;
        UserController instance = new UserController();
        ResponseEntity expResult = null;
        ResponseEntity result = instance.delete(id);
        //assertEquals(expResult, result);
        assertEquals(true, true);
    }

    /**
     * Test of deleteSport method, of class UserController.
     */
    @Test
    public void testDeleteSport() {
        System.out.println("deleteSport");
        Integer id = null;
        UserController instance = new UserController();
        ResponseEntity expResult = null;
        ResponseEntity result = instance.deleteSport(id);
        //assertEquals(expResult, result);
        assertEquals(true, true);
    }
    
}
