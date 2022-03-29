package com.bank;

public interface ITransaction {
	int deposit(int amount);

	int withdraw(int amount);
}
