/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.edu.controller;

import mum.edu.model.Book;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import mum.edu.model.Products;

/**
 *
 * @author Zehafta M
 */
@Named
@RequestScoped
public class BookBean {

    private List<Book> bookList;
    private Book selectedBook;

    public BookBean() {
    bookList= Products.getBooks();
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Book getSelectedBook() {
        return selectedBook;
    }

    public void setSelectedBook(Book selectedBook) {
        this.selectedBook = selectedBook;
    }

    public String viewDetails() {
        return "viewDetails";
    }

}
