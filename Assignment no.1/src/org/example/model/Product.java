package org.example.model;
public class Product {
	private int id;
	private String name;
	private double Price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		Price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	
	

}
