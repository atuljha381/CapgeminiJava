package com.layer.ui;

import java.util.Scanner;

import com.layer.dao.ProductDAOImpl;
import com.layer.model.Product;

public class ProdMain {

	public static void main(String[] args) {
		ProductDAOImpl dao = new ProductDAOImpl();
		System.out.println(
				"1.Add product 2.Show Product 3.Show All 4.Update by Cost/n 5.Update by Quantity 6.Delete Product");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice");
		int ch = scanner.nextInt();
		switch (ch) {
		case 1: {
			System.out.println("Enter Id: ");
			int prdno = scanner.nextInt();
			System.out.println("Product Name: ");
			String pname = scanner.next();
			System.out.println("Cost: ");
			double cost = scanner.nextDouble();
			System.out.println("Quantity: ");
			int qty = scanner.nextInt();
			dao.addProduct(new Product(prdno, pname, cost, qty));
			System.out.println("PRoduct Added");
			break;
		}
		case 2: {
			System.out.println("Enter Id: ");
			int prdno = scanner.nextInt();
			Product prdProduct = dao.getProduct(prdno);
			System.out.println(prdProduct);
			break;
		}
		case 3: {

		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}

	}

}
