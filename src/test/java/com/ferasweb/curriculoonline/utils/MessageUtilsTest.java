/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.utils;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
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
public class MessageUtilsTest {
    
    public MessageUtilsTest() {
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
     * Test of messageFactoringFull method, of class MessageUtils.
     */
    @Test
    public void testMessageFactoringFull_4args() {
        System.out.println("messageFactoringFull");
        String msg = "";
        Object[] variantes = null;
        FacesMessage.Severity severity = null;
        FacesContext currentJsf = null;
        String expResult = "";
        String result = MessageUtils.messageFactoringFull(msg, variantes, severity, currentJsf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of messageFactoringFull method, of class MessageUtils.
     */
    @Test
    public void testMessageFactoringFull_5args() {
        System.out.println("messageFactoringFull");
        String clientId = "";
        String msg = "";
        Object[] variantes = null;
        FacesMessage.Severity severity = null;
        FacesContext currentJsf = null;
        String expResult = "";
        String result = MessageUtils.messageFactoringFull(clientId, msg, variantes, severity, currentJsf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of messageFactoringFull method, of class MessageUtils.
     */
    @Test
    public void testMessageFactoringFull_6args() {
        System.out.println("messageFactoringFull");
        String detail = "";
        String clientId = "";
        String msg = "";
        Object[] variantes = null;
        FacesMessage.Severity severity = null;
        FacesContext currentJsf = null;
        String expResult = "";
        String result = MessageUtils.messageFactoringFull(detail, clientId, msg, variantes, severity, currentJsf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMsgVarArgs method, of class MessageUtils.
     */
    @Test
    public void testGetMsgVarArgs() {
        System.out.println("getMsgVarArgs");
        String msg = "";
        FacesContext context = null;
        Object[] var = null;
        String expResult = "";
        String result = MessageUtils.getMsgVarArgs(msg, context, var);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResourceBundle method, of class MessageUtils.
     */
    @Test
    public void testGetResourceBundle() {
        System.out.println("getResourceBundle");
        String msg = "";
        FacesContext current = null;
        String expResult = "";
        String result = MessageUtils.getResourceBundle(msg, current);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doisNomes method, of class MessageUtils.
     */
    @Test
    public void testDoisNomes() {
        System.out.println("doisNomes");
        String nomeCompleto = "";
        String expResult = "";
        String result = MessageUtils.doisNomes(nomeCompleto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
