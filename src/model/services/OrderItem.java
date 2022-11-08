package model.services;

import model.entities.Pizza;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	private Pizza pizza;
	
	public OrderItem()	{}

	public OrderItem(Integer quantity, Double price, Pizza pizza) {
		this.quantity = quantity;
		this.price = price;
		this.pizza = pizza;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public Double subTotal() {
		return price * quantity;
	}
	
}
