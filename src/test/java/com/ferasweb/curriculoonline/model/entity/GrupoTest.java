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
public class GrupoTest {
    
    public GrupoTest() {
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
     * Test of getGrupoCod method, of class Grupo.
     */
    @Test
    public void testGetGrupoCod() {
        System.out.println("getGrupoCod");
        Grupo instance = new Grupo();
        Integer expResult = null;
        Integer result = instance.getGrupoCod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrupoCod method, of class Grupo.
     */
    @Test
    public void testSetGrupoCod() {
        System.out.println("setGrupoCod");
        Integer grupoCod = null;
        Grupo instance = new Grupo();
        instance.setGrupoCod(grupoCod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescricao method, of class Grupo.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        Grupo instance = new Grupo();
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescricao method, of class Grupo.
     */
    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String descricao = "";
        Grupo instance = new Grupo();
        instance.setDescricao(descricao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Grupo.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Grupo instance = new Grupo();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Grupo.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Grupo instance = new Grupo();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Grupo.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Grupo instance = new Grupo();
        Serializable expResult = null;
        Serializable result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel method, of class Grupo.
     */
    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        Grupo instance = new Grupo();
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarId method, of class Grupo.
     */
    @Test
    public void testVerificarId() {
        System.out.println("verificarId");
        Grupo instance = new Grupo();
        boolean expResult = false;
        boolean result = instance.verificarId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMarcado method, of class Grupo.
     */
    @Test
    public void testIsMarcado() {
        System.out.println("isMarcado");
        Grupo instance = new Grupo();
        boolean expResult = false;
        boolean result = instance.isMarcado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Grupo.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Grupo o = null;
        Grupo instance = new Grupo();
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
