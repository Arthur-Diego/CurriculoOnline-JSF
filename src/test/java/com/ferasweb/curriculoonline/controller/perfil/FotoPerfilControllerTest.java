/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.controller.perfil;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.primefaces.model.StreamedContent;

/**
 *
 * @author arthur.diego
 */
public class FotoPerfilControllerTest {
    
    public FotoPerfilControllerTest() {
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
     * Test of findPerfil method, of class FotoPerfilController.
     */
    @Test
    public void testFindPerfil() {
        System.out.println("findPerfil");
        FotoPerfilController instance = new FotoPerfilController();
        instance.findPerfil();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImage method, of class FotoPerfilController.
     */
    @Test
    public void testGetImage() throws Exception {
        System.out.println("getImage");
        FotoPerfilController instance = new FotoPerfilController();
        StreamedContent expResult = null;
        StreamedContent result = instance.getImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVerifyIfExistImage method, of class FotoPerfilController.
     */
    @Test
    public void testIsVerifyIfExistImage() {
        System.out.println("isVerifyIfExistImage");
        FotoPerfilController instance = new FotoPerfilController();
        boolean expResult = false;
        boolean result = instance.isVerifyIfExistImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVerifyIfExistImage method, of class FotoPerfilController.
     */
    @Test
    public void testSetVerifyIfExistImage() {
        System.out.println("setVerifyIfExistImage");
        boolean verifyIfExistImage = false;
        FotoPerfilController instance = new FotoPerfilController();
        instance.setVerifyIfExistImage(verifyIfExistImage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
