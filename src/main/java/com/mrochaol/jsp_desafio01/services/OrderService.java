package com.mrochaol.jsp_desafio01.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrochaol.jsp_desafio01.entities.Order;

@Service
public class OrderService extends ShippingService {
		
	public Double total(Order order) {
		Double shippingValue = shipment(order);
		Double discountValue = order.getBasic() * (order.getDiscount() / 100); 
		return (order.getBasic() - discountValue + shippingValue);
	}

	@Override
	public Double shipment(Order order) {
		if (order.getBasic() < 100.0) {
			return 20.0;			
		} else if (order.getBasic() >= 100.0 && order.getBasic() < 200.0) {
			return 12.0;			
		} else {
			return 0.0;			
		}
	}

}
