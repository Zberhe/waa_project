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
public class Book {

    private String name;
    private double price;
    private String image;
    private int postId;

    private String author;

    public static Book createBook(String name, double price, String image, int postId,String author) {
        return new Book(name, price, image, postId,author);
    }

    public Book(String name, double price, String image, int postId,String author) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.postId = postId;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    

}
