/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.model.dao;

import com.ferasweb.curriculoonline.model.dao.commons.AbstractEntityBeans;
import com.ferasweb.curriculoonline.model.entity.Login;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Andressa
 */
@Named
public class LoginDAO extends AbstractEntityBeans<Login, Integer> {

    @PersistenceContext(unitName = "curriculoPU")
    private EntityManager manager;

    public LoginDAO() {
        super(Login.class, LoginDAO.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return manager;
    }

    public Login findUserByLogin(String login) {
        Login usuario = null;

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("curriculoPU");
        EntityManager manager = emf.createEntityManager();
        try {

            usuario = manager.createQuery("SELECT l FROM Login l WHERE l.login = :login", Login.class)
                    .setParameter("login", login.toLowerCase()).getSingleResult();
        } catch (NoResultException e) {
            //implementar erro 
        } finally {
            manager.close();
            emf.close();
        }
        return usuario;
    }

}
