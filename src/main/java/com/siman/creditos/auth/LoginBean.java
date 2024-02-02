package com.siman.creditos.auth;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.siman.creditos.kernel.request.RequestManager;

/* import com.siman.creditos.kernel.request.RequestManager; */

@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean {

    private String username;
    private String password;

    private static final String userDebugger = "root";
    private static final String passwordDebugger = "123";

    public LoginBean() {

    }

    public String login() {
        this.username = RequestManager.getRequestParameter("loginForm:j_username");
        this.password = RequestManager.getRequestParameter("loginForm:j_password");

        if (this.username.equals(userDebugger) && this.password.equals(passwordDebugger)) {
            addInfoMessage("Inicio de sesión exitoso");
            return "index";
        } else {
            addErrorMessage("Las credenciales son incorrectas");
            return "login";
        }
    }


    private void addInfoMessage(String message) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información", message));
    }

    private void addErrorMessage(String message) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", message));
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
