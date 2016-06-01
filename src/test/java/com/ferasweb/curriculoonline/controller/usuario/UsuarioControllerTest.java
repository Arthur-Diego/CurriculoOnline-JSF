/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.controller.usuario;

import com.ferasweb.curriculoonline.controller.commons.EntityPagination;
import com.ferasweb.curriculoonline.model.entity.Grupo;
import com.ferasweb.curriculoonline.model.entity.Login;
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
public class UsuarioControllerTest {
    
    public UsuarioControllerTest() {
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
     * Test of getCurrent method, of class UsuarioController.
     */
    @Test
    public void testGetCurrent() {
        System.out.println("getCurrent");
        UsuarioController instance = new UsuarioController();
        Login expResult = null;
        Login result = instance.getCurrent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrent method, of class UsuarioController.
     */
    @Test
    public void testSetCurrent() {
        System.out.println("setCurrent");
        Login current = null;
        UsuarioController instance = new UsuarioController();
        instance.setCurrent(current);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrupo method, of class UsuarioController.
     */
    @Test
    public void testGetGrupo() {
        System.out.println("getGrupo");
        UsuarioController instance = new UsuarioController();
        Grupo expResult = null;
        Grupo result = instance.getGrupo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrupo method, of class UsuarioController.
     */
    @Test
    public void testSetGrupo() {
        System.out.println("setGrupo");
        Grupo grupo = null;
        UsuarioController instance = new UsuarioController();
        instance.setGrupo(grupo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrupoIntoUsuario method, of class UsuarioController.
     */
    @Test
    public void testSetGrupoIntoUsuario() {
        System.out.println("setGrupoIntoUsuario");
        Login usuario = null;
        UsuarioController instance = new UsuarioController();
        instance.setGrupoIntoUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEntity method, of class UsuarioController.
     */
    @Test
    public void testSetEntity() {
        System.out.println("setEntity");
        Login t = null;
        UsuarioController instance = new UsuarioController();
        instance.setEntity(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewEntity method, of class UsuarioController.
     */
    @Test
    public void testGetNewEntity() {
        System.out.println("getNewEntity");
        UsuarioController instance = new UsuarioController();
        Login expResult = null;
        Login result = instance.getNewEntity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of performDestroy method, of class UsuarioController.
     */
    @Test
    public void testPerformDestroy() {
        System.out.println("performDestroy");
        UsuarioController instance = new UsuarioController();
        instance.performDestroy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class UsuarioController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        UsuarioController instance = new UsuarioController();
        String expResult = "";
        String result = instance.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class UsuarioController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        UsuarioController instance = new UsuarioController();
        String expResult = "";
        String result = instance.update();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPagination method, of class UsuarioController.
     */
    @Test
    public void testGetPagination() {
        System.out.println("getPagination");
        UsuarioController instance = new UsuarioController();
        EntityPagination expResult = null;
        EntityPagination result = instance.getPagination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
