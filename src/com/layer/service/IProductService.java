package com.layer.service;

import java.util.ArrayList;

import com.layer.exception.NameLengthException;
import com.layer.exception.ZeroInputException;
import com.layer.model.Product;

public interface IProductService {
	boolean addProduct(Product product) throws ZeroInputException, NameLengthException;

	Product getProduct(int prdid) throws ZeroInputException;

	ArrayList<Product> getProducts();

	boolean updateProdCost(int prdid, double cost) throws ZeroInputException;

	boolean updateProdQty(int prdid, int qty) throws ZeroInputException;

	boolean deleteProduct(int prdid) throws ZeroInputException;
}
