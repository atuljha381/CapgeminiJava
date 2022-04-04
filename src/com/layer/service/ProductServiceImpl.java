package com.layer.service;

import java.util.ArrayList;

import com.layer.dao.ProductDAOImpl;
import com.layer.exception.NameLengthException;
import com.layer.exception.ZeroInputException;
import com.layer.model.Product;

public class ProductServiceImpl implements IProductService {

	private ProductDAOImpl dao = null;

	public ProductServiceImpl() {
		dao = new ProductDAOImpl();
	}

	@Override
	public boolean addProduct(Product product) throws ZeroInputException, NameLengthException {
		boolean flag = false;
		try {
			if (product.getProdid() > 0) {
				if (product.getPrdname().length() >= 2) {
					flag = true;
					dao.addProduct(product);
				} else {
					throw new NameLengthException();
				}
			} else {
				throw new ZeroInputException();
			}
			return flag;
		} catch (Exception e) {
			return flag;
		}
	}

	@Override
	public Product getProduct(int prdid) throws ZeroInputException {
		Product product = null;
		try {
			if (prdid > 0) {
				product = dao.getProduct(prdid);
			} else {
				throw new ZeroInputException();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return product;
	}

	@Override
	public ArrayList<Product> getProducts() {
		return dao.getProducts();
	}

	@Override
	public boolean updateProdCost(int prdid, double cost) throws ZeroInputException {
		boolean flag = false;
		try {
			if (prdid > 0 && cost > 0) {
				dao.updateProdCost(prdid, cost);
				flag = true;
			} else
				throw new ZeroInputException();
		} catch (Exception e) {
			System.out.println(e);
			flag = false;
		}
		return flag;
	}

	@Override
	public boolean updateProdQty(int prdid, int qty) throws ZeroInputException {
		boolean flag = false;
		try {
			if (prdid > 0 && qty > 0) {
				dao.updateProdQty(prdid, qty);
				flag = true;
			} else
				throw new ZeroInputException();
		} catch (Exception e) {
			System.out.println(e);
			flag = false;
		}
		return flag;
	}

	@Override
	public boolean deleteProduct(int prdid) throws ZeroInputException {
		boolean flag = false;
		try {
			if (prdid > 0) {
				dao.deleteProduct(prdid);
				flag = true;
			} else
				throw new ZeroInputException();
		} catch (Exception e) {
			System.out.println(e);
			flag = false;
		}
		return flag;

	}

}