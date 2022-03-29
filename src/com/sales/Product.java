package com.sales;

public class Product {
	private String prdname;
	private int cost, qty;

	public Product() {
	}

	public Product(String prdname, int cost, int qty) {
		super();
		this.prdname = prdname;
		this.cost = cost;
		this.qty = qty;
	}

	public String getPrdname() {
		return prdname;
	}

	public void setPrdname(String prdname) {
		this.prdname = prdname;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}
