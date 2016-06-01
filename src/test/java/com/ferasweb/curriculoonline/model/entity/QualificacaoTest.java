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
public class QualificacaoTest {
    
    public QualificacaoTest() {
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
     * Test of getQualificacaoCod method, of class Qualificacao.
     */
    @Test
    public void testGetQualificacaoCod() {
        System.out.println("getQualificacaoCod");
        Qualificacao instance = new Qualificacao();
        Integer expResult = null;
        Integer result = instance.getQualificacaoCod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQualificacaoCod method, of class Qualificacao.
     */
    @Test
    public void testSetQualificacaoCod() {
        System.out.println("setQualificacaoCod");
        Integer qualificacaoCod = null;
        Qualificacao instance = new Qualificacao();
        instance.setQualificacaoCod(qualificacaoCod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCursoPalestras method, of class Qualificacao.
     */
    @Test
    public void testGetCursoPalestras() {
        System.out.println("getCursoPalestras");
        Qualificacao instance = new Qualificacao();
        String expResult = "";
        String result = instance.getCursoPalestras();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCursoPalestras method, of class Qualificacao.
     */
    @Test
    public void testSetCursoPalestras() {
        System.out.println("setCursoPalestras");
        String cursoPalestras = "";
        Qualificacao instance = new Qualificacao();
        instance.setCursoPalestras(cursoPalestras);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnoTerminio method, of class Qualificacao.
     */
    @Test
    public void testGetAnoTerminio() {
        System.out.println("getAnoTerminio");
        Qualificacao instance = new Qualificacao();
        String expResult = "";
        String result = instance.getAnoTerminio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnoTerminio method, of class Qualificacao.
     */
    @Test
    public void testSetAnoTerminio() {
        System.out.println("setAnoTerminio");
        String anoTerminio = "";
        Qualificacao instance = new Qualificacao();
        instance.setAnoTerminio(anoTerminio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCargaHoraria method, of class Qualificacao.
     */
    @Test
    public void testGetCargaHoraria() {
        System.out.println("getCargaHoraria");
        Qualificacao instance = new Qualificacao();
        String expResult = "";
        String result = instance.getCargaHoraria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCargaHoraria method, of class Qualificacao.
     */
    @Test
    public void testSetCargaHoraria() {
        System.out.println("setCargaHoraria");
        String cargaHoraria = "";
        Qualificacao instance = new Qualificacao();
        instance.setCargaHoraria(cargaHoraria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Qualificacao.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Qualificacao instance = new Qualificacao();
        Serializable expResult = null;
        Serializable result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel method, of class Qualificacao.
     */
    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        Qualificacao instance = new Qualificacao();
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarId method, of class Qualificacao.
     */
    @Test
    public void testVerificarId() {
        System.out.println("verificarId");
        Qualificacao instance = new Qualificacao();
        boolean expResult = false;
        boolean result = instance.verificarId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMarcado method, of class Qualificacao.
     */
    @Test
    public void testIsMarcado() {
        System.out.println("isMarcado");
        Qualificacao instance = new Qualificacao();
        boolean expResult = false;
        boolean result = instance.isMarcado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Qualificacao.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Qualificacao o = null;
        Qualificacao instance = new Qualificacao();
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Qualificacao.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Qualificacao instance = new Qualificacao();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Qualificacao.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Qualificacao instance = new Qualificacao();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
