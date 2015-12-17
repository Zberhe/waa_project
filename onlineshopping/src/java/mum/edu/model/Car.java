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
public class Car {
    private String model;
    private int mileage;
     private String make;
    private double price;
    private String image;
    private int postId;
    private int year;

 
   public static Car createCar(int mileage, double price, String image, int postId, int year,String make,String model){
       return new Car(mileage,price,image,postId,year,make,model);
   }

    public Car(int mileage, double price, String image, int postId, int year,String make,String model) {
        this.mileage = mileage;
        this.price = price;
        this.image = image;
        this.postId = postId;
        this.year = year;
        this.make = make;
        this.model = model;
    }
    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
