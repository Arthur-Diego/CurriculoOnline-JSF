/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.teste;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.internal.runners.InitializationError;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 *
 * @author Andressa
 */

public class WeldJUnit4Runner extends BlockJUnit4ClassRunner {
 
    private final Class klass;
    private final Weld weld;
    private final WeldContainer container;
 
    public WeldJUnit4Runner(final Class klass) throws InitializationError, org.junit.runners.model.InitializationError {
        super(klass);
        this.klass = klass;
        this.weld = new Weld();
        this.container = weld.initialize();
    }
 
    @Override
    protected Object createTest() throws Exception {
        final Object test = container.instance().select(klass).get();
        return test;
    }
}
