package com.pb.entity;

public class Product {
	private int id;
	private String ProductName;
	private double price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String productName, double price) {
		super();
		this.id = id;
		ProductName = productName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", ProductName=" + ProductName + ", price=" + price + "]";
	}
	
}
