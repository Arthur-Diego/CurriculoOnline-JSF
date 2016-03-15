/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.controller.login;

import com.ferasweb.curriculoonline.controller.commons.EntityController;
import com.ferasweb.curriculoonline.controller.commons.EntityPagination;
import com.ferasweb.curriculoonline.exception.EntityException;
import com.ferasweb.curriculoonline.model.dao.LoginDAO;
import com.ferasweb.curriculoonline.model.entity.Login;
import com.ferasweb.curriculoonline.utils.JsfUtil;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Andressa
 */
@ManagedBean
@ViewScoped
public class LoginController extends EntityController<Login> implements Serializable{

    @EJB
    private LoginDAO loginDao;
    
    private Login current;

    public LoginController() {
        
    }

    public Login getCurrent() {
        if(current == null){
            
         current =  getNewEntity();
        }
        return current;
    }

    public void setCurrent(Login current) {
        this.current = current;
    }
    
    @Override
    protected void setEntity(Login t) {
        this.current = t;
    }

    @Override
    protected Login getNewEntity() {
        return new Login();
    }
    
    

    @Override
    protected void performDestroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String create() {
        try {
            loginDao.create(current);
        } catch (EntityException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return JsfUtil.MANTEM;
    }

    @Override
    protected String update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EntityPagination getPagination() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
