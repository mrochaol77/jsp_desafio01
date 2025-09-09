package com.mrochaol.jsp_desafio01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mrochaol.jsp_desafio01.entities.Order;
import com.mrochaol.jsp_desafio01.services.OrderService;

@SpringBootApplication
public class JspDesafio01Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JspDesafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		OrderService orderService = new OrderService();		
		
		Order order1 = new Order(1034, 150.0, 20.0);
		Order order2 = new Order(2282, 800.0, 10.0);
		Order order3 = new Order(1309, 95.9, 0.0);			
		
		System.out.println("Pedido: " + order1.getCode().toString());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order1));
		System.out.println();
		
		System.out.println("Pedido: " + order2.getCode().toString());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order2));
		System.out.println();

		System.out.println("Pedido: " + order3.getCode().toString());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order3));
		
	}

}
