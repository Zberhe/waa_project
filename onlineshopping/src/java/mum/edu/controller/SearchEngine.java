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
import mum.edu.model.Book;
import mum.edu.model.Car;
import mum.edu.model.Cloth;
import mum.edu.model.Sellers;

/**
 *
 * @author Bereket
 */
@Named("searchBn")
@SessionScoped
public class SearchEngine implements Serializable {

    private String selectedItem;
    private String enteredText;
    private List<Book> foundBooks = new ArrayList();
    private List<Car> foundCars = new ArrayList();
    private List<Cloth> foundClothes = new ArrayList();

    public String getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
    }

    public String getEnteredText() {
        return enteredText;
    }

    public void setEnteredText(String enteredText) {
        this.enteredText = enteredText;
    }

    public List<Book> getFoundBooks() {
        return foundBooks;
    }

    public void setFoundBooks(List<Book> foundBooks) {
        this.foundBooks = foundBooks;
    }

    public List<Car> getFoundCars() {
        return foundCars;
    }

    public void setFoundCars(List<Car> foundCars) {
        this.foundCars = foundCars;
    }

    public List<Cloth> getFoundClothes() {
        return foundClothes;
    }

    public void setFoundClothes(List<Cloth> foundClothes) {
        this.foundClothes = foundClothes;
    }

    public SearchEngine() {
    }

    public String viewSearch() {
        foundBooks.clear();
        if (selectedItem.equals("Books")) {

            for (Book b : Sellers.getBooks()) {

                if (b.getName().toLowerCase().contains(enteredText.toLowerCase()) || b.getAuthor().toLowerCase().contains(enteredText.toLowerCase())) {
                    System.out.println("I found it");
                    foundBooks.add(b);

                }

            }

            return "/pages/booksearchresult";
        } else if (selectedItem.equals("Cars")) {
            foundCars.clear();

            for (Car c : Sellers.getCars()) {
                if (c.getMake().contains(enteredText) || c.getModel().contains(enteredText) || c.getYear() == Integer.parseInt(enteredText)) {
                    foundCars.add(c);

                }

            }
            return "/pages/carsearchresult";
        } else if (selectedItem.equals("Clothes")) {
            foundClothes.clear();

            for (Cloth cl : Sellers.getClothes()) {
                if (cl.getName().contains(enteredText)) {
                    foundClothes.add(cl);

                }
            }
            return "/pages/clothsearchresult";
        } else {
            return "/pages/nothingfound";
        }

    }

}
