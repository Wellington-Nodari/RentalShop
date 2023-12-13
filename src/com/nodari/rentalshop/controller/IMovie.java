package com.nodari.rentalshop.controller;

import com.nodari.rentalshop.service.Customer;
import com.nodari.rentalshop.service.Movie;

public interface IMovie {

    public void rent(Customer customer, Movie name);

    public void isReturned(Movie name);

    public void reserve(Customer customer, Movie name);

}
