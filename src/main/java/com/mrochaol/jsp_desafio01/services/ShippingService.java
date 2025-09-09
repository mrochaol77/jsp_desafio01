package com.mrochaol.jsp_desafio01.services;

import org.springframework.stereotype.Service;

import com.mrochaol.jsp_desafio01.entities.Order;

@Service
public abstract class ShippingService {
	public abstract Double shipment(Order order);
}
