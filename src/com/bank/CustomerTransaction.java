package com.bank;

public class CustomerTransaction extends Transaction {
	private Customer customer;

	@Override
	public void openAccount(Customer customer) {
		// TODO Auto-generated method stub
		setCustomer(customer);
		System.out.println("Congratulations,Your Bank Account has been Activated: " + customer.getDepAmount());

	}

	@Override
	public void closeAccount() {
		// TODO Auto-generated method stub
		customer = getCustomer();
		customer.setStatus(false);

	}

//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerTransaction customerTransaction = new CustomerTransaction();
		customerTransaction.openAccount(new Customer(1231, "Atul", 15000));
		Customer cus = customerTransaction.getCustomer();
		System.out.format("Account No: %d\nAccount Name: %s\nBalance: %.2f\n", cus.getAcno(), cus.getAcname(),
				cus.getDepAmount());
		System.out.println(customerTransaction.deposit(22000));
		System.out.println(customerTransaction.withdraw(15000));

	}

}
