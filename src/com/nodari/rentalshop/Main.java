package com.nodari.rentalshop;

import com.nodari.rentalshop.controller.CreateCustomers;
import com.nodari.rentalshop.controller.CreateMovie;
import com.nodari.rentalshop.service.Customer;
import com.nodari.rentalshop.service.Transaction;

import java.util.List;

public class Main {

    public static void main(String [] args) {

        Transaction transaction = new Transaction();

        System.out.println(CreateMovie.mov1.getIsAvailable());
        transaction.reserveMovie(CreateCustomers.cust1, CreateMovie.mov1);
        System.out.println(CreateMovie.mov1.getIsAvailable());

        transaction.rent(CreateCustomers.cust1, CreateMovie.mov1, "2023-12-06");

        System.out.println("------------- RETURN -------------");

        transaction.rentReturn(1, "2023-12-10", CreateMovie.mov1, CreateCustomers.cust2);

        System.out.println("------------- List -------------");

        List<Customer> cxList = CreateCustomers.getCustomers();
        System.out.println(cxList);

//        Collections.sort(cxList);
//        System.out.println(cxList);

    }

}
