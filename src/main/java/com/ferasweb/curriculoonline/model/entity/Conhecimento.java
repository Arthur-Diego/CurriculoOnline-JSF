/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.model.entity;

import com.ferasweb.curriculoonline.model.commons.EntityInterface;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "Conhecimento")
public class Conhecimento implements EntityInterface<Conhecimento>{
    
    @TableGenerator(name="Conhecimento_Generator",
            table="GENERATED_KEYS",
            pkColumnName="PK_COLUMN",
            valueColumnName="VALUE_COLUMN",
            pkColumnValue="Conhecimento_ID",
            allocationSize=10
    )
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "Conhecimento_Generator")
    @Column(name = "Conhecimento_Cod")
    private Integer conhecimentoCod;
    
    @Lob
    @Column(name = "Conhecimento_Objetivo", length = 5000, nullable = false)
    private String objetivo;
    
    @OneToMany(targetEntity = Formacao.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "Conhecimento_Cod", nullable = true)
    private List<Formacao> formacao;
    
    @OneToOne(targetEntity = Perfil.class)
    @JoinColumn(name = "Perfil_Cod")
    private Perfil perfil;
    
    @OneToMany(targetEntity = Experiencia.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "Conhecimento_Cod", nullable = true)
    private List<Experiencia> experiencia;
    
    @OneToMany(targetEntity = Qualificacao.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "Conhecimento_Cod", nullable = true)
    private List<Qualificacao> qualificacao;
    
    @OneToMany(targetEntity = InformacaoAdicional.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "Conhecimento_Cod", nullable = true)
    private List<InformacaoAdicional> informacao;

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
    
    public Integer getConhecimentoCod() {
        return conhecimentoCod;
    }

    public void setConhecimentoCod(Integer conhecimentoCod) {
        this.conhecimentoCod = conhecimentoCod;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public List<Formacao> getFormacao() {
        return formacao;
    }

    public void setFormacao(List<Formacao> formacao) {
        this.formacao = formacao;
    }

    public List<Experiencia> getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(List<Experiencia> experiencia) {
        this.experiencia = experiencia;
    }

    public List<Qualificacao> getQualificacao() {
        return qualificacao;
    }

    public void setQualificacao(List<Qualificacao> qualificacao) {
        this.qualificacao = qualificacao;
    }

    public List<InformacaoAdicional> getInformacao() {
        return informacao;
    }

    public void setInformacao(List<InformacaoAdicional> informacao) {
        this.informacao = informacao;
    }

    @Override
    public Serializable getId() {
        return this.getConhecimentoCod();
    }

    @Override
    public String getLabel() {
        return this.conhecimentoCod.toString();
    }

    @Override
    public boolean verificarId() {
        return false;
    }

    @Override
    public boolean isMarcado() {
        return false;
    }

    @Override
    public int compareTo(Conhecimento o) {
        return this.getConhecimentoCod().compareTo(o.getConhecimentoCod());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.conhecimentoCod != null ? this.conhecimentoCod.hashCode() : 0);
        hash = 59 * hash + (this.objetivo != null ? this.objetivo.hashCode() : 0);
        hash = 59 * hash + (this.formacao != null ? this.formacao.hashCode() : 0);
        hash = 59 * hash + (this.experiencia != null ? this.experiencia.hashCode() : 0);
        hash = 59 * hash + (this.qualificacao != null ? this.qualificacao.hashCode() : 0);
        hash = 59 * hash + (this.informacao != null ? this.informacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conhecimento other = (Conhecimento) obj;
        if (this.conhecimentoCod != other.conhecimentoCod && (this.conhecimentoCod == null || !this.conhecimentoCod.equals(other.conhecimentoCod))) {
            return false;
        }
        if ((this.objetivo == null) ? (other.objetivo != null) : !this.objetivo.equals(other.objetivo)) {
            return false;
        }
        if (this.formacao != other.formacao && (this.formacao == null || !this.formacao.equals(other.formacao))) {
            return false;
        }
        if (this.experiencia != other.experiencia && (this.experiencia == null || !this.experiencia.equals(other.experiencia))) {
            return false;
        }
        if (this.qualificacao != other.qualificacao && (this.qualificacao == null || !this.qualificacao.equals(other.qualificacao))) {
            return false;
        }
        if (this.informacao != other.informacao && (this.informacao == null || !this.informacao.equals(other.informacao))) {
            return false;
        }
        return true;
    }
    
    
    
}
