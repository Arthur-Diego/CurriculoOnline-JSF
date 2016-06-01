/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.controller.messages;

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
public class MessagesViewTest {
    
    public MessagesViewTest() {
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
     * Test of info method, of class MessagesView.
     */
    @Test
    public void testInfo() {
        System.out.println("info");
        String msg = "";
        MessagesView instance = new MessagesView();
        instance.info(msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of warn method, of class MessagesView.
     */
    @Test
    public void testWarn() {
        System.out.println("warn");
        String msg = "";
        MessagesView instance = new MessagesView();
        instance.warn(msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of error method, of class MessagesView.
     */
    @Test
    public void testError() {
        System.out.println("error");
        String msg = "";
        MessagesView instance = new MessagesView();
        instance.error(msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fatal method, of class MessagesView.
     */
    @Test
    public void testFatal() {
        System.out.println("fatal");
        String msg = "";
        MessagesView instance = new MessagesView();
        instance.fatal(msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
