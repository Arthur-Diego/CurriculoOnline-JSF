/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.controller.perfil;

import com.ferasweb.curriculoonline.controller.commons.EntityController;
import com.ferasweb.curriculoonline.controller.commons.EntityPagination;
import com.ferasweb.curriculoonline.controller.login.LoginController;
import com.ferasweb.curriculoonline.controller.template.ReportUm;
import com.ferasweb.curriculoonline.model.dao.PerfilDAO;
import com.ferasweb.curriculoonline.model.entity.Perfil;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 *
 * @author Andressa
 */
@Named
@SessionScoped
public class PerfilMainController extends EntityController<Perfil> implements Serializable {

    private Perfil current;
    @Inject
    private PerfilDAO perfilDao;
    @Inject
    private ReportUm curriculoUm;
    @Inject
    private LoginController login;
    private boolean verifyIfExistImage;
    private StreamedContent image;
    
    public void redirectIfPerfilIsNull() {
        login.getNomeUsuario();
        current = perfilDao.findPerfilByLogin(login.usuario().getUsuario());
        System.out.println(current.toString());
        System.out.println("to aki redirect");
        if (current.getPerfilCod() == null) {
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("/curriculoonline/perfil/perfil.xhtml");
                System.out.println("to aki redirect");
            } catch (IOException ex) {
                Logger.getLogger(PerfilMainController.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("erro");
            }
        } else {

            System.out.println("ELSE");
        }
    }

    public StreamedContent getImage() throws IOException {
        if (current.getPerfilCod() != null) {
            image = new DefaultStreamedContent(new ByteArrayInputStream(current.getFoto()));
        }
        return image;
    }

    public boolean isVerifyIfExistImage() {
        return verifyIfExistImage;
    }

    public void setVerifyIfExistImage(boolean verifyIfExistImage) {
        this.verifyIfExistImage = verifyIfExistImage;
    }

    public void generateCurritulo() {
        curriculoUm.generateCurriculoUm(current);
    }

    @Override
    protected void setEntity(Perfil t) {
        this.current = t;
    }

    @Override
    protected Perfil getNewEntity() {
        return new Perfil();
    }

    public Perfil getCurrent() {
        return current;
    }

    public void setCurrent(Perfil current) {
        this.current = current;
    }

    @Override
    protected void performDestroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
