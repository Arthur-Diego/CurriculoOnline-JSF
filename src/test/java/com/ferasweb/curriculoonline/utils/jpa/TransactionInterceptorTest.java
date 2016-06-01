/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.utils.jpa;

import javax.interceptor.InvocationContext;
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
public class TransactionInterceptorTest {
    
    public TransactionInterceptorTest() {
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
     * Test of invoke method, of class TransactionInterceptor.
     */
    @Test
    public void testInvoke() throws Exception {
        System.out.println("invoke");
        InvocationContext context = null;
        TransactionInterceptor instance = new TransactionInterceptor();
        Object expResult = null;
        Object result = instance.invoke(context);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
