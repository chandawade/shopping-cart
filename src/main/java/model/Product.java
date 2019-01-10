package model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Product implements Serializable {
	
	private static final long serialVersionUID = 6705527563808382509L;
	
	//id of the product
	private Long id;
	
	//name of product
	private String name;
	
	//price of product
	private BigDecimal price; 
	
	//quantity of product that will be added to shopping cart
	private Integer quantity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public boolean equals(Object that) {
		if(this == that) return true;
		
		if (!(that instanceof Product)) return false;
		
		Product product = (Product)that;
		return this.id != null && this.id.equals(product.id);
	}
}
