/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.edu.model;

public class RegisteredUsers {

    private String fname;
    private String lname;
    private String email;
    private String phone;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String password;

    public RegisteredUsers(String fname, String lname, String email, String phone, String street, String city, String state, int zip, String password) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.password = password;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public String getPassword() {
        return password;
    }
    

}

