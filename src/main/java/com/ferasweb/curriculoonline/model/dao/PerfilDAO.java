/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.model.dao;

import com.ferasweb.curriculoonline.model.dao.commons.AbstractEntityBeans;
import com.ferasweb.curriculoonline.model.entity.Login;
import com.ferasweb.curriculoonline.model.entity.Perfil;
import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Andressa
 */
public class PerfilDAO extends AbstractEntityBeans<Perfil, Integer> implements Serializable{

    @PersistenceContext(unitName = "curriculoPU")
    private EntityManager manager;

    public PerfilDAO() {
        super(Perfil.class, PerfilDAO.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return manager;
    }

    public Perfil findPerfilByLogin(Login login) {
        Perfil p = null;
        Query q = manager.createQuery("SELECT p FROM Perfil p where p.login = :login ", Perfil.class);
        q.setParameter("login", login);
        try {
            p = (Perfil) q.getSingleResult();
        } catch (NoResultException ex) {
            return new Perfil();
        }
        return p;
    }

}
