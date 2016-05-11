/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.controller.perfil;

import com.ferasweb.curriculoonline.controller.commons.EntityController;
import com.ferasweb.curriculoonline.controller.commons.EntityPagination;
import com.ferasweb.curriculoonline.controller.login.LoginController;
import com.ferasweb.curriculoonline.controller.usuario.UsuarioController;
import com.ferasweb.curriculoonline.exception.EntityException;
import com.ferasweb.curriculoonline.model.dao.PerfilDAO;
import com.ferasweb.curriculoonline.model.entity.Conhecimento;
import com.ferasweb.curriculoonline.model.entity.Experiencia;
import com.ferasweb.curriculoonline.model.entity.Formacao;
import com.ferasweb.curriculoonline.model.entity.InformacaoAdicional;
import com.ferasweb.curriculoonline.model.entity.Login;
import com.ferasweb.curriculoonline.model.entity.Perfil;
import com.ferasweb.curriculoonline.model.entity.Qualificacao;
import com.ferasweb.curriculoonline.model.enumerated.EnumEstadoCivil;
import com.ferasweb.curriculoonline.model.enumerated.EnumTipoFormacao;
import com.ferasweb.curriculoonline.model.enumerated.EnumTipoHabilitacao;
import com.ferasweb.curriculoonline.utils.JsfUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class PerfilController extends EntityController<Perfil> implements Serializable{

    private Perfil current;
    private Conhecimento conhecimento;

    private List<Formacao> listaFormacao;
    private List<Experiencia> listaExperiencia;
    private List<Qualificacao> listaQualificacao;
    private List<InformacaoAdicional> listaInformacaoAdicional;

    @Inject
    private PerfilDAO perfilDao;
    @Inject
    private LoginController login;
    private List<EnumTipoFormacao> listaTipoFormacao;
    private List<EnumTipoHabilitacao> listaTipoHabilitacao;
    private List<EnumEstadoCivil> listaEstadoCivil;

    @PostConstruct
    public void init() {
        getListaTipoFormacao().add(EnumTipoFormacao.DOUTORADO);
        getListaTipoFormacao().add(EnumTipoFormacao.ESPECIALIZACAO);
        getListaTipoFormacao().add(EnumTipoFormacao.GRADUACAO);
        getListaTipoFormacao().add(EnumTipoFormacao.MESTRADO);
        getListaTipoFormacao().add(EnumTipoFormacao.POS_DOUTORADO);
        getListaTipoFormacao().add(EnumTipoFormacao.TECNICO);
        getListaTipoHabilitacao().add(EnumTipoHabilitacao.A);
        getListaTipoHabilitacao().add(EnumTipoHabilitacao.B);
        getListaTipoHabilitacao().add(EnumTipoHabilitacao.C);
        getListaTipoHabilitacao().add(EnumTipoHabilitacao.D);
        getListaTipoHabilitacao().add(EnumTipoHabilitacao.E);
        getListaTipoHabilitacao().add(EnumTipoHabilitacao.ACC);
        getListaTipoHabilitacao().add(EnumTipoHabilitacao.MOTOR_CASA);
        getListaEstadoCivil().add(EnumEstadoCivil.SOLTEIRO);
        getListaEstadoCivil().add(EnumEstadoCivil.CASADO);
        getListaEstadoCivil().add(EnumEstadoCivil.DIVORCIADO);
        getListaEstadoCivil().add(EnumEstadoCivil.UNIAO_ESTAVEL);
        getListaEstadoCivil().add(EnumEstadoCivil.VIUVO);
    }

    public void addExperiencia() {

        listaExperiencia.add(new Experiencia());
    }

    public void addFormacao() {

        listaFormacao.add(new Formacao());
    }

    public void addQualificacao() {

        listaQualificacao.add(new Qualificacao());
    }

    public void addInformacaoAdicional() {

        listaInformacaoAdicional.add(new InformacaoAdicional());
    }

    public Conhecimento getConhecimento() {
        if(conhecimento == null){
            conhecimento = new Conhecimento();
        }
        return conhecimento;
    }

    public void setConhecimento(Conhecimento conhecimento) {
        this.conhecimento = conhecimento;
    }

    public List<EnumTipoHabilitacao> getListaTipoHabilitacao() {
        if (listaTipoHabilitacao == null) {
            listaTipoHabilitacao = new ArrayList<>();
        }
        return listaTipoHabilitacao;
    }

    public void setListaTipoHabilitacao(List<EnumTipoHabilitacao> listaTipoHabilitacao) {
        this.listaTipoHabilitacao = listaTipoHabilitacao;
    }

    public List<Formacao> getListaFormacao() {
        if (listaFormacao == null) {
            listaFormacao = new ArrayList<>();
            listaFormacao.add(new Formacao());
        }
        return listaFormacao;
    }

    public void setListaFormacao(List<Formacao> listaFormacao) {
        this.listaFormacao = listaFormacao;
    }

    public List<Experiencia> getListaExperiencia() {
        if (listaExperiencia == null) {
            listaExperiencia = new ArrayList<>();
            listaExperiencia.add(new Experiencia());
        }
        return listaExperiencia;
    }

    public void setListaExperiencia(List<Experiencia> listaExperiencia) {
        this.listaExperiencia = listaExperiencia;
    }

    public List<Qualificacao> getListaQualificacao() {
        if (listaQualificacao == null) {
            listaQualificacao = new ArrayList<>();
            listaQualificacao.add(new Qualificacao());
        }
        return listaQualificacao;
    }

    public void setListaQualificacao(List<Qualificacao> listaQualificacao) {
        this.listaQualificacao = listaQualificacao;
    }

    public List<InformacaoAdicional> getListaInformacaoAdicional() {
        if (listaInformacaoAdicional == null) {
            listaInformacaoAdicional = new ArrayList<>();
            listaInformacaoAdicional.add(new InformacaoAdicional());
        }
        return listaInformacaoAdicional;
    }

    public void setListaInformacaoAdicional(List<InformacaoAdicional> listaInformacaoAdicional) {
        this.listaInformacaoAdicional = listaInformacaoAdicional;
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
    
    public void fillConhecimento(){
        conhecimento.setExperiencia(getListaExperiencia());
        conhecimento.setFormacao(getListaFormacao());
        conhecimento.setInformacao(getListaInformacaoAdicional());
        conhecimento.setQualificacao(getListaQualificacao());
        conhecimento.setPerfil(current);
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

    public List<EnumEstadoCivil> getListaEstadoCivil() {
        if(listaEstadoCivil == null){
            listaEstadoCivil = new ArrayList<>();
        }
        return listaEstadoCivil;
    }

    public void setListaEstadoCivil(List<EnumEstadoCivil> listaEstadoCivil) {
        this.listaEstadoCivil = listaEstadoCivil;
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
        try {
            fillConhecimento();
            current.setConhecimento(getConhecimento());
            current.setLogin(login.usuario().getUsuario());
            perfilDao.create(current);
        } catch (EntityException ex) {
            Logger.getLogger(PerfilController.class.getName()).log(Level.SEVERE, null, ex);
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
