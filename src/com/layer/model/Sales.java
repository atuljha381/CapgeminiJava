package com.layer.model;

import java.util.Date;

public class Sales {
	private int ordno;
	private int prodid;
	private int qtyRqrd;
	private Date salesDate;
	private double discount;
	private double totalAmount;
	private double payableAmount;

	public Sales() {
	}

	public Sales(int ordno, int prodid, int qtyRqrd, Date salesDate, double discount, double totalAmount,
			double payableAmount) {
		super();
		this.ordno = ordno;
		this.prodid = prodid;
		this.qtyRqrd = qtyRqrd;
		this.salesDate = salesDate;
		this.discount = discount;
		this.totalAmount = totalAmount;
		this.payableAmount = payableAmount;
	}

	public int getOrdno() {
		return ordno;
	}

	public void setOrdno(int ordno) {
		this.ordno = ordno;
	}

	public int getProdid() {
		return prodid;
	}

	public void setProdid(int prodid) {
		this.prodid = prodid;
	}

	public int getQtyRqrd() {
		return qtyRqrd;
	}

	public void setQtyRqrd(int qtyRqrd) {
		this.qtyRqrd = qtyRqrd;
	}

	public Date getSalesDate() {
		return salesDate;
	}

	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getPayableAmount() {
		return payableAmount;
	}

	public void setPayableAmount(double payableAmount) {
		this.payableAmount = payableAmount;
	}

	@Override
	public String toString() {
		return "Sales [ordno=" + ordno + ", prodid=" + prodid + ", qtyRqrd=" + qtyRqrd + ", salesDate=" + salesDate
				+ ", discount=" + discount + ", totalAmount=" + totalAmount + ", payableAmount=" + payableAmount + "]";
	}

}
