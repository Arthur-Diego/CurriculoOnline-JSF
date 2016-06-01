/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.controller.images;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.primefaces.event.CaptureEvent;

/**
 *
 * @author arthur.diego
 */
public class PhotoCamViewTest {
    
    public PhotoCamViewTest() {
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
     * Test of getFilename method, of class PhotoCamView.
     */
    @Test
    public void testGetFilename() {
        System.out.println("getFilename");
        PhotoCamView instance = new PhotoCamView();
        String expResult = "";
        String result = instance.getFilename();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of oncapture method, of class PhotoCamView.
     */
    @Test
    public void testOncapture() {
        System.out.println("oncapture");
        CaptureEvent captureEvent = null;
        PhotoCamView instance = new PhotoCamView();
        instance.oncapture(captureEvent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
