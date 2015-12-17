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
import mum.edu.model.Products;

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

            for (Book b : Products.getBooks()) {

                if (b.getName().toLowerCase().contains(enteredText.toLowerCase()) || b.getAuthor().toLowerCase().contains(enteredText.toLowerCase())) {
                    ;
                    foundBooks.add(b);

                }

            }

            return "/pages/booksearchresult";
        } else if (selectedItem.equals("Cars")) {
            foundCars.clear();

            for (Car c : Products.getCars()) {
                try {
                    int price = Integer.parseInt(enteredText);
                    if (c.getYear() == price) {
                        foundCars.add(c);

                    }
                } catch (NumberFormatException e) {
                    if (c.getMake().toLowerCase().contains(enteredText.toLowerCase()) || c.getModel().toLowerCase().contains(enteredText.toLowerCase())) {
                        foundCars.add(c);

                    }

                }
            }
            return "/pages/carsearchresult";
        } else if (selectedItem.equals("Clothes")) {
            foundClothes.clear();

            for (Cloth cl : Products.getClothes()) {
                if (cl.getCategory().toLowerCase().contains(enteredText.toLowerCase())) {
                    foundClothes.add(cl);

                }
            }
            return "/pages/clothsearchresult";
        } else {
            return "/pages/nothingfound";
        }

    }

}
