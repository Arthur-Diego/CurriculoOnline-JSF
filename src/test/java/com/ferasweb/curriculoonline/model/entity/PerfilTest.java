/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.model.entity;

import com.ferasweb.curriculoonline.model.enumerated.EnumEstadoCivil;
import com.ferasweb.curriculoonline.model.enumerated.EnumTipoHabilitacao;
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
public class PerfilTest {
    
    public PerfilTest() {
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
     * Test of getConhecimento method, of class Perfil.
     */
    @Test
    public void testGetConhecimento() {
        System.out.println("getConhecimento");
        Perfil instance = new Perfil();
        Conhecimento expResult = null;
        Conhecimento result = instance.getConhecimento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConhecimento method, of class Perfil.
     */
    @Test
    public void testSetConhecimento() {
        System.out.println("setConhecimento");
        Conhecimento conhecimento = null;
        Perfil instance = new Perfil();
        instance.setConhecimento(conhecimento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoHabilitacao method, of class Perfil.
     */
    @Test
    public void testGetTipoHabilitacao() {
        System.out.println("getTipoHabilitacao");
        Perfil instance = new Perfil();
        EnumTipoHabilitacao expResult = null;
        EnumTipoHabilitacao result = instance.getTipoHabilitacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoHabilitacao method, of class Perfil.
     */
    @Test
    public void testSetTipoHabilitacao() {
        System.out.println("setTipoHabilitacao");
        EnumTipoHabilitacao tipoHabilitacao = null;
        Perfil instance = new Perfil();
        instance.setTipoHabilitacao(tipoHabilitacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerfilCod method, of class Perfil.
     */
    @Test
    public void testGetPerfilCod() {
        System.out.println("getPerfilCod");
        Perfil instance = new Perfil();
        Integer expResult = null;
        Integer result = instance.getPerfilCod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPerfilCod method, of class Perfil.
     */
    @Test
    public void testSetPerfilCod() {
        System.out.println("setPerfilCod");
        Integer perfilCod = null;
        Perfil instance = new Perfil();
        instance.setPerfilCod(perfilCod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Perfil.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Perfil instance = new Perfil();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Perfil.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Perfil instance = new Perfil();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadoCivil method, of class Perfil.
     */
    @Test
    public void testGetEstadoCivil() {
        System.out.println("getEstadoCivil");
        Perfil instance = new Perfil();
        EnumEstadoCivil expResult = null;
        EnumEstadoCivil result = instance.getEstadoCivil();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstadoCivil method, of class Perfil.
     */
    @Test
    public void testSetEstadoCivil() {
        System.out.println("setEstadoCivil");
        EnumEstadoCivil estadoCivil = null;
        Perfil instance = new Perfil();
        instance.setEstadoCivil(estadoCivil);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdade method, of class Perfil.
     */
    @Test
    public void testGetIdade() {
        System.out.println("getIdade");
        Perfil instance = new Perfil();
        Integer expResult = null;
        Integer result = instance.getIdade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdade method, of class Perfil.
     */
    @Test
    public void testSetIdade() {
        System.out.println("setIdade");
        Integer idade = null;
        Perfil instance = new Perfil();
        instance.setIdade(idade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefone method, of class Perfil.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        Perfil instance = new Perfil();
        String expResult = "";
        String result = instance.getTelefone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefone method, of class Perfil.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        String telefone = "";
        Perfil instance = new Perfil();
        instance.setTelefone(telefone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFoto method, of class Perfil.
     */
    @Test
    public void testGetFoto() {
        System.out.println("getFoto");
        Perfil instance = new Perfil();
        byte[] expResult = null;
        byte[] result = instance.getFoto();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFoto method, of class Perfil.
     */
    @Test
    public void testSetFoto() {
        System.out.println("setFoto");
        byte[] foto = null;
        Perfil instance = new Perfil();
        instance.setFoto(foto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Perfil.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Perfil instance = new Perfil();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Perfil.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Perfil instance = new Perfil();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndereco method, of class Perfil.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        Perfil instance = new Perfil();
        Endereco expResult = null;
        Endereco result = instance.getEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndereco method, of class Perfil.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        Endereco endereco = null;
        Perfil instance = new Perfil();
        instance.setEndereco(endereco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogin method, of class Perfil.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Perfil instance = new Perfil();
        Login expResult = null;
        Login result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogin method, of class Perfil.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        Login login = null;
        Perfil instance = new Perfil();
        instance.setLogin(login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCurriculoComOuSemFoto method, of class Perfil.
     */
    @Test
    public void testIsCurriculoComOuSemFoto() {
        System.out.println("isCurriculoComOuSemFoto");
        Perfil instance = new Perfil();
        boolean expResult = false;
        boolean result = instance.isCurriculoComOuSemFoto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurriculoComOuSemFoto method, of class Perfil.
     */
    @Test
    public void testSetCurriculoComOuSemFoto() {
        System.out.println("setCurriculoComOuSemFoto");
        boolean curriculoComOuSemFoto = false;
        Perfil instance = new Perfil();
        instance.setCurriculoComOuSemFoto(curriculoComOuSemFoto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Perfil.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Perfil instance = new Perfil();
        Serializable expResult = null;
        Serializable result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel method, of class Perfil.
     */
    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        Perfil instance = new Perfil();
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarId method, of class Perfil.
     */
    @Test
    public void testVerificarId() {
        System.out.println("verificarId");
        Perfil instance = new Perfil();
        boolean expResult = false;
        boolean result = instance.verificarId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMarcado method, of class Perfil.
     */
    @Test
    public void testIsMarcado() {
        System.out.println("isMarcado");
        Perfil instance = new Perfil();
        boolean expResult = false;
        boolean result = instance.isMarcado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Perfil.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Perfil o = null;
        Perfil instance = new Perfil();
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Perfil.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Perfil instance = new Perfil();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Perfil.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Perfil instance = new Perfil();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
