package com.deadlybeat.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="PRODUCT_TBL")
public class Product {

	@Id
	private int pid;
	private String productName;
	private int quantity;
	private int price;
	
	public Product(int pid, String productName, int quantity, int price) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
		
}
