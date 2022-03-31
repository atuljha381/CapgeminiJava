package com.files;

public class Product {
	private int prodid, cost;
	private String prodname;

	public Product() {
	}

	public Product(int prodid, int cost, String prodname) {
		this.prodid = prodid;
		this.cost = cost;
		this.prodname = prodname;
	}

	public int getProdid() {
		return prodid;
	}

	public void setProdid(int prodid) {
		this.prodid = prodid;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public void showProd() {
		System.out.println("Product ID: " + getProdid());
		System.out.println("Product Name: " + getProdname());
		System.out.println("Product Cost: " + getCost());
	}

}
