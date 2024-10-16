package com.pb.entity;

public class LaptopProduct {
	
	private int id;
	private String LaptopBrand;
	private String LaptopName;
	private String LaptopService;
	private double price;
	
	public LaptopProduct() {
		// TODO Auto-generated constructor stub
	}

	public LaptopProduct(int id, String laptopBrand, String laptopName, String laptopService, double price) {
		super();
		this.id = id;
		LaptopBrand = laptopBrand;
		LaptopName = laptopName;
		LaptopService = laptopService;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLaptopBrand() {
		return LaptopBrand;
	}

	public void setLaptopBrand(String laptopBrand) {
		LaptopBrand = laptopBrand;
	}

	public String getLaptopName() {
		return LaptopName;
	}

	public void setLaptopName(String laptopName) {
		LaptopName = laptopName;
	}

	public String getLaptopService() {
		return LaptopService;
	}

	public void setLaptopService(String laptopService) {
		LaptopService = laptopService;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "LaptopProduct [id=" + id + ", LaptopBrand=" + LaptopBrand + ", LaptopName=" + LaptopName
				+ ", LaptopService=" + LaptopService + ", price=" + price + "]";
	}
	
}
