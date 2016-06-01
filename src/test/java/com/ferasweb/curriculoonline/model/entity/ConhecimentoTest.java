/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.model.entity;

import java.io.Serializable;
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
public class ConhecimentoTest {
    
    public ConhecimentoTest() {
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
     * Test of getPerfil method, of class Conhecimento.
     */
    @Test
    public void testGetPerfil() {
        System.out.println("getPerfil");
        Conhecimento instance = new Conhecimento();
        Perfil expResult = null;
        Perfil result = instance.getPerfil();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPerfil method, of class Conhecimento.
     */
    @Test
    public void testSetPerfil() {
        System.out.println("setPerfil");
        Perfil perfil = null;
        Conhecimento instance = new Conhecimento();
        instance.setPerfil(perfil);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConhecimentoCod method, of class Conhecimento.
     */
    @Test
    public void testGetConhecimentoCod() {
        System.out.println("getConhecimentoCod");
        Conhecimento instance = new Conhecimento();
        Integer expResult = null;
        Integer result = instance.getConhecimentoCod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConhecimentoCod method, of class Conhecimento.
     */
    @Test
    public void testSetConhecimentoCod() {
        System.out.println("setConhecimentoCod");
        Integer conhecimentoCod = null;
        Conhecimento instance = new Conhecimento();
        instance.setConhecimentoCod(conhecimentoCod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjetivo method, of class Conhecimento.
     */
    @Test
    public void testGetObjetivo() {
        System.out.println("getObjetivo");
        Conhecimento instance = new Conhecimento();
        String expResult = "";
        String result = instance.getObjetivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjetivo method, of class Conhecimento.
     */
    @Test
    public void testSetObjetivo() {
        System.out.println("setObjetivo");
        String objetivo = "";
        Conhecimento instance = new Conhecimento();
        instance.setObjetivo(objetivo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFormacao method, of class Conhecimento.
     */
    @Test
    public void testGetFormacao() {
        System.out.println("getFormacao");
        Conhecimento instance = new Conhecimento();
        List<Formacao> expResult = null;
        List<Formacao> result = instance.getFormacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFormacao method, of class Conhecimento.
     */
    @Test
    public void testSetFormacao() {
        System.out.println("setFormacao");
        List<Formacao> formacao = null;
        Conhecimento instance = new Conhecimento();
        instance.setFormacao(formacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExperiencia method, of class Conhecimento.
     */
    @Test
    public void testGetExperiencia() {
        System.out.println("getExperiencia");
        Conhecimento instance = new Conhecimento();
        List<Experiencia> expResult = null;
        List<Experiencia> result = instance.getExperiencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExperiencia method, of class Conhecimento.
     */
    @Test
    public void testSetExperiencia() {
        System.out.println("setExperiencia");
        List<Experiencia> experiencia = null;
        Conhecimento instance = new Conhecimento();
        instance.setExperiencia(experiencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQualificacao method, of class Conhecimento.
     */
    @Test
    public void testGetQualificacao() {
        System.out.println("getQualificacao");
        Conhecimento instance = new Conhecimento();
        List<Qualificacao> expResult = null;
        List<Qualificacao> result = instance.getQualificacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQualificacao method, of class Conhecimento.
     */
    @Test
    public void testSetQualificacao() {
        System.out.println("setQualificacao");
        List<Qualificacao> qualificacao = null;
        Conhecimento instance = new Conhecimento();
        instance.setQualificacao(qualificacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInformacao method, of class Conhecimento.
     */
    @Test
    public void testGetInformacao() {
        System.out.println("getInformacao");
        Conhecimento instance = new Conhecimento();
        List<InformacaoAdicional> expResult = null;
        List<InformacaoAdicional> result = instance.getInformacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInformacao method, of class Conhecimento.
     */
    @Test
    public void testSetInformacao() {
        System.out.println("setInformacao");
        List<InformacaoAdicional> informacao = null;
        Conhecimento instance = new Conhecimento();
        instance.setInformacao(informacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Conhecimento.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Conhecimento instance = new Conhecimento();
        Serializable expResult = null;
        Serializable result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel method, of class Conhecimento.
     */
    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        Conhecimento instance = new Conhecimento();
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarId method, of class Conhecimento.
     */
    @Test
    public void testVerificarId() {
        System.out.println("verificarId");
        Conhecimento instance = new Conhecimento();
        boolean expResult = false;
        boolean result = instance.verificarId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMarcado method, of class Conhecimento.
     */
    @Test
    public void testIsMarcado() {
        System.out.println("isMarcado");
        Conhecimento instance = new Conhecimento();
        boolean expResult = false;
        boolean result = instance.isMarcado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Conhecimento.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Conhecimento o = null;
        Conhecimento instance = new Conhecimento();
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Conhecimento.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Conhecimento instance = new Conhecimento();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Conhecimento.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Conhecimento instance = new Conhecimento();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
