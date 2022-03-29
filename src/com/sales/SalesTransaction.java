package com.sales;

public abstract class SalesTransaction implements Sales {
	private Product prod;

	@Override
	public void prodSales(int qtySold) {
		// TODO Auto-generated method stub
		prod.setQty(prod.getQty() - qtySold);

	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}

	public abstract void addProd(Product prod);

}
