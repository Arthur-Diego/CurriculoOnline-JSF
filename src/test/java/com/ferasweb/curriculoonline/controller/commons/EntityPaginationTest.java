/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.controller.commons;

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
public class EntityPaginationTest {
    
    public EntityPaginationTest() {
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
     * Test of getItemsCount method, of class EntityPagination.
     */
    @Test
    public void testGetItemsCount() {
        System.out.println("getItemsCount");
        EntityPagination instance = new EntityPaginationImpl();
        int expResult = 0;
        int result = instance.getItemsCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createPageDataModel method, of class EntityPagination.
     */
    @Test
    public void testCreatePageDataModel() {
        System.out.println("createPageDataModel");
        EntityPagination instance = new EntityPaginationImpl();
        DataModel expResult = null;
        DataModel result = instance.createPageDataModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPageFirstItem method, of class EntityPagination.
     */
    @Test
    public void testGetPageFirstItem() {
        System.out.println("getPageFirstItem");
        EntityPagination instance = new EntityPaginationImpl();
        int expResult = 0;
        int result = instance.getPageFirstItem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPageLastItem method, of class EntityPagination.
     */
    @Test
    public void testGetPageLastItem() {
        System.out.println("getPageLastItem");
        EntityPagination instance = new EntityPaginationImpl();
        int expResult = 0;
        int result = instance.getPageLastItem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHasNextPage method, of class EntityPagination.
     */
    @Test
    public void testIsHasNextPage() {
        System.out.println("isHasNextPage");
        EntityPagination instance = new EntityPaginationImpl();
        boolean expResult = false;
        boolean result = instance.isHasNextPage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextPage method, of class EntityPagination.
     */
    @Test
    public void testNextPage() {
        System.out.println("nextPage");
        EntityPagination instance = new EntityPaginationImpl();
        instance.nextPage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHasPreviousPage method, of class EntityPagination.
     */
    @Test
    public void testIsHasPreviousPage() {
        System.out.println("isHasPreviousPage");
        EntityPagination instance = new EntityPaginationImpl();
        boolean expResult = false;
        boolean result = instance.isHasPreviousPage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of previousPage method, of class EntityPagination.
     */
    @Test
    public void testPreviousPage() {
        System.out.println("previousPage");
        EntityPagination instance = new EntityPaginationImpl();
        instance.previousPage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPageSize method, of class EntityPagination.
     */
    @Test
    public void testGetPageSize() {
        System.out.println("getPageSize");
        EntityPagination instance = new EntityPaginationImpl();
        int expResult = 0;
        int result = instance.getPageSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class EntityPaginationImpl extends EntityPagination {

        public int getItemsCount() {
            return 0;
        }

        public DataModel createPageDataModel() {
            return null;
        }
    }
    
}
