/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.controller.login;

import com.ferasweb.curriculoonline.controller.messages.MessagesView;
import com.ferasweb.curriculoonline.security.UsuarioSistema;
import java.io.IOException;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

/**
 *
 * @author Andressa
 */
@Named
@SessionScoped
public class LoginController implements Serializable{

    @Inject
    private FacesContext facesContext;

    @Inject
    private HttpServletRequest request;

    @Inject
    private HttpServletResponse response;
    
    private UsuarioSistema user;

    @Inject
    private MessagesView msg;

    public void preRender() {
        if ("true".equals(request.getParameter("invalid"))) {
            msg.error("Usuário ou senha inválido!");
        }
    }

    /**
     * Método reponsável para se autenticar e entrar no sistema
     *
     * @throws ServletException
     * @throws IOException
     */
    public void login() throws ServletException, IOException {
         RequestDispatcher dispatcher = request.getRequestDispatcher("/j_spring_security_check");
        dispatcher.forward(request, response);

        facesContext.responseComplete();
    }
    
    public void logout() throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/j_spring_security_logout");
        dispatcher.forward(request, response);

        facesContext.responseComplete();
    }
    
     /**
     *
     * @return nome do usuário logado
     */
    public String getNomeUsuario() {
        String nome = null;

        user = getUsuarioLogado();

        if (user != null) {
            nome = user.getUsuario().getLoginNome();
        }

        return nome;
    }

    public UsuarioSistema usuario() {
        return user;
    }

    /**
     * Método que acessa o usuário que esta logado na sessão atual
     *
     * @return objeto UsuarioSistema
     */
    private UsuarioSistema getUsuarioLogado() {
        UsuarioSistema usuario = null;

        UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken) facesContext.getExternalContext().getUserPrincipal();

        if (auth != null && auth.getPrincipal() != null) {
            usuario = (UsuarioSistema) auth.getPrincipal();
        }

        return usuario;
    }

}
