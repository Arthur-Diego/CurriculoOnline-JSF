/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.exception;

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
public class BusinessExceptionTest {
    
    public BusinessExceptionTest() {
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
     * Test of getMessage method, of class BusinessException.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        BusinessException instance = null;
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessage method, of class BusinessException.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String msg = "";
        BusinessException instance = null;
        instance.setMessage(msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVariacoes method, of class BusinessException.
     */
    @Test
    public void testGetVariacoes() {
        System.out.println("getVariacoes");
        BusinessException instance = null;
        String[] expResult = null;
        String[] result = instance.getVariacoes();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVariacoes method, of class BusinessException.
     */
    @Test
    public void testSetVariacoes() {
        System.out.println("setVariacoes");
        String[] var = null;
        BusinessException instance = null;
        instance.setVariacoes(var);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
