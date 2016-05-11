/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.model.entity;

import com.ferasweb.curriculoonline.model.commons.EntityInterface;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "Login")
public class Login implements EntityInterface<Login> {
    @TableGenerator(name="Login_Generator",
            table="GENERATED_KEYS",
            pkColumnName="PK_COLUMN",
            valueColumnName="VALUE_COLUMN",
            pkColumnValue="Login_ID",
            allocationSize=10
    )
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "Login_Generator")
    @Column(name = "Login_Cod")
    private Integer loginCod;

    @Column(name = "Login_Nome")
    private String loginNome;

    @Column(name = "Login_User", nullable = false)
    private String login;

    @Column(name = "Login_Senha", nullable = false)
    private String senha;

    @Temporal(TemporalType.DATE)
    @Column(name = "Login_Data_Reg")
    private Date dataRegistro;

    @Column(name = "Login_Email", length = 100, nullable = false)
    private String email;

    @ManyToMany
    @JoinTable(name = "Login_Grupos", joinColumns = @JoinColumn(name = "Login_Cod"),
            inverseJoinColumns = @JoinColumn(name = "Grupo_Cod"))
    private List<Grupo> grupos;

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public Integer getLoginCod() {
        return loginCod;
    }

    public void setLoginCod(Integer loginCod) {
        this.loginCod = loginCod;
    }

    public String getLoginNome() {
        return loginNome;
    }

    public void setLoginNome(String loginNome) {
        this.loginNome = loginNome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.loginCod != null ? this.loginCod.hashCode() : 0);
        hash = 37 * hash + (this.login != null ? this.login.hashCode() : 0);
        hash = 37 * hash + (this.senha != null ? this.senha.hashCode() : 0);
        hash = 37 * hash + (this.dataRegistro != null ? this.dataRegistro.hashCode() : 0);
        hash = 37 * hash + (this.email != null ? this.email.hashCode() : 0);
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
        final Login other = (Login) obj;
        if (this.loginCod != other.loginCod && (this.loginCod == null || !this.loginCod.equals(other.loginCod))) {
            return false;
        }
        if ((this.login == null) ? (other.login != null) : !this.login.equals(other.login)) {
            return false;
        }
        if ((this.senha == null) ? (other.senha != null) : !this.senha.equals(other.senha)) {
            return false;
        }
        if (this.dataRegistro != other.dataRegistro && (this.dataRegistro == null || !this.dataRegistro.equals(other.dataRegistro))) {
            return false;
        }
        if ((this.email == null) ? (other.email != null) : !this.email.equals(other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public Serializable getId() {
        return this.getLoginCod();
    }

    @Override
    public String getLabel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public int compareTo(Login o) {
        return this.getLoginCod().compareTo(o.getLoginCod());
    }

}
