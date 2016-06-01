/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.model.entity;

import com.ferasweb.curriculoonline.model.enumerated.EnumTipoFormacao;
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
public class FormacaoTest {
    
    public FormacaoTest() {
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
     * Test of getFormacaoCod method, of class Formacao.
     */
    @Test
    public void testGetFormacaoCod() {
        System.out.println("getFormacaoCod");
        Formacao instance = new Formacao();
        Integer expResult = null;
        Integer result = instance.getFormacaoCod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFormacaoCod method, of class Formacao.
     */
    @Test
    public void testSetFormacaoCod() {
        System.out.println("setFormacaoCod");
        Integer formacaoCod = null;
        Formacao instance = new Formacao();
        instance.setFormacaoCod(formacaoCod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoFormacao method, of class Formacao.
     */
    @Test
    public void testGetTipoFormacao() {
        System.out.println("getTipoFormacao");
        Formacao instance = new Formacao();
        EnumTipoFormacao expResult = null;
        EnumTipoFormacao result = instance.getTipoFormacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoFormacao method, of class Formacao.
     */
    @Test
    public void testSetTipoFormacao() {
        System.out.println("setTipoFormacao");
        EnumTipoFormacao tipoFormacao = null;
        Formacao instance = new Formacao();
        instance.setTipoFormacao(tipoFormacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurso method, of class Formacao.
     */
    @Test
    public void testGetCurso() {
        System.out.println("getCurso");
        Formacao instance = new Formacao();
        String expResult = "";
        String result = instance.getCurso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurso method, of class Formacao.
     */
    @Test
    public void testSetCurso() {
        System.out.println("setCurso");
        String curso = "";
        Formacao instance = new Formacao();
        instance.setCurso(curso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstituicao method, of class Formacao.
     */
    @Test
    public void testGetInstituicao() {
        System.out.println("getInstituicao");
        Formacao instance = new Formacao();
        String expResult = "";
        String result = instance.getInstituicao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInstituicao method, of class Formacao.
     */
    @Test
    public void testSetInstituicao() {
        System.out.println("setInstituicao");
        String instituicao = "";
        Formacao instance = new Formacao();
        instance.setInstituicao(instituicao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Formacao.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Formacao instance = new Formacao();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Formacao.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Formacao instance = new Formacao();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Formacao.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Formacao instance = new Formacao();
        Serializable expResult = null;
        Serializable result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel method, of class Formacao.
     */
    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        Formacao instance = new Formacao();
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarId method, of class Formacao.
     */
    @Test
    public void testVerificarId() {
        System.out.println("verificarId");
        Formacao instance = new Formacao();
        boolean expResult = false;
        boolean result = instance.verificarId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMarcado method, of class Formacao.
     */
    @Test
    public void testIsMarcado() {
        System.out.println("isMarcado");
        Formacao instance = new Formacao();
        boolean expResult = false;
        boolean result = instance.isMarcado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Formacao.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Formacao o = null;
        Formacao instance = new Formacao();
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
