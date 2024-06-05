package com.devsuperior.primeirodesafio;

import com.devsuperior.primeirodesafio.models.Order;
import com.devsuperior.primeirodesafio.services.OrderService;
import com.devsuperior.primeirodesafio.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeirodesafioApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(PrimeirodesafioApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034, 95.90,0.0);
		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order));
	}
}
