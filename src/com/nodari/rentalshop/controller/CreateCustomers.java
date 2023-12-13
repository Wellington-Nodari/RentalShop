package com.nodari.rentalshop.controller;

import com.nodari.rentalshop.service.Customer;

import java.util.ArrayList;
import java.util.List;

public class CreateCustomers {

    public static Customer cust1 = new Customer("Tonho Dalua", 1);
    public static Customer cust2 = new Customer("J. R. R. Tolkien", 2);
    public static Customer cust3 = new Customer("Isaac Asimov", 3);
    public static Customer cust4 = new Customer("Stephen King", 4);

    public static List<String> getCustomersStrings() {
        String cust = getCustomers().toString();
        return null;
    }

    public static List<Customer> getCustomers() {
        List<Customer> cust = new ArrayList<>();
        cust.add(cust1);
        cust.add(cust2);
        cust.add(cust3);
        cust.add(cust4);
        return cust;
    }

}
