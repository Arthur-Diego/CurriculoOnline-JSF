/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.utils;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author arthur.diego
 */
public class FacesProducerTest {
    
    public FacesProducerTest() {
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
     * Test of getFacesContext method, of class FacesProducer.
     */
    @Test
    public void testGetFacesContext() {
        System.out.println("getFacesContext");
        FacesProducer instance = new FacesProducer();
        FacesContext expResult = null;
        FacesContext result = instance.getFacesContext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExternalContext method, of class FacesProducer.
     */
    @Test
    public void testGetExternalContext() {
        System.out.println("getExternalContext");
        FacesProducer instance = new FacesProducer();
        ExternalContext expResult = null;
        ExternalContext result = instance.getExternalContext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHttpServletResponse method, of class FacesProducer.
     */
    @Test
    public void testGetHttpServletResponse() {
        System.out.println("getHttpServletResponse");
        FacesProducer instance = new FacesProducer();
        HttpServletResponse expResult = null;
        HttpServletResponse result = instance.getHttpServletResponse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
