/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.controller.perfil;

import com.ferasweb.curriculoonline.controller.login.LoginController;
import com.ferasweb.curriculoonline.model.dao.PerfilDAO;
import com.ferasweb.curriculoonline.model.entity.Perfil;
import com.ferasweb.curriculoonline.utils.cdi.PerfilQualifier;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
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
public class FotoPerfilController implements Serializable {

    private Perfil current;

    @Inject
    transient private PerfilDAO perfilDao;

    @Inject
    private LoginController login;

    private boolean verifyIfExistImage;
    private StreamedContent image;

    public void findPerfil() {
        login.getNomeUsuario();
        current = perfilDao.findPerfilByLogin(login.usuario().getUsuario());
    }

    public StreamedContent getImage() throws IOException {
        //sua regra para carregar os bytes   
        if (current == null) {
            findPerfil();
        }
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

}
