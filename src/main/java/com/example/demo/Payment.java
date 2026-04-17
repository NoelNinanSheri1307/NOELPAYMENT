package com.example.demo;

public class Payment {

    private String cardNumber;
    private double amount;
    private String status;

    public Payment(String cardNumber, double amount) {
        this.cardNumber = cardNumber;
        this.amount = amount;

        if (cardNumber == null || cardNumber.length() != 16) {
            this.status = "FAILED";
        } else if (amount <= 0) {
            this.status = "FAILED";
        } else {
            this.status = "SUCCESS";
        }
    }

    public String getCardNumber() { return cardNumber; }
    public double getAmount()     { return amount; }
    public String getStatus()     { return status; }

}