/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.utils.jpa;

import java.sql.Connection;
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
public class ConnectionFactoryTest {
    
    public ConnectionFactoryTest() {
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
     * Test of getConnection method, of class ConnectionFactory.
     */
    @Test
    public void testGetConnection_String_String() {
        System.out.println("getConnection");
        String user = "";
        String pass = "";
        ConnectionFactory instance = new ConnectionFactory();
        Connection expResult = null;
        Connection result = instance.getConnection(user, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConnectionOpen method, of class ConnectionFactory.
     */
    @Test
    public void testGetConnectionOpen() {
        System.out.println("getConnectionOpen");
        ConnectionFactory instance = new ConnectionFactory();
        Connection expResult = null;
        Connection result = instance.getConnectionOpen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConnection method, of class ConnectionFactory.
     */
    @Test
    public void testGetConnection_0args() {
        System.out.println("getConnection");
        ConnectionFactory instance = new ConnectionFactory();
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
