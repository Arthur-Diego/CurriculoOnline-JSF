/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.security;

import com.ferasweb.curriculoonline.model.dao.LoginDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author arthur.diego
 */
public class AppUserDetailsServiceTest {
    
    public AppUserDetailsServiceTest() {
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
     * Test of returnDAO method, of class AppUserDetailsService.
     */
    @Test
    public void testReturnDAO() {
        System.out.println("returnDAO");
        AppUserDetailsService instance = new AppUserDetailsService();
        LoginDAO expResult = null;
        LoginDAO result = instance.returnDAO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadUserByUsername method, of class AppUserDetailsService.
     */
    @Test
    public void testLoadUserByUsername() {
        System.out.println("loadUserByUsername");
        String login = "";
        AppUserDetailsService instance = new AppUserDetailsService();
        UserDetails expResult = null;
        UserDetails result = instance.loadUserByUsername(login);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
