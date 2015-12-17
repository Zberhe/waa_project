/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.edu.controller;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.inject.Named;
import mum.edu.model.UserManager;

/**
 *
 * @author Zehafta M
 */
@Named
@SessionScoped
public class LoginBean implements Serializable {

    private boolean enableUser = false;
    private boolean enablePost = false;
    private String userName;
    private String password;
    private boolean isLoggedOn = false;
    private boolean error = false;

    public boolean isIsLoggedOn() {
        return isLoggedOn;
    }

    public void loginListener(ComponentSystemEvent event) {
        if (!isLoggedOn) {
            FacesContext context = FacesContext.getCurrentInstance();
            ConfigurableNavigationHandler handler = (ConfigurableNavigationHandler) context.getApplication().getNavigationHandler();
            handler.performNavigation("/index");
        }

    }

    public void setIsLoggedOn(boolean isLoggedOn) {
        this.isLoggedOn = isLoggedOn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isEnablePost() {
        return enablePost;
    }

    public void setEnablePost(boolean enablePost) {
        this.enablePost = enablePost;
    }

    public boolean isEnableUser() {
        return enableUser;
    }

    public void setEnableUser(boolean enableUser) {
        this.enableUser = enableUser;
    }

    public String onLogin() {

        return "/pages/login";
    }

    public String checkLogin() {
        if (UserManager.verifyUser(userName, password)) {
            isLoggedOn = true;
            return "/category";
        } else {
            error = true;
            return "";
        }
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String logout() {
        isLoggedOn = false;
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/index?faces-redirect=true";

    }

    public String post() {
        if (isLoggedOn) {
            return "/pages/post" + "?faces-redirect=true";
        } else {
            return "/pages/login" + "?faces-redirect=true";
        }
    }

}
