/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.model.dao.commons;

import com.ferasweb.curriculoonline.model.commons.EntityInterface;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.validation.ConstraintViolation;
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
public class AbstractEntityBeansTest {
    
    public AbstractEntityBeansTest() {
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
     * Test of getMapParams method, of class AbstractEntityBeans.
     */
    @Test
    public void testGetMapParams() {
        System.out.println("getMapParams");
        Map<String, Object> expResult = null;
        Map<String, Object> result = AbstractEntityBeans.getMapParams();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntityManager method, of class AbstractEntityBeans.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        AbstractEntityBeans instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class AbstractEntityBeans.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        AbstractEntityBeans instance = null;
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class AbstractEntityBeans.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Object entity = null;
        AbstractEntityBeans instance = null;
        instance.create((EntityInterface) entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AbstractEntityBeans.
     */
    @Test
    public void testUpdate_GenericType() throws Exception {
        System.out.println("update");
        Object entity = null;
        AbstractEntityBeans instance = null;
        instance.update((EntityInterface) entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class AbstractEntityBeans.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        Object entity = null;
        AbstractEntityBeans instance = null;
        instance.remove((EntityInterface) entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class AbstractEntityBeans.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Object id = null;
        AbstractEntityBeans instance = null;
        Object expResult = null;
        Object result = instance.find((Serializable) id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class AbstractEntityBeans.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        AbstractEntityBeans instance = null;
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class AbstractEntityBeans.
     */
    @Test
    public void testFindRange() {
        System.out.println("findRange");
        int[] range = null;
        AbstractEntityBeans instance = null;
        List expResult = null;
        List result = instance.findRange(range);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class AbstractEntityBeans.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        AbstractEntityBeans instance = null;
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listPesq method, of class AbstractEntityBeans.
     */
    @Test
    public void testListPesq() {
        System.out.println("listPesq");
        String namedQuery = "";
        AbstractEntityBeans instance = null;
        List expResult = null;
        List result = instance.listPesq(namedQuery);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listPesqParam method, of class AbstractEntityBeans.
     */
    @Test
    public void testListPesqParam_String_Map() {
        System.out.println("listPesqParam");
        String namedQuery = "";
        Map<String, Object> params = null;
        AbstractEntityBeans instance = null;
        List expResult = null;
        List result = instance.listPesqParam(namedQuery, params);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listPesqParamRange method, of class AbstractEntityBeans.
     */
    @Test
    public void testListPesqParamRange() {
        System.out.println("listPesqParamRange");
        String namedQuery = "";
        Map<String, Object> params = null;
        int max = 0;
        int atual = 0;
        AbstractEntityBeans instance = null;
        List expResult = null;
        List result = instance.listPesqParamRange(namedQuery, params, max, atual);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AbstractEntityBeans.
     */
    @Test
    public void testUpdate_String_Map() throws Exception {
        System.out.println("update");
        String namedQuery = "";
        Map<String, Object> params = null;
        AbstractEntityBeans instance = null;
        instance.update(namedQuery, params);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listPesqParam method, of class AbstractEntityBeans.
     */
    @Test
    public void testListPesqParam_4args() {
        System.out.println("listPesqParam");
        String namedQuery = "";
        Map<String, Object> params = null;
        int max = 0;
        int atual = 0;
        AbstractEntityBeans instance = null;
        List expResult = null;
        List result = instance.listPesqParam(namedQuery, params, max, atual);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesqParam method, of class AbstractEntityBeans.
     */
    @Test
    public void testPesqParam_String_Map() {
        System.out.println("pesqParam");
        String namedQuery = "";
        Map<String, Object> params = null;
        AbstractEntityBeans instance = null;
        Object expResult = null;
        Object result = instance.pesqParam(namedQuery, params);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesqParam method, of class AbstractEntityBeans.
     */
    @Test
    public void testPesqParam_String() {
        System.out.println("pesqParam");
        String namedQuery = "";
        AbstractEntityBeans instance = null;
        Object expResult = null;
        Object result = instance.pesqParam(namedQuery);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesqCount method, of class AbstractEntityBeans.
     */
    @Test
    public void testPesqCount() {
        System.out.println("pesqCount");
        String namedQuery = "";
        Map<String, Object> params = null;
        AbstractEntityBeans instance = null;
        Long expResult = null;
        Long result = instance.pesqCount(namedQuery, params);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validadionException method, of class AbstractEntityBeans.
     */
    @Test
    public void testValidadionException() throws Exception {
        System.out.println("validadionException");
        Set<ConstraintViolation<?>> erros = null;
        AbstractEntityBeans instance = null;
        instance.validadionException(erros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarEntity method, of class AbstractEntityBeans.
     */
    @Test
    public void testValidarEntity() throws Exception {
        System.out.println("validarEntity");
        EntityInterface entity = null;
        AbstractEntityBeans instance = null;
        instance.validarEntity(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AbstractEntityBeansImpl extends AbstractEntityBeans {

        public AbstractEntityBeansImpl() {
            super(null, null);
        }

        public EntityManager getEntityManager() {
            return null;
        }
    }
    
}
