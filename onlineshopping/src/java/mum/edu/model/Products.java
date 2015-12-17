/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.edu.model;

import java.util.ArrayList;
import java.util.List;

public class Products implements IcreateObjects {

    private static List<Book> books = new ArrayList();
    private static List<Car> cars = new ArrayList();
    private static List<Cloth> clothes = new ArrayList();

    static {
//cars initializations
        cars.add(new Car(20000, 2800.00, "toyota1.jpg", 2000, 1993,"Toyota","Camry"));
        cars.add(new Car(21000, 2900.00, "toyota2.jpg", 2001, 2003,"Toyota","Corrola"));
        cars.add(new Car(23000, 2200.00, "toyota3.jpg", 2002, 2000,"Toyota","RaV4"));
        cars.add(new Car(24000, 2100.00, "toyota4.jpg", 2003, 1998,"Toyota","Prius"));
        cars.add(new Car(15000, 4000.00, "toyota5.jpg", 2004, 2009,"Toyota","Camry"));
        cars.add(new Car(14000, 5000.00, "toyota6.jpg", 2005, 2010,"Toyota","RaV4"));

       //books intialization
        books.add(new Book("Java How to Program", 20, "java1.jpg", 2585,"Dietel"));
        books.add(new Book("Java Developer's Resource", 20, "java2.gif", 2536,"ABC"));
        books.add(new Book("Head First Java ", 40, "java3.jpg", 2563,"Craig"));
        books.add(new Book("Java Beans ", 40, "java4.jpg", 2553,"Abc A."));
        books.add(new Book("Core Java an Integrated Approach", 40, "java5.jpg", 2553,"Smith A. Snow"));
        //clothes initializers
        clothes.add(new Cloth("Women", "medium", "dress-05.jpg", 253.50, 2535,"Dress"));
        clothes.add(new Cloth("Women", "medium", "dress-06.png", 285.60, 2536,"Dress"));
        clothes.add(new Cloth("Women", "medium", "hoodie.jpg", 600.20, 2563,"Hoodie"));

    }

    public static List<Book> getBooks() {
        return books;
    }

    public static List<Car> getCars() {
        return cars;
    }

    public static List<Cloth> getClothes() {
        return clothes;
    }

    @Override
    public void createCar(int mileage, double price, String image, int postId, int year,String make, String model) {
        cars.add(Car.createCar(mileage, price, image, postId, year,make,model));

    }

    @Override
    public void createBook() {

    }

    @Override
    public void createCloth() {

    }

}
