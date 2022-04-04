package com.layer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.jdbc.DBConnector;
import com.layer.model.Product;
import com.layer.model.Sales;

public class SalesDAOImpl implements ISalesDAO {
	private Connection conn = null;
	private ResultSet result = null;
	private PreparedStatement pstmt = null;
	ProductDAOImpl pdao = null;

	public SalesDAOImpl() {
		try {
			pdao = new ProductDAOImpl();
			conn = DBConnector.getDBResource().getConnected();
			System.out.println("Database Connected");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean addSales(Sales sales) {
		boolean flag = false;
		try {
			pstmt = conn.prepareStatement("Insert into sales values(?,?,?,?,?,?,?)");
			pstmt.setInt(1, sales.getOrdno());
			pstmt.setInt(2, sales.getProdid());
			pstmt.setInt(3, sales.getQtyRqrd());
			pstmt.setString(4, sales.getSalesDate());
			pstmt.setDouble(5, sales.getDiscount());
			pstmt.setDouble(6, sales.getTotalAmount());
			pstmt.setDouble(7, sales.getPayableAmount());

			Product product = pdao.getProduct(sales.getProdid());
			if (product.getQty() > sales.getQtyRqrd()) {
				pstmt.execute();
				pdao.updateProdQty(sales.getProdid(), (product.getQty() - sales.getQtyRqrd()));
				System.out.println("Record Added");
				flag = true;
			} else {
				flag = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}

	@Override
	public Sales getProdSales(int ordno) {
		Sales sales = null;
		try {
			pstmt = conn.prepareStatement("select * from sales where ordno=?");
			pstmt.setInt(1, ordno);
			result = pstmt.executeQuery();
			result.next();
			sales = new Sales(result.getInt(1), result.getInt(2), result.getInt(3),
					result.getString(4).substring(0, 10), result.getDouble(5), result.getDouble(6),
					result.getDouble(7));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sales;
	}

	@Override
	public ArrayList<Sales> viewAllSales() {
		ArrayList<Sales> saleArrayList = new ArrayList<>();
		Sales sales = null;
		try {
			pstmt = conn.prepareStatement("select * from sales");
			result = pstmt.executeQuery();
			while (result.next()) {
				sales = new Sales(result.getInt(1), result.getInt(2), result.getInt(3),
						result.getString(4).substring(0, 10), result.getDouble(5), result.getDouble(6),
						result.getDouble(7));
				saleArrayList.add(sales);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return saleArrayList;
	}

}
