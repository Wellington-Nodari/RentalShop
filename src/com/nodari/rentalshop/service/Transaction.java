package com.nodari.rentalshop.service;

import com.nodari.rentalshop.controller.Rent;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Transaction implements Rent {

    private int transactionId;
    private String transctionDate;
    private String returnDate;
    private double priceToPay;
    private boolean isOpen;

    public int getTransactionId() {
        return transactionId;
    }

    public String getTransctionDate() {
        return transctionDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public double getPriceToPay() {
        return priceToPay;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public void setTransctionDate(String transctionDate) {
        this.transctionDate = transctionDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public void setPriceToPay(double priceToPay) {
        this.priceToPay = priceToPay;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public void reserveMovie(Customer customer, Movie movie) {
        if(!movie.getIsAvailable()) {
            setTransactionId(1);
            setTransctionDate("2023-12-06");
            movie.setIsAvailable(false);

            System.out.println("The movie has been reserved");
        } else {
            System.out.println("The movie is available for renting right now");
        }
    }

    @Override
    public void rent(Customer customer, Movie movie, String date) {

        if (movie.getIsAvailable()) {
            this.setTransactionId(1);
            this.setTransctionDate("2023-12-06");
            this.setReturnDate("2023-12-09");
            this.setIsOpen(true);
            movie.setIsAvailable(false);
            String lb = movie.getLabel();
            if(lb.equals("A")){
                this.setPriceToPay(5.99);
            } else {
                this.setPriceToPay(3.99);
            }
            System.out.printf("The movie %s%n is rented on %s%n for the customer %s%n", movie.getMovieName(), this.getTransctionDate(), customer.getCustomerName());
            System.out.printf("This movie is label %s%n and the total owned is € %s%n", movie.getLabel(), this.getPriceToPay());
        } else {
            System.out.println("The movie is not available");
        }
    }

    @Override
    public void rentReturn(int id, String date, Movie movie, Customer customer) {
        LocalDate todayDate = LocalDate.parse(date);
        LocalDate returnDate = LocalDate.parse(this.getReturnDate());

        if(todayDate.isBefore(returnDate) || todayDate.isEqual(returnDate)) {
            System.out.printf("The movie is returned without delays the total to pay is €%s%n. \n Thank you!", this.getPriceToPay());
        } else {
            long daysDelayed = Math.abs(ChronoUnit.DAYS.between(returnDate, todayDate));
            double newPrice2Pay = this.priceToPay + ((double) daysDelayed);
            System.out.printf("The movie was returned %s%n day(s) delayed, the total to pay is €%s%n \n Thank you! \n", daysDelayed, newPrice2Pay);
        }
        this.setIsOpen(false);
        movie.setIsAvailable(true);
    }
}
