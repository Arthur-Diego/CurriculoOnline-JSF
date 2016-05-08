/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.model.dao;

import com.ferasweb.curriculoonline.model.dao.commons.AbstractEntityBeans;
import com.ferasweb.curriculoonline.model.entity.Perfil;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Andressa
 */
public class PerfilDAO extends AbstractEntityBeans<Perfil, Integer> {

    @PersistenceContext(unitName = "curriculoPU")
    private EntityManager manager;

    public PerfilDAO() {
        super(Perfil.class, PerfilDAO.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return manager;
    }

}
