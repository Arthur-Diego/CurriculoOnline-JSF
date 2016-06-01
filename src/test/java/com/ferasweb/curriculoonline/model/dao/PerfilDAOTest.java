/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.model.dao;

import com.ferasweb.curriculoonline.model.entity.Login;
import com.ferasweb.curriculoonline.model.entity.Perfil;
import javax.persistence.EntityManager;
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
public class PerfilDAOTest {
    
    public PerfilDAOTest() {
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
     * Test of getEntityManager method, of class PerfilDAO.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        PerfilDAO instance = new PerfilDAO();
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findPerfilByLogin method, of class PerfilDAO.
     */
    @Test
    public void testFindPerfilByLogin() {
        System.out.println("findPerfilByLogin");
        Login login = null;
        PerfilDAO instance = new PerfilDAO();
        Perfil expResult = null;
        Perfil result = instance.findPerfilByLogin(login);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
