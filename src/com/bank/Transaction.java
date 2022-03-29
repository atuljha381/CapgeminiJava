package com.bank;

public abstract class Transaction implements ITransaction {
	private Customer customer;

	@Override
	public int withdraw(int amount) {
		// TODO Auto-generated method stub
		if (customer.getDepAmount() - amount < 0)
			System.out.println("Insufficient Balance");
		else {
			customer.setDepAmount(customer.getDepAmount() - amount);
		}
		return (int) customer.getDepAmount();
	}

	@Override
	public int deposit(int amount) {
		// TODO Auto-generated method stub
		customer.setDepAmount(customer.getDepAmount() + amount);
		return (int) customer.getDepAmount();
	}

	protected Customer getCustomer() {
		return customer;
	}

	protected void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public abstract void openAccount(Customer customer);

	public abstract void closeAccount();
}
