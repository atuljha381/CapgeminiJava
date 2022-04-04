package com.layer.exception;

public class NameLengthException extends Exception {
	public NameLengthException() {
		super("Name length should be checked before updating");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass() + "::" + this.getMessage();
	}

}
