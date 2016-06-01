/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.controller.template;

import com.ferasweb.curriculoonline.model.entity.Perfil;
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
public class ReportUmTest {
    
    public ReportUmTest() {
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
     * Test of generateReportUm method, of class ReportUm.
     */
    @Test
    public void testGenerateReportUm() {
        System.out.println("generateReportUm");
        Perfil perfil = null;
        ReportUm instance = new ReportUm();
        instance.generateReportUm(perfil);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateCurriculoUm method, of class ReportUm.
     */
    @Test
    public void testGenerateCurriculoUm() {
        System.out.println("generateCurriculoUm");
        Perfil perfil = null;
        ReportUm instance = new ReportUm();
        instance.generateCurriculoUm(perfil);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
