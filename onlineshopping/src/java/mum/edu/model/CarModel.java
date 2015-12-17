/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.edu.model;

/**
 *
 * @author Zehafta M
 */
import java.util.ArrayList;
import java.util.List;

public class CarModel {
    private List<String> models=new ArrayList();
    public CarModel(){
    models.add("toyota");
    models.add("acura");
    models.add("ford");
    models.add("infiniti");
    } 
   
    public static List<String> retrieveModel() {
       return new CarModel().models;
    }
}
