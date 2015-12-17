/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.edu.controller;

import mum.edu.model.Cloth;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import mum.edu.model.Products;

/**
 *
 * @author Zehafta M
 */
@Named
@SessionScoped
public class ClothesBean implements Serializable {

    private List<Cloth> clothList;
    private Cloth selectedClothe;

    public ClothesBean() {
      clothList = Products.getClothes();        
    }

    public Cloth getSelectedClothe() {
        return selectedClothe;
    }

    public void setSelectedClothe(Cloth selectedClothe) {
        this.selectedClothe = selectedClothe;
    }

    public List<Cloth> getClothList() {
        return clothList;
    }

    public void setClothList(List<Cloth> clothList) {
        this.clothList = clothList;
    }

    public String viewDetails() {
        return "index";
    }
}
