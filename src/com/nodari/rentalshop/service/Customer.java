package com.nodari.rentalshop.service;

import com.nodari.rentalshop.controller.ICustomer;

public class Customer implements ICustomer {

    private String customerName;
    private int accNumb;

    public Customer(String customerName, int accNumb) {
        this.customerName = customerName;
        this.accNumb = accNumb;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccNumb() {
        return accNumb;
    }

    public void setAccNumb(int accNumb) {
        this.accNumb = accNumb;
    }

    @Override
    public void listCustomersById() {

    }

    @Override
    public void listCustomersByName() {

    }

    public String toString() {
        return customerName;
    }

}
