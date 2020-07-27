package com.cg.pecuniabank.exception;

public class AccountDoesntExistException extends Exception {
	private static final long serialVersionUID=1;
	
	public AccountDoesntExistException(String msg){
		super(msg);
	}
}
