/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.controller.commons;

import com.ferasweb.curriculoonline.model.commons.EntityInterface;
import javax.faces.model.DataModel;
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
public class EntityControllerTest {
    
    public EntityControllerTest() {
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
     * Test of setEntity method, of class EntityController.
     */
    @Test
    public void testSetEntity() {
        System.out.println("setEntity");
        Object t = null;
        EntityController instance = new EntityControllerImpl();
        instance.setEntity((EntityInterface) t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewEntity method, of class EntityController.
     */
    @Test
    public void testGetNewEntity() {
        System.out.println("getNewEntity");
        EntityController instance = new EntityControllerImpl();
        Object expResult = null;
        Object result = instance.getNewEntity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of performDestroy method, of class EntityController.
     */
    @Test
    public void testPerformDestroy() {
        System.out.println("performDestroy");
        EntityController instance = new EntityControllerImpl();
        instance.performDestroy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class EntityController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        EntityController instance = new EntityControllerImpl();
        String expResult = "";
        String result = instance.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class EntityController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        EntityController instance = new EntityControllerImpl();
        String expResult = "";
        String result = instance.update();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPagination method, of class EntityController.
     */
    @Test
    public void testGetPagination() {
        System.out.println("getPagination");
        EntityController instance = new EntityControllerImpl();
        EntityPagination expResult = null;
        EntityPagination result = instance.getPagination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clean method, of class EntityController.
     */
    @Test
    public void testClean() {
        System.out.println("clean");
        EntityController instance = new EntityControllerImpl();
        String expResult = "";
        String result = instance.clean();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisar method, of class EntityController.
     */
    @Test
    public void testPesquisar() {
        System.out.println("pesquisar");
        EntityController instance = new EntityControllerImpl();
        instance.pesquisar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class EntityController.
     */
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        EntityController instance = new EntityControllerImpl();
        instance.destroy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareCreate method, of class EntityController.
     */
    @Test
    public void testPrepareCreate() {
        System.out.println("prepareCreate");
        EntityController instance = new EntityControllerImpl();
        instance.prepareCreate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareEdit method, of class EntityController.
     */
    @Test
    public void testPrepareEdit() {
        System.out.println("prepareEdit");
        EntityController instance = new EntityControllerImpl();
        String expResult = "";
        String result = instance.prepareEdit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createOrEdit method, of class EntityController.
     */
    @Test
    public void testCreateOrEdit() {
        System.out.println("createOrEdit");
        EntityController instance = new EntityControllerImpl();
        instance.createOrEdit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItems method, of class EntityController.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        EntityController instance = new EntityControllerImpl();
        DataModel expResult = null;
        DataModel result = instance.getItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recreateTable method, of class EntityController.
     */
    @Test
    public void testRecreateTable() {
        System.out.println("recreateTable");
        EntityController instance = new EntityControllerImpl();
        instance.recreateTable();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class EntityController.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        EntityController instance = new EntityControllerImpl();
        String expResult = "";
        String result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of previous method, of class EntityController.
     */
    @Test
    public void testPrevious() {
        System.out.println("previous");
        EntityController instance = new EntityControllerImpl();
        String expResult = "";
        String result = instance.previous();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recreateModel method, of class EntityController.
     */
    @Test
    public void testRecreateModel() {
        System.out.println("recreateModel");
        EntityController instance = new EntityControllerImpl();
        instance.recreateModel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recreatePagination method, of class EntityController.
     */
    @Test
    public void testRecreatePagination() {
        System.out.println("recreatePagination");
        EntityController instance = new EntityControllerImpl();
        instance.recreatePagination();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class EntityControllerImpl extends EntityController {

//        public void setEntity(T t) {
//        }
//
//        public T getNewEntity() {
//            return null;
//        }

        public void performDestroy() {
        }

        public String create() {
            return "";
        }

        public String update() {
            return "";
        }

        public EntityPagination getPagination() {
            return null;
        }

        @Override
        protected void setEntity(EntityInterface t) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        protected EntityInterface getNewEntity() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

//    public class EntityControllerImpl extends EntityController {
//
//        public void setEntity(T t) {
//        }
//
//        public T getNewEntity() {
//            return null;
//        }
//
//        public void performDestroy() {
//        }
//
//        public String create() {
//            return "";
//        }
//
//        public String update() {
//            return "";
//        }
//
//        public EntityPagination getPagination() {
//            return null;
//        }
//    }
//    
}
