package com.ubiqcoding.web;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pusher.rest.Pusher;
import com.ubiqcoding.constants.GeneralConstants;
import com.ubiqcoding.constants.PusherConstants;

import model.Product;

@RestController
@SessionAttributes(GeneralConstants.ID_SESSION_SHOPPING_CART)

public class CartController {
	private List<Product> products = new ArrayList<Product>();
	
	private Pusher pusher;
	
	@PostConstruct
	public void configure() {
		pusher = new Pusher(
			PusherConstants.PUSHER_APP_ID,
			PusherConstants.PUSHER_APP_KEY,
			PusherConstants.PUSHER_APP_SECRET
		);
		
		Product product = new Product();
		product.setId(1L);
		product.setName("Office Chair");
		product.setPrice(new BigDecimal ("55.99"));
		products.add(product);
		
		product = new Product();
		product.setId(3L);
		product.setName("Wireless Headphones");
		product.setPrice(new BigDecimal ("349.01"));
		products.add(product);
		
		product = new Product();
		product.setId(4L);
		product.setName("External Hard Drive");
		product.setPrice(new BigDecimal("89.99"));
		products.add(product);
	}
}
