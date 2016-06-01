/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.model.entity;

import java.io.Serializable;
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
public class InformacaoAdicionalTest {
    
    public InformacaoAdicionalTest() {
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
     * Test of getInformCod method, of class InformacaoAdicional.
     */
    @Test
    public void testGetInformCod() {
        System.out.println("getInformCod");
        InformacaoAdicional instance = new InformacaoAdicional();
        Integer expResult = null;
        Integer result = instance.getInformCod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInformCod method, of class InformacaoAdicional.
     */
    @Test
    public void testSetInformCod() {
        System.out.println("setInformCod");
        Integer informCod = null;
        InformacaoAdicional instance = new InformacaoAdicional();
        instance.setInformCod(informCod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInformacao method, of class InformacaoAdicional.
     */
    @Test
    public void testGetInformacao() {
        System.out.println("getInformacao");
        InformacaoAdicional instance = new InformacaoAdicional();
        String expResult = "";
        String result = instance.getInformacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInformacao method, of class InformacaoAdicional.
     */
    @Test
    public void testSetInformacao() {
        System.out.println("setInformacao");
        String informacao = "";
        InformacaoAdicional instance = new InformacaoAdicional();
        instance.setInformacao(informacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class InformacaoAdicional.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        InformacaoAdicional instance = new InformacaoAdicional();
        Serializable expResult = null;
        Serializable result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel method, of class InformacaoAdicional.
     */
    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        InformacaoAdicional instance = new InformacaoAdicional();
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarId method, of class InformacaoAdicional.
     */
    @Test
    public void testVerificarId() {
        System.out.println("verificarId");
        InformacaoAdicional instance = new InformacaoAdicional();
        boolean expResult = false;
        boolean result = instance.verificarId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMarcado method, of class InformacaoAdicional.
     */
    @Test
    public void testIsMarcado() {
        System.out.println("isMarcado");
        InformacaoAdicional instance = new InformacaoAdicional();
        boolean expResult = false;
        boolean result = instance.isMarcado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class InformacaoAdicional.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        InformacaoAdicional o = null;
        InformacaoAdicional instance = new InformacaoAdicional();
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class InformacaoAdicional.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        InformacaoAdicional instance = new InformacaoAdicional();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class InformacaoAdicional.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        InformacaoAdicional instance = new InformacaoAdicional();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
