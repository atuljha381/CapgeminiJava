package com.layer.dao;

import java.util.ArrayList;

import com.layer.model.Product;

public interface IProductDAO {
	boolean addProduct(Product product);

	Product getProduct(int prdid);

	ArrayList<Product> getProducts();

	boolean updateProdCost(int prdid, double cost);

	boolean updateProdQty(int prdid, int qty);

	boolean deleteProduct(int prid);
}
