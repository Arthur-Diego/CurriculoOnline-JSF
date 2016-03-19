/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.controller.login;

import com.ferasweb.curriculoonline.controller.messages.MessagesView;
import java.io.IOException;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andressa
 */
@Named
@SessionScoped
public class LoginController implements Serializable{

    private FacesContext facesContext;

    private HttpServletRequest request;

    private HttpServletResponse response;

    @Inject
    private MessagesView msg;

    public void preRender() {
        facesContext = FacesContext.getCurrentInstance();
        ExternalContext context = facesContext.getExternalContext();
        request = (HttpServletRequest) context.getRequest();
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
        facesContext = FacesContext.getCurrentInstance();
        ExternalContext context = facesContext.getExternalContext();
        request = (HttpServletRequest) context.getRequest();

        RequestDispatcher dispatcher = request.getRequestDispatcher("/j_spring_security_check");
        response = (HttpServletResponse) context.getResponse();
        dispatcher.forward(request, response);

        facesContext.responseComplete();
    }

}
