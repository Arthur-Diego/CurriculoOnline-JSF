/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.controller.images;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.primefaces.event.CaptureEvent;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.CroppedImage;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author arthur.diego
 */
public class PhotoControllerTest {
    
    public PhotoControllerTest() {
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
     * Test of getArquivoFoto method, of class PhotoController.
     */
    @Test
    public void testGetArquivoFoto() {
        System.out.println("getArquivoFoto");
        PhotoController instance = new PhotoController();
        String expResult = "";
        String result = instance.getArquivoFoto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArquivoFoto method, of class PhotoController.
     */
    @Test
    public void testSetArquivoFoto() {
        System.out.println("setArquivoFoto");
        String arquivoFoto = "";
        PhotoController instance = new PhotoController();
        instance.setArquivoFoto(arquivoFoto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArquivoFotoRecortada method, of class PhotoController.
     */
    @Test
    public void testGetArquivoFotoRecortada() {
        System.out.println("getArquivoFotoRecortada");
        PhotoController instance = new PhotoController();
        String expResult = "";
        String result = instance.getArquivoFotoRecortada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArquivoFotoRecortada method, of class PhotoController.
     */
    @Test
    public void testSetArquivoFotoRecortada() {
        System.out.println("setArquivoFotoRecortada");
        String arquivoFotoRecortada = "";
        PhotoController instance = new PhotoController();
        instance.setArquivoFotoRecortada(arquivoFotoRecortada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isExibeImagemCapturada method, of class PhotoController.
     */
    @Test
    public void testIsExibeImagemCapturada() {
        System.out.println("isExibeImagemCapturada");
        PhotoController instance = new PhotoController();
        boolean expResult = false;
        boolean result = instance.isExibeImagemCapturada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExibeImagemCapturada method, of class PhotoController.
     */
    @Test
    public void testSetExibeImagemCapturada() {
        System.out.println("setExibeImagemCapturada");
        boolean exibeImagemCapturada = false;
        PhotoController instance = new PhotoController();
        instance.setExibeImagemCapturada(exibeImagemCapturada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFotoRecortada method, of class PhotoController.
     */
    @Test
    public void testGetFotoRecortada() {
        System.out.println("getFotoRecortada");
        PhotoController instance = new PhotoController();
        String expResult = "";
        String result = instance.getFotoRecortada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFotoRecortada method, of class PhotoController.
     */
    @Test
    public void testSetFotoRecortada() {
        System.out.println("setFotoRecortada");
        String fotoRecortada = "";
        PhotoController instance = new PhotoController();
        instance.setFotoRecortada(fotoRecortada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFoto method, of class PhotoController.
     */
    @Test
    public void testGetFoto() {
        System.out.println("getFoto");
        PhotoController instance = new PhotoController();
        String expResult = "";
        String result = instance.getFoto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFoto method, of class PhotoController.
     */
    @Test
    public void testSetFoto() {
        System.out.println("setFoto");
        String foto = "";
        PhotoController instance = new PhotoController();
        instance.setFoto(foto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImagemRecortada method, of class PhotoController.
     */
    @Test
    public void testGetImagemRecortada() {
        System.out.println("getImagemRecortada");
        PhotoController instance = new PhotoController();
        CroppedImage expResult = null;
        CroppedImage result = instance.getImagemRecortada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImagemRecortada method, of class PhotoController.
     */
    @Test
    public void testSetImagemRecortada() {
        System.out.println("setImagemRecortada");
        CroppedImage imagemRecortada = null;
        PhotoController instance = new PhotoController();
        instance.setImagemRecortada(imagemRecortada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isControlButtonSave method, of class PhotoController.
     */
    @Test
    public void testIsControlButtonSave() {
        System.out.println("isControlButtonSave");
        PhotoController instance = new PhotoController();
        boolean expResult = false;
        boolean result = instance.isControlButtonSave();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setControlButtonSave method, of class PhotoController.
     */
    @Test
    public void testSetControlButtonSave() {
        System.out.println("setControlButtonSave");
        boolean controlButtonSave = false;
        PhotoController instance = new PhotoController();
        instance.setControlButtonSave(controlButtonSave);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFile method, of class PhotoController.
     */
    @Test
    public void testGetFile() {
        System.out.println("getFile");
        PhotoController instance = new PhotoController();
        UploadedFile expResult = null;
        UploadedFile result = instance.getFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFile method, of class PhotoController.
     */
    @Test
    public void testSetFile() {
        System.out.println("setFile");
        UploadedFile file = null;
        PhotoController instance = new PhotoController();
        instance.setFile(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImg method, of class PhotoController.
     */
    @Test
    public void testGetImg() {
        System.out.println("getImg");
        PhotoController instance = new PhotoController();
        byte[] expResult = null;
        byte[] result = instance.getImg();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImg method, of class PhotoController.
     */
    @Test
    public void testSetImg() {
        System.out.println("setImg");
        byte[] img = null;
        PhotoController instance = new PhotoController();
        instance.setImg(img);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRealPath method, of class PhotoController.
     */
    @Test
    public void testGetRealPath() {
        System.out.println("getRealPath");
        PhotoController instance = new PhotoController();
        String expResult = "";
        String result = instance.getRealPath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recortar method, of class PhotoController.
     */
    @Test
    public void testRecortar() {
        System.out.println("recortar");
        PhotoController instance = new PhotoController();
        instance.recortar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of oncapture method, of class PhotoController.
     */
    @Test
    public void testOncapture() {
        System.out.println("oncapture");
        CaptureEvent captureEvent = null;
        PhotoController instance = new PhotoController();
        instance.oncapture(captureEvent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of uploadImagem method, of class PhotoController.
     */
    @Test
    public void testUploadImagem() {
        System.out.println("uploadImagem");
        FileUploadEvent event = null;
        PhotoController instance = new PhotoController();
        instance.uploadImagem(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
