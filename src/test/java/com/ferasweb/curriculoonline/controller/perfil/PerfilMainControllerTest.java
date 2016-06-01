/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.controller.perfil;

import com.ferasweb.curriculoonline.controller.commons.EntityPagination;
import com.ferasweb.curriculoonline.model.entity.Perfil;
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
public class PerfilMainControllerTest {
    
    public PerfilMainControllerTest() {
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
     * Test of redirectIfPerfilIsNull method, of class PerfilMainController.
     */
    @Test
    public void testRedirectIfPerfilIsNull() {
        System.out.println("redirectIfPerfilIsNull");
        PerfilMainController instance = new PerfilMainController();
        instance.redirectIfPerfilIsNull();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImage method, of class PerfilMainController.
     */
    @Test
    public void testGetImage() throws Exception {
        System.out.println("getImage");
        PerfilMainController instance = new PerfilMainController();
        StreamedContent expResult = null;
        StreamedContent result = instance.getImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVerifyIfExistImage method, of class PerfilMainController.
     */
    @Test
    public void testIsVerifyIfExistImage() {
        System.out.println("isVerifyIfExistImage");
        PerfilMainController instance = new PerfilMainController();
        boolean expResult = false;
        boolean result = instance.isVerifyIfExistImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVerifyIfExistImage method, of class PerfilMainController.
     */
    @Test
    public void testSetVerifyIfExistImage() {
        System.out.println("setVerifyIfExistImage");
        boolean verifyIfExistImage = false;
        PerfilMainController instance = new PerfilMainController();
        instance.setVerifyIfExistImage(verifyIfExistImage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateCurritulo method, of class PerfilMainController.
     */
    @Test
    public void testGenerateCurritulo() {
        System.out.println("generateCurritulo");
        PerfilMainController instance = new PerfilMainController();
        instance.generateCurritulo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEntity method, of class PerfilMainController.
     */
    @Test
    public void testSetEntity() {
        System.out.println("setEntity");
        Perfil t = null;
        PerfilMainController instance = new PerfilMainController();
        instance.setEntity(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewEntity method, of class PerfilMainController.
     */
    @Test
    public void testGetNewEntity() {
        System.out.println("getNewEntity");
        PerfilMainController instance = new PerfilMainController();
        Perfil expResult = null;
        Perfil result = instance.getNewEntity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrent method, of class PerfilMainController.
     */
    @Test
    public void testGetCurrent() {
        System.out.println("getCurrent");
        PerfilMainController instance = new PerfilMainController();
        Perfil expResult = null;
        Perfil result = instance.getCurrent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrent method, of class PerfilMainController.
     */
    @Test
    public void testSetCurrent() {
        System.out.println("setCurrent");
        Perfil current = null;
        PerfilMainController instance = new PerfilMainController();
        instance.setCurrent(current);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of performDestroy method, of class PerfilMainController.
     */
    @Test
    public void testPerformDestroy() {
        System.out.println("performDestroy");
        PerfilMainController instance = new PerfilMainController();
        instance.performDestroy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class PerfilMainController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        PerfilMainController instance = new PerfilMainController();
        String expResult = "";
        String result = instance.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class PerfilMainController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        PerfilMainController instance = new PerfilMainController();
        String expResult = "";
        String result = instance.update();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPagination method, of class PerfilMainController.
     */
    @Test
    public void testGetPagination() {
        System.out.println("getPagination");
        PerfilMainController instance = new PerfilMainController();
        EntityPagination expResult = null;
        EntityPagination result = instance.getPagination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
