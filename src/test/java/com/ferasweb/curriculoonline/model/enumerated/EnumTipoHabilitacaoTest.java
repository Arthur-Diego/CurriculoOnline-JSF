/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.model.enumerated;

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
public class EnumTipoHabilitacaoTest {
    
    public EnumTipoHabilitacaoTest() {
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
     * Test of values method, of class EnumTipoHabilitacao.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        EnumTipoHabilitacao[] expResult = null;
        EnumTipoHabilitacao[] result = EnumTipoHabilitacao.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class EnumTipoHabilitacao.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        EnumTipoHabilitacao expResult = null;
        EnumTipoHabilitacao result = EnumTipoHabilitacao.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel method, of class EnumTipoHabilitacao.
     */
    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        EnumTipoHabilitacao instance = null;
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel method, of class EnumTipoHabilitacao.
     */
    @Test
    public void testSetLabel() {
        System.out.println("setLabel");
        String label = "";
        EnumTipoHabilitacao instance = null;
        instance.setLabel(label);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
