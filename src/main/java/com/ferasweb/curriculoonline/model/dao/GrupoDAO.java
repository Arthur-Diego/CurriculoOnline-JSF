/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.model.dao;

import com.ferasweb.curriculoonline.model.dao.commons.AbstractEntityBeans;
import com.ferasweb.curriculoonline.model.entity.Grupo;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Andressa
 */
public class GrupoDAO extends AbstractEntityBeans<Grupo, Integer>{

    @PersistenceContext(unitName = "curriculoPU")
    private EntityManager manager;
    
    @Override
    protected EntityManager getEntityManager() {
        return manager;
    }

    public GrupoDAO() {
        super(Grupo.class, GrupoDAO.class);
    }
    
}
