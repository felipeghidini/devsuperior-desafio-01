package com.devsuperior.primeirodesafio.services;

import org.springframework.stereotype.Service;

@Service
public class DiscountService {
    public double discount(double amount) {
        return amount / 100;
    }
}
