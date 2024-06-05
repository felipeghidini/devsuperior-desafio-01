package com.devsuperior.primeirodesafio.services;

import com.devsuperior.primeirodesafio.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    @Autowired
    private DiscountService discountService;

    public double total(Order order) {
        return order.getBasicValue() - (order.getBasicValue()) * discountService.discount(order.getDiscount())
                + shippingService.shipment(order.getBasicValue());
    }
}
