package com.rays.pojo;

import java.io.Serializable;

public class Product implements Serializable{
	
	
	private int proId;
	private String proName;
	private double proPrice;
	private int quantity;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int proId, String proName, double proPrice, int quantity) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proPrice = proPrice;
		this.quantity = quantity;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", proPrice=" + proPrice + ", quantity=" + quantity
				+ "]";
	}
	

}
