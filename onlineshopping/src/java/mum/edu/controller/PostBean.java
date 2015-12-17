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
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Named;
import mum.edu.model.CarModel;
import mum.edu.model.Category;
import mum.edu.model.IcreateObjects;
import mum.edu.model.Sellers;
import mum.edu.model.SizeConstants;

@Named
@SessionScoped
public class PostBean implements Serializable {

    private String category;
    private String itemName = "Section";
    private String author;
    private String makeup;
    private String size;
    private double price;
    private String image;
    private String selectedCategory = "cloth";
    private String selectedSize;
    //car  proporties
    private String selectedModel;
    private int mileage;
    private int postId;
    private int year;

    private String label = "Size:";
    private List<String> categories = Category.retrieveCategoryNames();
    private List<String> sizeOrModel = SizeConstants.retrieveSize();
    private IcreateObjects seller = new Sellers();
    private boolean renderSize = true;
    private boolean authorOn = false;

    private String summaryColumn1;
    private String summaryColumn2;
    private String summaryColumn3;
    private String summaryColumn4;
    private List<String[]> postedProduct = new ArrayList();

    public String processPost() {

        if (selectedCategory.equals("cloth") || selectedCategory.equals("car")) {
            setRenderSize(true);
            switch (selectedCategory) {
                case "car":

                    summaryColumn1 = "Category";

                    summaryColumn2 = "Make";
                    summaryColumn3 = "Model";
                    summaryColumn4 = "Price";
                    //seller.createCar(mileage, price, image, postId, year);
                    if (postedProduct.isEmpty()) {
                        getPostedProduct().add(new String[]{selectedCategory, selectedModel, itemName, "" + price});
                    } else {
                        postedProduct.removeAll(postedProduct);
                        getPostedProduct().add(new String[]{selectedCategory, selectedModel, itemName, "" + price});
                    }
                    break;
                case "cloth":
                    summaryColumn1 = "Category";
                    summaryColumn2 = "Size";
                    summaryColumn3 = "Section";
                    summaryColumn4 = "Price";
                    //   seller.createCloth(selectedSize,itemName,price);
                    if (postedProduct.isEmpty()) {
                        getPostedProduct().add(new String[]{selectedCategory, selectedSize, itemName, "" + price});
                    } else {
                        postedProduct.removeAll(postedProduct);
                        getPostedProduct().add(new String[]{selectedCategory, selectedSize, itemName, "" + price});
                    }
                    break;
                case "book":
                    summaryColumn1 = "Category";
                    summaryColumn2 = "Title";
                    summaryColumn3 = "Author";
                    summaryColumn4 = "Price";
                    // seller.createCloth(selectedSize,itemName,price);
                    if (postedProduct.isEmpty()) {
                        getPostedProduct().add(new String[]{selectedCategory, itemName, author, "" + price});
                    } else {
                        postedProduct.removeAll(postedProduct);
                        getPostedProduct().add(new String[]{selectedCategory, itemName, author, "" + price});
                    }
                    break;
                default:
                    break;
            }
        }
        return "postSummary?faces-redirect=true";
    }

    public void isCloth(AjaxBehaviorEvent e) {
        switch (selectedCategory) {
            case "cloth":
                label = "Size:";
                itemName = "Section:";
                sizeOrModel = SizeConstants.retrieveSize();
                setRenderSize(true);
                setAuthorOn(false);
                break;
            case "car":
                label = "Model:";
                itemName = "Makeup:";
                sizeOrModel = CarModel.retrieveModel();
                setRenderSize(true);
                setAuthorOn(false);
                break;
            case "book":
                setRenderSize(false);
                label = "Title:";
                itemName = "Author:";
                setAuthorOn(true);
                break;
            default:
                break;
        }
    }

    public String getSummaryColumn1() {
        return summaryColumn1;
    }

    public void setSummaryColumn1(String summaryColumn1) {
        this.summaryColumn1 = summaryColumn1;
    }

    public String getSummaryColumn2() {
        return summaryColumn2;
    }

    public void setSummaryColumn2(String summaryColumn2) {
        this.summaryColumn2 = summaryColumn2;
    }

    public String getSummaryColumn3() {
        return summaryColumn3;
    }

    public void setSummaryColumn3(String summaryColumn3) {
        this.summaryColumn3 = summaryColumn3;
    }

    public String getSummaryColumn4() {
        return summaryColumn4;
    }

    public void setSummaryColumn4(String summaryColumn4) {
        this.summaryColumn4 = summaryColumn4;
    }

    public List<String[]> getPostedProduct() {
        return postedProduct;
    }

    public void setPostedProduct(List<String[]> postedProduct) {
        this.postedProduct = postedProduct;
    }

    //Getters and Setter
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the categories
     */
    public List<String> getCategories() {
        return categories;
    }

    /**
     * @param categories the categories to set
     */
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @return the selectedCategory
     */
    public String getSelectedCategory() {
        return selectedCategory;
    }

    /**
     * @param selectedCategory the selectedCategory to set
     */
    public void setSelectedCategory(String selectedCategory) {
        this.selectedCategory = selectedCategory;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the selectedSize
     */
    public String getSelectedSize() {
        return selectedSize;
    }

    /**
     * @param selectedSize the selectedSize to set
     */
    public void setSelectedSize(String selectedSize) {
        this.selectedSize = selectedSize;
    }

    /**
     * @return the sizeConstants
     */
    public List<String> getSizeOrModel() {
        return sizeOrModel;
    }

    /**
     * @param sizeConstants the sizeConstants to set
     */
    public void setSizeOrModel(List<String> sizeOrModel) {
        this.sizeOrModel = sizeOrModel;
    }

    /**
     * @return the renderSize
     */
    public boolean isRenderSize() {
        return renderSize;
    }

    /**
     * @param renderSize the renderSize to set
     */
    public void setRenderSize(boolean renderSize) {
        this.renderSize = renderSize;
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSelectedModel() {
        return selectedModel;
    }

    public void setSelectedModel(String selectedModel) {
        this.selectedModel = selectedModel;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public IcreateObjects getSeller() {
        return seller;
    }

    public void setSeller(IcreateObjects seller) {
        this.seller = seller;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the makeup
     */
    public String getMakeup() {
        return makeup;
    }

    /**
     * @param makeup the makeup to set
     */
    public void setMakeup(String makeup) {
        this.makeup = makeup;
    }

    /**
     * @return the authorOn
     */
    public boolean isAuthorOn() {
        return authorOn;
    }

    /**
     * @param authorOn the authorOn to set
     */
    public void setAuthorOn(boolean authorOn) {
        this.authorOn = authorOn;
    }

}
