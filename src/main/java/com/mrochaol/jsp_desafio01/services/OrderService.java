package com.mrochaol.jsp_desafio01.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrochaol.jsp_desafio01.entities.Order;

@Service
public class OrderService extends ShippingService {
		
	@Autowired
	private ShippingService shippingService;
	
	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}
	
	public Double total(Order order) {
		Double shippingValue = shippingService.shipment(order);
		Double discountValue = order.getBasic() * (order.getDiscount() / 100); 
		return (order.getBasic() - discountValue + shippingValue);
	}

}
