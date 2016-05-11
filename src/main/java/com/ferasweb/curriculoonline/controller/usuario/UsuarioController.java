/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.controller.usuario;

import com.ferasweb.curriculoonline.controller.commons.EntityController;
import com.ferasweb.curriculoonline.controller.commons.EntityPagination;
import com.ferasweb.curriculoonline.controller.messages.MessagesView;
import com.ferasweb.curriculoonline.exception.EntityException;
import com.ferasweb.curriculoonline.model.dao.GrupoDAO;
import com.ferasweb.curriculoonline.model.dao.LoginDAO;
import com.ferasweb.curriculoonline.model.entity.Grupo;
import com.ferasweb.curriculoonline.model.entity.Login;
import com.ferasweb.curriculoonline.utils.JsfUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Andressa
 */
@Named
@ViewScoped
public class UsuarioController extends EntityController<Login> implements Serializable {

    @Inject
    private LoginDAO loginDao;
    
    @Inject
    private GrupoDAO grupoDao;

    @Inject
    private MessagesView msg;

    private Login current;

    private Grupo grupo;

    public UsuarioController() {

    }

    public Login getCurrent() {
        if (current == null) {

            current = getNewEntity();
        }
        return current;
    }

    public void setCurrent(Login current) {
        this.current = current;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public void setGrupoIntoUsuario(Login usuario) {
        List<Grupo> grupos = new ArrayList();
        grupos.add(grupoDao.find(1));
        usuario.setGrupos(grupos);
        usuario.setDataRegistro(new Date());
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
            this.setGrupoIntoUsuario(current);
            loginDao.create(current);
            msg.info("Cadastro Efetuado com sucesso");
        } catch (EntityException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
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
