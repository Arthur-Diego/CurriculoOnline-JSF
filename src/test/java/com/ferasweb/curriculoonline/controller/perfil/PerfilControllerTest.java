/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.controller.perfil;

import com.ferasweb.curriculoonline.controller.commons.EntityPagination;
import com.ferasweb.curriculoonline.model.entity.Conhecimento;
import com.ferasweb.curriculoonline.model.entity.Experiencia;
import com.ferasweb.curriculoonline.model.entity.Formacao;
import com.ferasweb.curriculoonline.model.entity.InformacaoAdicional;
import com.ferasweb.curriculoonline.model.entity.Perfil;
import com.ferasweb.curriculoonline.model.entity.Qualificacao;
import com.ferasweb.curriculoonline.model.enumerated.EnumEstadoCivil;
import com.ferasweb.curriculoonline.model.enumerated.EnumTipoFormacao;
import com.ferasweb.curriculoonline.model.enumerated.EnumTipoHabilitacao;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author Andressa
 */
public class PerfilControllerTest {
    
    public PerfilControllerTest() {
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
     * Test of init method, of class PerfilController.
     */
    @Test
    public void testInit() {
//        System.out.println("init");
//        PerfilController instance = new PerfilController();
//        instance.init();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getConhecimento method, of class PerfilController.
     */
    @Test
    public void testGetConhecimento() {
        System.out.println("getConhecimento");
        PerfilController instance = new PerfilController();
        Conhecimento expResult = null;
        Conhecimento result = instance.getConhecimento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConhecimento method, of class PerfilController.
     */
    @Test
    public void testSetConhecimento() {
        System.out.println("setConhecimento");
        Conhecimento conhecimento = null;
        PerfilController instance = new PerfilController();
        instance.setConhecimento(conhecimento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaTipoHabilitacao method, of class PerfilController.
     */
    @Test
    public void testGetListaTipoHabilitacao() {
        System.out.println("getListaTipoHabilitacao");
        PerfilController instance = new PerfilController();
        List<EnumTipoHabilitacao> expResult = null;
        List<EnumTipoHabilitacao> result = instance.getListaTipoHabilitacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaTipoHabilitacao method, of class PerfilController.
     */
    @Test
    public void testSetListaTipoHabilitacao() {
        System.out.println("setListaTipoHabilitacao");
        List<EnumTipoHabilitacao> listaTipoHabilitacao = null;
        PerfilController instance = new PerfilController();
        instance.setListaTipoHabilitacao(listaTipoHabilitacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaFormacao method, of class PerfilController.
     */
    @Test
    public void testGetListaFormacao() {
        System.out.println("getListaFormacao");
        PerfilController instance = new PerfilController();
        List<Formacao> expResult = null;
        List<Formacao> result = instance.getListaFormacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaFormacao method, of class PerfilController.
     */
    @Test
    public void testSetListaFormacao() {
        System.out.println("setListaFormacao");
        List<Formacao> listaFormacao = null;
        PerfilController instance = new PerfilController();
        instance.setListaFormacao(listaFormacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaExperiencia method, of class PerfilController.
     */
    @Test
    public void testGetListaExperiencia() {
        System.out.println("getListaExperiencia");
        PerfilController instance = new PerfilController();
        List<Experiencia> expResult = null;
        List<Experiencia> result = instance.getListaExperiencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaExperiencia method, of class PerfilController.
     */
    @Test
    public void testSetListaExperiencia() {
        System.out.println("setListaExperiencia");
        List<Experiencia> listaExperiencia = null;
        PerfilController instance = new PerfilController();
        instance.setListaExperiencia(listaExperiencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaQualificacao method, of class PerfilController.
     */
    @Test
    public void testGetListaQualificacao() {
        System.out.println("getListaQualificacao");
        PerfilController instance = new PerfilController();
        List<Qualificacao> expResult = null;
        List<Qualificacao> result = instance.getListaQualificacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaQualificacao method, of class PerfilController.
     */
    @Test
    public void testSetListaQualificacao() {
        System.out.println("setListaQualificacao");
        List<Qualificacao> listaQualificacao = null;
        PerfilController instance = new PerfilController();
        instance.setListaQualificacao(listaQualificacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaInformacaoAdicional method, of class PerfilController.
     */
    @Test
    public void testGetListaInformacaoAdicional() {
        System.out.println("getListaInformacaoAdicional");
        PerfilController instance = new PerfilController();
        List<InformacaoAdicional> expResult = null;
        List<InformacaoAdicional> result = instance.getListaInformacaoAdicional();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaInformacaoAdicional method, of class PerfilController.
     */
    @Test
    public void testSetListaInformacaoAdicional() {
        System.out.println("setListaInformacaoAdicional");
        List<InformacaoAdicional> listaInformacaoAdicional = null;
        PerfilController instance = new PerfilController();
        instance.setListaInformacaoAdicional(listaInformacaoAdicional);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrent method, of class PerfilController.
     */
    @Test
    public void testGetCurrent() {
        System.out.println("getCurrent");
        PerfilController instance = new PerfilController();
        Perfil expResult = null;
        Perfil result = instance.getCurrent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrent method, of class PerfilController.
     */
    @Test
    public void testSetCurrent() {
        System.out.println("setCurrent");
        Perfil current = null;
        PerfilController instance = new PerfilController();
        instance.setCurrent(current);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaTipoFormacao method, of class PerfilController.
     */
    @Test
    public void testGetListaTipoFormacao() {
        System.out.println("getListaTipoFormacao");
        PerfilController instance = new PerfilController();
        List<EnumTipoFormacao> expResult = null;
        List<EnumTipoFormacao> result = instance.getListaTipoFormacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaTipoFormacao method, of class PerfilController.
     */
    @Test
    public void testSetListaTipoFormacao() {
        System.out.println("setListaTipoFormacao");
        List<EnumTipoFormacao> listaTipoFormacao = null;
        PerfilController instance = new PerfilController();
        instance.setListaTipoFormacao(listaTipoFormacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaEstadoCivil method, of class PerfilController.
     */
    @Test
    public void testGetListaEstadoCivil() {
        System.out.println("getListaEstadoCivil");
        PerfilController instance = new PerfilController();
        List<EnumEstadoCivil> expResult = null;
        List<EnumEstadoCivil> result = instance.getListaEstadoCivil();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaEstadoCivil method, of class PerfilController.
     */
    @Test
    public void testSetListaEstadoCivil() {
        System.out.println("setListaEstadoCivil");
        List<EnumEstadoCivil> listaEstadoCivil = null;
        PerfilController instance = new PerfilController();
        instance.setListaEstadoCivil(listaEstadoCivil);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFile method, of class PerfilController.
     */
    @Test
    public void testGetFile() {
        System.out.println("getFile");
        PerfilController instance = new PerfilController();
        UploadedFile expResult = null;
        UploadedFile result = instance.getFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFile method, of class PerfilController.
     */
    @Test
    public void testSetFile() {
        System.out.println("setFile");
        UploadedFile file = null;
        PerfilController instance = new PerfilController();
        instance.setFile(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of uploadImagem method, of class PerfilController.
     */
    @Test
    public void testUploadImagem() {
        System.out.println("uploadImagem");
        FileUploadEvent event = null;
        PerfilController instance = new PerfilController();
        instance.uploadImagem(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillConhecimento method, of class PerfilController.
     */
    @Test
    public void testFillConhecimento() {
        System.out.println("fillConhecimento");
        PerfilController instance = new PerfilController();
        instance.fillConhecimento();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addExperiencia method, of class PerfilController.
     */
    @Test
    public void testAddExperiencia() {
        System.out.println("addExperiencia");
        PerfilController instance = new PerfilController();
        instance.addExperiencia();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFormacao method, of class PerfilController.
     */
    @Test
    public void testAddFormacao() {
        System.out.println("addFormacao");
        PerfilController instance = new PerfilController();
        instance.addFormacao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addQualificacao method, of class PerfilController.
     */
    @Test
    public void testAddQualificacao() {
        System.out.println("addQualificacao");
        PerfilController instance = new PerfilController();
        instance.addQualificacao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addInformacaoAdicional method, of class PerfilController.
     */
    @Test
    public void testAddInformacaoAdicional() {
        System.out.println("addInformacaoAdicional");
        PerfilController instance = new PerfilController();
        instance.addInformacaoAdicional();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteExperiencia method, of class PerfilController.
     */
    @Test
    public void testDeleteExperiencia() {
        System.out.println("deleteExperiencia");
        Experiencia experiencia = null;
        PerfilController instance = new PerfilController();
        instance.deleteExperiencia(experiencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFormacao method, of class PerfilController.
     */
    @Test
    public void testDeleteFormacao() {
        System.out.println("deleteFormacao");
        Formacao formacao = null;
        PerfilController instance = new PerfilController();
        instance.deleteFormacao(formacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteQualificacao method, of class PerfilController.
     */
    @Test
    public void testDeleteQualificacao() {
        System.out.println("deleteQualificacao");
        Qualificacao qualificacao = null;
        PerfilController instance = new PerfilController();
        instance.deleteQualificacao(qualificacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteInformacaoAdicional method, of class PerfilController.
     */
    @Test
    public void testDeleteInformacaoAdicional() {
        System.out.println("deleteInformacaoAdicional");
        InformacaoAdicional informacao = null;
        PerfilController instance = new PerfilController();
        instance.deleteInformacaoAdicional(informacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvarPerfil method, of class PerfilController.
     */
    @Test
    public void testSalvarPerfil() {
        System.out.println("salvarPerfil");
        PerfilController instance = new PerfilController();
        instance.salvarPerfil();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarPerfil method, of class PerfilController.
     */
    @Test
    public void testEditarPerfil() {
        System.out.println("editarPerfil");
        PerfilController instance = new PerfilController();
        instance.editarPerfil();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editOrSave method, of class PerfilController.
     */
    @Test
    public void testEditOrSave() {
        System.out.println("editOrSave");
        PerfilController instance = new PerfilController();
        String expResult = "";
        String result = instance.editOrSave();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEntity method, of class PerfilController.
     */
    @Test
    public void testSetEntity() {
        System.out.println("setEntity");
        Perfil t = null;
        PerfilController instance = new PerfilController();
        instance.setEntity(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewEntity method, of class PerfilController.
     */
    @Test
    public void testGetNewEntity() {
        System.out.println("getNewEntity");
        PerfilController instance = new PerfilController();
        Perfil expResult = null;
        Perfil result = instance.getNewEntity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of performDestroy method, of class PerfilController.
     */
    @Test
    public void testPerformDestroy() {
        System.out.println("performDestroy");
        PerfilController instance = new PerfilController();
        instance.performDestroy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class PerfilController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        PerfilController instance = new PerfilController();
        String expResult = "";
        String result = instance.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class PerfilController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        PerfilController instance = new PerfilController();
        String expResult = "";
        String result = instance.update();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPagination method, of class PerfilController.
     */
    @Test
    public void testGetPagination() {
        System.out.println("getPagination");
        PerfilController instance = new PerfilController();
        EntityPagination expResult = null;
        EntityPagination result = instance.getPagination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
