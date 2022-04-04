package com.layer.model;

public class Product {
	private int prodid;
	private String prdname;
	private double cost;
	private int qty;

	public Product() {
	}

	public Product(int prodid, String prdname, double cost, int qty) {
		this.prodid = prodid;
		this.prdname = prdname;
		this.cost = cost;
		this.qty = qty;
	}

	public int getProdid() {
		return prodid;
	}

	public void setProdid(int prodid) {
		this.prodid = prodid;
	}

	public String getPrdname() {
		return prdname;
	}

	public void setPrdname(String prdname) {
		this.prdname = prdname;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}
