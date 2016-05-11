/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.model.entity;

import com.ferasweb.curriculoonline.model.commons.EntityInterface;
import com.ferasweb.curriculoonline.model.enumerated.EnumEstadoCivil;
import com.ferasweb.curriculoonline.model.enumerated.EnumTipoHabilitacao;
import java.io.Serializable;
import java.util.Arrays;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "Perfil")
public class Perfil implements EntityInterface<Perfil>{
    
    @TableGenerator(name="Perfil_Generator",
            table="GENERATED_KEYS",
            pkColumnName="PK_COLUMN",
            valueColumnName="VALUE_COLUMN",
            pkColumnValue="Perfil_ID",
            allocationSize=10
    )
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "Perfil_Generator")
    @Column(name = "Perfil_Cod")
    private Integer perfilCod;
    
    @OneToOne(mappedBy = "perfil", cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
    private Conhecimento conhecimento;
    
    @Column(name = "Perfil_Nome", nullable = false, length = 90)
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(name = "Perfil_Estado_Civil", nullable = false)
    private EnumEstadoCivil estadoCivil;
    
    @Column(name = "Perfil_Idade", nullable = false)
    private Integer idade;
    
    @Column(name = "Perfil_Telefone", nullable = false)
    private String telefone;
    
    @Lob
    @Column(name = "Perfil_Foto", columnDefinition = "BLOB")
    private byte[] foto;
    
    @Column(name = "Perfil_Email")
    private String email;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "Perfil_Tipo_Habilit")
    private EnumTipoHabilitacao tipoHabilitacao;
    
    @Embedded
    private Endereco endereco;
    
    @OneToOne(targetEntity = Login.class)
    @JoinColumn(name = "Login_Cod", nullable = false)
    private Login login;
    
    public Perfil(){
        endereco = new Endereco();
    }
    
    public Conhecimento getConhecimento() {
        return conhecimento;
    }

    public void setConhecimento(Conhecimento conhecimento) {
        this.conhecimento = conhecimento;
    }

    public EnumTipoHabilitacao getTipoHabilitacao() {
        return tipoHabilitacao;
    }

    public void setTipoHabilitacao(EnumTipoHabilitacao tipoHabilitacao) {
        this.tipoHabilitacao = tipoHabilitacao;
    }

    public Integer getPerfilCod() {
        return perfilCod;
    }

    public void setPerfilCod(Integer perfilCod) {
        this.perfilCod = perfilCod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnumEstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EnumEstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
    
    @Override
    public Serializable getId() {
        return this.getPerfilCod();
    }

    @Override
    public String getLabel() {
        return this.getId()+" - "+this.getNome();
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
    public int compareTo(Perfil o) {
        return this.getPerfilCod().compareTo(o.getPerfilCod());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.perfilCod != null ? this.perfilCod.hashCode() : 0);
        hash = 79 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        hash = 79 * hash + (this.estadoCivil != null ? this.estadoCivil.hashCode() : 0);
        hash = 79 * hash + (this.idade != null ? this.idade.hashCode() : 0);
        hash = 79 * hash + (this.telefone != null ? this.telefone.hashCode() : 0);
        hash = 79 * hash + Arrays.hashCode(this.foto);
        hash = 79 * hash + (this.email != null ? this.email.hashCode() : 0);
        hash = 79 * hash + (this.endereco != null ? this.endereco.hashCode() : 0);
        hash = 79 * hash + (this.login != null ? this.login.hashCode() : 0);
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
        final Perfil other = (Perfil) obj;
        if (this.perfilCod != other.perfilCod && (this.perfilCod == null || !this.perfilCod.equals(other.perfilCod))) {
            return false;
        }
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        if (this.estadoCivil != other.estadoCivil) {
            return false;
        }
        if (this.idade != other.idade && (this.idade == null || !this.idade.equals(other.idade))) {
            return false;
        }
        if ((this.telefone == null) ? (other.telefone != null) : !this.telefone.equals(other.telefone)) {
            return false;
        }
        if (!Arrays.equals(this.foto, other.foto)) {
            return false;
        }
        if ((this.email == null) ? (other.email != null) : !this.email.equals(other.email)) {
            return false;
        }
        if (this.endereco != other.endereco && (this.endereco == null || !this.endereco.equals(other.endereco))) {
            return false;
        }
        if (this.login != other.login && (this.login == null || !this.login.equals(other.login))) {
            return false;
        }
        return true;
    }
    
    
}
