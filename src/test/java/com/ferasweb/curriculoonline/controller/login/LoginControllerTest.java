/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.controller.login;

import com.ferasweb.curriculoonline.security.UsuarioSistema;
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
public class LoginControllerTest {
    
    public LoginControllerTest() {
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
     * Test of preRender method, of class LoginController.
     */
    @Test
    public void testPreRender() {
        System.out.println("preRender");
        LoginController instance = new LoginController();
        instance.preRender();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class LoginController.
     */
    @Test
    public void testLogin() throws Exception {
        System.out.println("login");
        LoginController instance = new LoginController();
        instance.login();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logout method, of class LoginController.
     */
    @Test
    public void testLogout() throws Exception {
        System.out.println("logout");
        LoginController instance = new LoginController();
        instance.logout();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomeUsuario method, of class LoginController.
     */
    @Test
    public void testGetNomeUsuario() {
        System.out.println("getNomeUsuario");
        LoginController instance = new LoginController();
        String expResult = "";
        String result = instance.getNomeUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of usuario method, of class LoginController.
     */
    @Test
    public void testUsuario() {
        System.out.println("usuario");
        LoginController instance = new LoginController();
        UsuarioSistema expResult = null;
        UsuarioSistema result = instance.usuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
