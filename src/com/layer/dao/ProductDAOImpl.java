package com.layer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.jdbc.DBConnector;
import com.layer.model.Product;

public class ProductDAOImpl implements IProductDAO {

	private Connection conn = null;
	private ResultSet result = null;
	private PreparedStatement pstmt = null;

	public ProductDAOImpl() {
		try {
			conn = DBConnector.getDBResource().getConnected();
			System.out.println("Database is ready and connected");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean addProduct(Product product) {

		boolean flag = false;
		try {
			pstmt = conn.prepareStatement("Insert into product values(?,?,?,?)");
			pstmt.setInt(1, product.getProdid());
			pstmt.setString(2, product.getPrdname());
			pstmt.setDouble(3, product.getCost());
			pstmt.setInt(4, product.getQty());
			pstmt.execute();
			System.out.println("Record Inserted");
			flag = true;
			return flag;
		} catch (Exception e) {
			e.printStackTrace();
			return flag;
		}
	}

	@Override
	public Product getProduct(int prdid) {
		Product product = null;
		try {
			pstmt = conn.prepareStatement("select * from product where prod_id=?");
			pstmt.setInt(1, prdid);
			result = pstmt.executeQuery();
			result.next(); // load record in memory of runtime
			product = new Product(result.getInt(1), result.getString(2), result.getDouble(3), result.getInt(4));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}

	@Override
	public ArrayList<Product> getProducts() {
		ArrayList<Product> products = new ArrayList<>();
		Product product = null;
		try {
			pstmt = conn.prepareStatement("select * from product");
			result = pstmt.executeQuery();
			while (result.next()) {
				product = new Product(result.getInt(1), result.getString(2), result.getDouble(3), result.getInt(4));
				products.add(product);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}

	@Override
	public boolean updateProdCost(int prdid, double cost) {
		boolean flag = false;
		Product product;
		try {
			product = getProduct(prdid);
			product.setCost(cost);
			pstmt = conn.prepareStatement("update product set cost=? where prod_id=?");
			pstmt.setDouble(1, product.getCost());
			pstmt.setInt(2, prdid);
			conn.commit();
			pstmt.execute();
			flag = true;
			System.out.println("Cost Updated");
			return flag;
		} catch (Exception e) {
			return flag;
		}

	}

	@Override
	public boolean updateProdQty(int prdid, int qty) {
		try {
			pstmt = conn.prepareStatement("update product set quantity=? where prod_id=?");
			pstmt.setInt(1, qty);
			pstmt.setInt(2, prdid);
			pstmt.execute();
			conn.commit();
			System.out.println("Quantity Updated");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteProduct(int prid) {
		try {
			pstmt = conn.prepareStatement("delete from product where prod_id=?");
			pstmt.setInt(1, prid);
			pstmt.execute();
			conn.commit();
			System.out.println("Product Deleted");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
