/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.edu.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Zehafta M
 */
@Named
@SessionScoped
public class ClothesBean implements Serializable {

    private List<Clothe> clothList;
    private Clothe selected;

    public ClothesBean() {
        clothList = new ArrayList<>();
        // clothList.add(new String[]{"../resources/images/dress-05.jpg","../resources/images/dress-06.png"});
        clothList.add(new Clothe("dress", "medium", "red", "dress-05.jpg"));
        clothList.add(new Clothe("dress", "medium", "red", "dress-06.png"));
        clothList.add(new Clothe("hoodie", "medium", "solid color", "hoodie.jpg"));
//      
    }

    public Clothe getSelected() {
        return selected;
    }

    public void setSelected(Clothe selected) {
        this.selected = selected;
    }

    public List<Clothe> getClothList() {
        return clothList;
    }

    public void setClothList(List<Clothe> clothList) {
        this.clothList = clothList;
    }

    public String goToNext() {
        return "index";
    }
}
