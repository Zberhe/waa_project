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
public class Clothe {
   
    private String name;
    private String size;
     private String color;
     private String imgName;

    public Clothe(String name, String size, String color,String imgName) {
        this.color = color;
        this.name = name;
        this.size = size;
        this.imgName = imgName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }
      
    
    
}
