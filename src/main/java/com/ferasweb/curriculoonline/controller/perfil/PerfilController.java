/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.controller.perfil;

import com.ferasweb.curriculoonline.controller.commons.EntityController;
import com.ferasweb.curriculoonline.controller.commons.EntityPagination;
import com.ferasweb.curriculoonline.model.dao.PerfilDAO;
import com.ferasweb.curriculoonline.model.entity.Formacao;
import com.ferasweb.curriculoonline.model.entity.Perfil;
import com.ferasweb.curriculoonline.model.enumerated.EnumTipoFormacao;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Aluno
 */
@Named
@ViewScoped
public class PerfilController extends EntityController<Perfil> {

    private Perfil current;
    private Formacao formacao;

    @Inject
    private PerfilDAO perfilDao;

    private List<EnumTipoFormacao> listaTipoFormacao;

    @PostConstruct
    public void init() {
        getListaTipoFormacao().add(EnumTipoFormacao.DOUTORADO);
        getListaTipoFormacao().add(EnumTipoFormacao.ESPECIALIZACAO);
        getListaTipoFormacao().add(EnumTipoFormacao.GRADUACAO);
        getListaTipoFormacao().add(EnumTipoFormacao.MESTRADO);
        getListaTipoFormacao().add(EnumTipoFormacao.POS_DOUTORADO);
        getListaTipoFormacao().add(EnumTipoFormacao.TECNICO);
    }

    public Perfil getCurrent() {
        if (current == null) {
            current = getNewEntity();
        }
        return current;
    }

    public void setCurrent(Perfil current) {

        this.current = current;
    }

    public Formacao getFormacao() {
        if (formacao == null) {
            formacao = new Formacao();
        }
        return formacao;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }

    @Override
    protected void setEntity(Perfil t) {
        current = t;
    }

    public List<EnumTipoFormacao> getListaTipoFormacao() {
        if (listaTipoFormacao == null) {
            listaTipoFormacao = new ArrayList<>();
        }
        return listaTipoFormacao;
    }

    public void setListaTipoFormacao(List<EnumTipoFormacao> listaTipoFormacao) {
        this.listaTipoFormacao = listaTipoFormacao;
    }

    @Override
    protected Perfil getNewEntity() {
        return new Perfil();
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
