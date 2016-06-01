/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.utils;

import com.ferasweb.curriculoonline.model.commons.EntityInterface;
import java.io.File;
import java.util.List;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
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
public class JsfUtilTest {
    
    public JsfUtilTest() {
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
     * Test of downloadFile method, of class JsfUtil.
     */
    @Test
    public void testDownloadFile() {
        System.out.println("downloadFile");
        File file = null;
        FacesContext facesContext = null;
        JsfUtil.downloadFile(file, facesContext);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gerarUrlToDownload method, of class JsfUtil.
     */
    @Test
    public void testGerarUrlToDownload() {
        System.out.println("gerarUrlToDownload");
        FacesContext facesContext = null;
        String caminhoArquivo = "";
        String nomeArquivo = "";
        String expResult = "";
        String result = JsfUtil.gerarUrlToDownload(facesContext, caminhoArquivo, nomeArquivo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectItemsComparable method, of class JsfUtil.
     */
    @Test
    public void testGetSelectItemsComparable() {
        System.out.println("getSelectItemsComparable");
        List<? extends Comparable> entities = null;
        boolean selectOne = false;
        FacesContext contex = null;
        SelectItem[] expResult = null;
        SelectItem[] result = JsfUtil.getSelectItemsComparable(entities, selectOne, contex);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectItems method, of class JsfUtil.
     */
    @Test
    public void testGetSelectItems() {
        System.out.println("getSelectItems");
        List<? extends EntityInterface> entities = null;
        boolean selectOne = false;
        FacesContext contex = null;
        SelectItem[] expResult = null;
        SelectItem[] result = JsfUtil.getSelectItems(entities, selectOne, contex);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnumSelectItems method, of class JsfUtil.
     */
    @Test
    public void testGetEnumSelectItems() {
        System.out.println("getEnumSelectItems");
        Class<? extends Enum> enumm = null;
        boolean selectOne = false;
        FacesContext contex = null;
        SelectItem[] expResult = null;
        SelectItem[] result = JsfUtil.getEnumSelectItems(enumm, selectOne, contex);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getController method, of class JsfUtil.
     */
    @Test
    public void testGetController() {
        System.out.println("getController");
        String controlerName = "";
        FacesContext facesContext = null;
        Object expResult = null;
        Object result = JsfUtil.getController(controlerName, facesContext);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
