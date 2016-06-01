/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Map;
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
public class ReportUtilTest {
    
    public ReportUtilTest() {
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
     * Test of generateCurriculo method, of class ReportUtil.
     */
    @Test
    public void testGenerateCurriculo() {
        System.out.println("generateCurriculo");
        InputStream inputStream = null;
        Map parametros = null;
        Connection conn = null;
        ReportUtil instance = new ReportUtil();
        instance.generateCurriculo(inputStream, parametros, conn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParams method, of class ReportUtil.
     */
    @Test
    public void testGetParams() {
        System.out.println("getParams");
        Map expResult = null;
        Map result = ReportUtil.getParams();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
