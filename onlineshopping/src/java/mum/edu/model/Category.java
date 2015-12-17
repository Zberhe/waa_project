/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.edu.model;

import java.util.ArrayList;
import java.util.List;

public class Category{
    private List<String> categories=new ArrayList();
    public Category(){
        categories.add("cloth");
        categories.add("car");
        categories.add("book");        
    }    
    public static List<String> retrieveCategoryNames() {
         return new Category().categories;  
        
    }
    
}
