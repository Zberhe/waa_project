/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.edu.controller;

/**
 *
 * @author Zehafta M
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

@Named
@SessionScoped
public class FileUploadView implements Serializable {
// @Inject
// private PostBean postBean;

    private UploadedFile file;
//    FacesContext context = FacesContext.getCurrentInstance();

    private String destination = "C:\\Users\\lenovo\\Documents\\GitHub\\waa_project\\onlineshopping\\web\\resources\\images\\";

//    public void setPostBean(PostBean postBean) {
//        this.postBean = postBean;
//    }
    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public String back() {
        return "postSummary?faces-redirect=true";
    }

  public void listener(FileUploadEvent event) {

                file = event.getFile();
                FacesMessage message = new FacesMessage("Succesful", file.getFileName() + " is uploaded.");
                FacesContext.getCurrentInstance().addMessage(null, message);
                try {
                    copyFile(event.getFile().getFileName(), event.getFile().getInputstream());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                FacesContext.getCurrentInstance().responseComplete();
                
    }

    public void copyFile(String fileName, InputStream in) {
        try {

            // write the inputStream to a FileOutputStream
            OutputStream out = new FileOutputStream(new File(destination + fileName));

            int read = 0;
            byte[] bytes = new byte[1024];

            while ((read = in.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
            in.close();
            out.flush();
            out.close();

            System.out.println("New file created!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
