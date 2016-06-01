/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.model.entity;

import java.io.Serializable;
import java.util.Date;
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
public class ExperienciaTest {
    
    public ExperienciaTest() {
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
     * Test of getExperienciaCod method, of class Experiencia.
     */
    @Test
    public void testGetExperienciaCod() {
        System.out.println("getExperienciaCod");
        Experiencia instance = new Experiencia();
        Integer expResult = null;
        Integer result = instance.getExperienciaCod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExperienciaCod method, of class Experiencia.
     */
    @Test
    public void testSetExperienciaCod() {
        System.out.println("setExperienciaCod");
        Integer experienciaCod = null;
        Experiencia instance = new Experiencia();
        instance.setExperienciaCod(experienciaCod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmpresa method, of class Experiencia.
     */
    @Test
    public void testGetEmpresa() {
        System.out.println("getEmpresa");
        Experiencia instance = new Experiencia();
        String expResult = "";
        String result = instance.getEmpresa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmpresa method, of class Experiencia.
     */
    @Test
    public void testSetEmpresa() {
        System.out.println("setEmpresa");
        String empresa = "";
        Experiencia instance = new Experiencia();
        instance.setEmpresa(empresa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataInicio method, of class Experiencia.
     */
    @Test
    public void testGetDataInicio() {
        System.out.println("getDataInicio");
        Experiencia instance = new Experiencia();
        Date expResult = null;
        Date result = instance.getDataInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataInicio method, of class Experiencia.
     */
    @Test
    public void testSetDataInicio() {
        System.out.println("setDataInicio");
        Date dataInicio = null;
        Experiencia instance = new Experiencia();
        instance.setDataInicio(dataInicio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataFinal method, of class Experiencia.
     */
    @Test
    public void testGetDataFinal() {
        System.out.println("getDataFinal");
        Experiencia instance = new Experiencia();
        Date expResult = null;
        Date result = instance.getDataFinal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataFinal method, of class Experiencia.
     */
    @Test
    public void testSetDataFinal() {
        System.out.println("setDataFinal");
        Date dataFinal = null;
        Experiencia instance = new Experiencia();
        instance.setDataFinal(dataFinal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescExperiencia method, of class Experiencia.
     */
    @Test
    public void testGetDescExperiencia() {
        System.out.println("getDescExperiencia");
        Experiencia instance = new Experiencia();
        String expResult = "";
        String result = instance.getDescExperiencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescExperiencia method, of class Experiencia.
     */
    @Test
    public void testSetDescExperiencia() {
        System.out.println("setDescExperiencia");
        String descExperiencia = "";
        Experiencia instance = new Experiencia();
        instance.setDescExperiencia(descExperiencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Experiencia.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Experiencia instance = new Experiencia();
        Serializable expResult = null;
        Serializable result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel method, of class Experiencia.
     */
    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        Experiencia instance = new Experiencia();
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarId method, of class Experiencia.
     */
    @Test
    public void testVerificarId() {
        System.out.println("verificarId");
        Experiencia instance = new Experiencia();
        boolean expResult = false;
        boolean result = instance.verificarId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMarcado method, of class Experiencia.
     */
    @Test
    public void testIsMarcado() {
        System.out.println("isMarcado");
        Experiencia instance = new Experiencia();
        boolean expResult = false;
        boolean result = instance.isMarcado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Experiencia.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Experiencia o = null;
        Experiencia instance = new Experiencia();
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Experiencia.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Experiencia instance = new Experiencia();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Experiencia.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Experiencia instance = new Experiencia();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
