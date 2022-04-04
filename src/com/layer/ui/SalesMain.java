package com.layer.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.layer.dao.ProductDAOImpl;
import com.layer.dao.SalesDAOImpl;
import com.layer.model.Product;
import com.layer.model.Sales;
import com.layer.service.HandleDate;

public class SalesMain {

	public static void main(String[] args) {
		SalesDAOImpl sdao = new SalesDAOImpl();
		ProductDAOImpl pdao = new ProductDAOImpl();
		System.out.println("1.Add Sales Info 2.Get Sale Data 3.Get All Sales Data");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice");
		int ch = scanner.nextInt();
		switch (ch) {
		case 1: {
			System.out.println("Enter Order No: ");
			int ordno = scanner.nextInt();
			System.out.println("Enter Product ID: ");
			int prdno = scanner.nextInt();
			System.out.println("Enter Quantity Required: ");
			int qtyrd = scanner.nextInt();
			System.out.println("Sale Date: ");
			String dateString = scanner.next();
			String[] dt = dateString.split("-");
			String original = HandleDate.getDate(Integer.parseInt(dt[0]), Integer.parseInt(dt[1]),
					Integer.parseInt(dt[2]));

			System.out.println("Discount: ");
			double disc = scanner.nextDouble();

			Product product = pdao.getProduct(prdno);
			double totalAmount = product.getCost() * qtyrd;
			double s = 100 - disc;
			double payableAmount = (s * totalAmount) / 100;
			sdao.addSales(new Sales(ordno, prdno, qtyrd, original, disc, totalAmount, payableAmount));
			System.out.println("Record Added");
			break;
		}
		case 2: {
			System.out.println("Enter Order Id: ");
			int ordno = scanner.nextInt();
			Sales sales = sdao.getProdSales(ordno);
			System.out.println(sales);
			break;
		}
		case 3: {
			ArrayList<Sales> sales = sdao.viewAllSales();
			sales.stream().forEach(System.out::println);
			break;
		}

		default:
			System.exit(0);
		}
	}

}
