package com.layer.dao;

import java.util.ArrayList;

import com.layer.model.Sales;

public interface ISalesDAO {
	boolean addSales(Sales sales);

	Sales getProdSales(int ordno);

	ArrayList<Sales> viewAllSales();
}
