/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.model.commons;

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
public class EntityInterfaceTest {
    
    public EntityInterfaceTest() {
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
     * Test of getId method, of class EntityInterface.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        EntityInterface instance = new EntityInterfaceImpl();
        Serializable expResult = null;
        Serializable result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel method, of class EntityInterface.
     */
    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        EntityInterface instance = new EntityInterfaceImpl();
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarId method, of class EntityInterface.
     */
    @Test
    public void testVerificarId() {
        System.out.println("verificarId");
        EntityInterface instance = new EntityInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.verificarId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMarcado method, of class EntityInterface.
     */
    @Test
    public void testIsMarcado() {
        System.out.println("isMarcado");
        EntityInterface instance = new EntityInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.isMarcado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class EntityInterfaceImpl implements EntityInterface {

        public Serializable getId() {
            return null;
        }

        public String getLabel() {
            return "";
        }

        public boolean verificarId() {
            return false;
        }

        public boolean isMarcado() {
            return false;
        }

        @Override
        public int compareTo(Object o) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
