/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.model.entity;

import java.io.Serializable;
import java.util.Date;
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
public class LoginTest {
    
    public LoginTest() {
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
     * Test of getGrupos method, of class Login.
     */
    @Test
    public void testGetGrupos() {
        System.out.println("getGrupos");
        Login instance = new Login();
        List<Grupo> expResult = null;
        List<Grupo> result = instance.getGrupos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrupos method, of class Login.
     */
    @Test
    public void testSetGrupos() {
        System.out.println("setGrupos");
        List<Grupo> grupos = null;
        Login instance = new Login();
        instance.setGrupos(grupos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoginCod method, of class Login.
     */
    @Test
    public void testGetLoginCod() {
        System.out.println("getLoginCod");
        Login instance = new Login();
        Integer expResult = null;
        Integer result = instance.getLoginCod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoginCod method, of class Login.
     */
    @Test
    public void testSetLoginCod() {
        System.out.println("setLoginCod");
        Integer loginCod = null;
        Login instance = new Login();
        instance.setLoginCod(loginCod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoginNome method, of class Login.
     */
    @Test
    public void testGetLoginNome() {
        System.out.println("getLoginNome");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getLoginNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoginNome method, of class Login.
     */
    @Test
    public void testSetLoginNome() {
        System.out.println("setLoginNome");
        String loginNome = "";
        Login instance = new Login();
        instance.setLoginNome(loginNome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogin method, of class Login.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogin method, of class Login.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        Login instance = new Login();
        instance.setLogin(login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSenha method, of class Login.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getSenha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSenha method, of class Login.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String senha = "";
        Login instance = new Login();
        instance.setSenha(senha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataRegistro method, of class Login.
     */
    @Test
    public void testGetDataRegistro() {
        System.out.println("getDataRegistro");
        Login instance = new Login();
        Date expResult = null;
        Date result = instance.getDataRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataRegistro method, of class Login.
     */
    @Test
    public void testSetDataRegistro() {
        System.out.println("setDataRegistro");
        Date dataRegistro = null;
        Login instance = new Login();
        instance.setDataRegistro(dataRegistro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Login.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Login.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Login instance = new Login();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Login.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Login instance = new Login();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Login.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Login.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Login instance = new Login();
        Serializable expResult = null;
        Serializable result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel method, of class Login.
     */
    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        Login instance = new Login();
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarId method, of class Login.
     */
    @Test
    public void testVerificarId() {
        System.out.println("verificarId");
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.verificarId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMarcado method, of class Login.
     */
    @Test
    public void testIsMarcado() {
        System.out.println("isMarcado");
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.isMarcado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Login.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Login o = null;
        Login instance = new Login();
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
