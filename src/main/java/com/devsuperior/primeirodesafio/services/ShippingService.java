package com.devsuperior.primeirodesafio.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(double amount) {

        if (amount <= 100.00) {
            return 20.00;
        } if (amount > 100.00 && amount <= 200.00) {
            return 12.00;
        } else {
            return 0.0;
        }
    }
}
