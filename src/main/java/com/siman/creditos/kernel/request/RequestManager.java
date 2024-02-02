package com.siman.creditos.kernel.request;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

public class RequestManager {

    public static String getRequestParameter(String paramName) {
        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        HttpServletRequest request = (HttpServletRequest) context.getRequest();
        return request.getParameter(paramName);
    }

    public static void redirect(String uri) {
        ExternalContext externalContext = FacesContext.getCurrentInstance()
                .getExternalContext();

        try {
            externalContext.redirect(externalContext.getRequestContextPath() + "/" + uri);
        } catch (Exception e) {
            System.err.println("Error al dirigir a " + uri);
        }

    }
}
