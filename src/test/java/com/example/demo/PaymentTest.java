package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

  
    @Test
    void testValidPayment() {
        Payment payment = new Payment("1234567890123456", 100.0);
        assertEquals("SUCCESS", payment.getStatus());
    }

   
    @Test
    void testShortCardNumber() {
        Payment payment = new Payment("12345", 100.0);
        assertEquals("FAILED", payment.getStatus());
    }

    @Test
    void testLongCardNumber() {
        Payment payment = new Payment("12345678901234567", 100.0);
        assertEquals("FAILED", payment.getStatus());
    }



    @Test
    void testNegativeAmount() {
        Payment payment = new Payment("1234567890123456", -50.0);
        assertEquals("FAILED", payment.getStatus());
    }

    @Test
    void testNullCardNumber() {
        Payment payment = new Payment(null, 100.0);
        assertEquals("FAILED", payment.getStatus());
    }

}