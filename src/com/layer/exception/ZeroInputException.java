package com.layer.exception;

public class ZeroInputException extends Exception {
	public ZeroInputException() {
		super("Value cannot be zeor please enter any positive number other than zero");
	}

	@Override
	public String toString() {
		return this.getClass() + "::" + super.getMessage();
	}
}
