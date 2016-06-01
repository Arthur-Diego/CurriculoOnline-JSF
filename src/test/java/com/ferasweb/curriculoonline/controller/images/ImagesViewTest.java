/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.controller.images;

import java.util.List;
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
public class ImagesViewTest {
    
    public ImagesViewTest() {
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
     * Test of init method, of class ImagesView.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        ImagesView instance = new ImagesView();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImages method, of class ImagesView.
     */
    @Test
    public void testGetImages() {
        System.out.println("getImages");
        ImagesView instance = new ImagesView();
        List<String> expResult = null;
        List<String> result = instance.getImages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
