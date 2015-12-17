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
import javax.faces.component.behavior.AjaxBehavior;
import javax.inject.Named;
import mum.edu.model.Book;
import mum.edu.model.BookItem;
@Named("carCart")
@SessionScoped
public class CarShopingCartBn implements Serializable {
      private List<BookItem> cart= new ArrayList<>();
    private double total;
    private Book selectedBook;

    public List<BookItem> getCart() {
        return cart;
    }

    public void setCart(List<BookItem> cart) {
        this.cart = cart;
    }

    public double getTotal() {
        total = 0;
        for (BookItem item : cart){
            total = total + (item.getQuantity() * item.getB().getPrice());
        }
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    public String addtoCart(Book b)
    {
        for( BookItem item:cart){
            if(item.getB().getPostId() == b.getPostId())
           {
                item.setQuantity(item.getQuantity()+1);
                return "/pages/cart";               
            }
        }
        //Creating a new item in cart
        BookItem i = new BookItem();
        i.setQuantity(1);
        i.setB(b);
        cart.add(i);
        return "/pages/cart";
    }
    public void update(AjaxBehavior event){
       
    }
    public void remove(BookItem i){
        for( BookItem item:cart){
            if(item.equals(i))
            {
                cart.remove(item);
                break;
            }
        }
    }
  public String payment(){
    return "/pages/payment";
    }
}


