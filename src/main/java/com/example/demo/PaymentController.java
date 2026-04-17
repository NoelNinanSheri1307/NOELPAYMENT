package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {

    @GetMapping("/pay")
    public Payment pay(@RequestParam String cardNumber,
                       @RequestParam double amount) {

        return new Payment(cardNumber, amount);
    }

}