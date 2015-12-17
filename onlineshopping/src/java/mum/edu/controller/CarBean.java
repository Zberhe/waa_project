/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.edu.controller;

import mum.edu.model.Car;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import mum.edu.model.Sellers;

/**
 *
 * @author Zehafta M
 */
@Named
@RequestScoped
public class CarBean implements Serializable {

    private List<Car> carList;
    private Car selectedCar;

    public CarBean() {
        carList = Sellers.getCars();

    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public Car getSelectedCar() {
        return selectedCar;
    }

    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }

}
