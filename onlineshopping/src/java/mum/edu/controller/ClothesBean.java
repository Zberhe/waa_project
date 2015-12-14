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
public class ClothesBean implements Serializable{
    private List<String[]> clothList = new ArrayList<>();
    public ClothesBean() {
        clothList.add(new String[]{"../resources/images/dress-05.jpg","../resources/images/dress-06.png"});
//      
    }

    public List<String[]> getClothList() {
        return clothList;
    }

    public void setClothList(List<String[]> clothList) {
        this.clothList = clothList;
    }
    public String goToNext(){
        return "index";
    }
}
