/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java.com.ferasweb.curriculoonline.controller.commons;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author arthur.diego
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.ferasweb.curriculoonline.controller.commons.EntityControllerTest.class, com.ferasweb.curriculoonline.controller.commons.EntityPaginationTest.class})
public class CommonsSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
