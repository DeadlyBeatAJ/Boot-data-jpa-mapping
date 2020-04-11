package com.deadlybeat.dto;


public class OrderResponse {

	private String name;
	private String productName;
	private int price;
	
	
	
	public OrderResponse(String name, String productName, int price) {
		super();
		this.name = name;
		this.productName = productName;
		this.price = price;
	}

	public OrderResponse(String name, String productName) {
		super();
		this.name = name;
		this.productName = productName;
	}

	public OrderResponse() {
		super();
	}

	

	@Override
	public String toString() {
		return "OrderResponse [name=" + name + ", productName=" + productName + ", price=" + price + "]";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
}
