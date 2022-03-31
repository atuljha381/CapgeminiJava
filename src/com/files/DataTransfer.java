package com.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class DataTransfer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ArrayList<Product> prodList = new ArrayList<Product>();
			FileReader reader = new FileReader("D:\\Eclipse-Workspace\\JavaApp1\\src\\product.txt");
			BufferedReader buffer = new BufferedReader(reader);
			String lineString = "";
			while ((lineString = buffer.readLine()) != null) {
				String[] productDetail = lineString.split(",");
				int id = Integer.parseInt(productDetail[0]);
				String name = productDetail[1];
				int cost = Integer.parseInt(productDetail[2]);
				prodList.add(new Product(id, cost, name));
			}
			Predicate<Product> cond1 = p -> p.getCost() > 25000;
			Predicate<Product> cond2 = p -> p.getProdname().equalsIgnoreCase("apple");

			Consumer<Product> output1 = Product::showProd;

			prodList.stream().filter(cond1).forEach(output1);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
