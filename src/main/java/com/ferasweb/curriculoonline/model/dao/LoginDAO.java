/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.model.dao;

import com.ferasweb.curriculoonline.model.dao.commons.AbstractEntityBeans;
import com.ferasweb.curriculoonline.model.entity.Login;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Andressa
 */
@Stateless
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

    public Login findUserByEmail(String email) {
        Login usuario = null;
        try {
            usuario = manager.createQuery("SELECT user FROM Login user WHERE LOWER(email) = :email", Login.class)
                    .setParameter("email", email.toLowerCase()).getSingleResult();
        } catch (NoResultException e) {
            //implementar erro 
        }
        return usuario;
    }

}
