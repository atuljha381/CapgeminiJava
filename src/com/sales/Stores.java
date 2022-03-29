package com.sales;

public class Stores extends SalesTransaction {

	@Override
	public void addProd(Product prod) {
		// TODO Auto-generated method stub
		setProd(prod);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stores stores = new Stores();

		stores.addProd(new Product("SurfExcel", 45, 100));
		Product prod = stores.getProd();
		System.out.format("Product Name: %s\nProduct Quantity: %d\nProduct Cost: %d", prod.getPrdname(), prod.getQty(),
				prod.getCost());

		stores.prodSales(5);

		System.out.format("\nProduct Name: %s\nProduct Quantity: %d\nProduct Cost: %d", prod.getPrdname(),
				prod.getQty(), prod.getCost());
	}

}
