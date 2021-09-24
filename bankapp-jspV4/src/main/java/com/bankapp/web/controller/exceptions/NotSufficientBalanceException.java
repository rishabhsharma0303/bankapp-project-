package com.bankapp.web.controller.exceptions;
public class NotSufficientBalanceException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NotSufficientBalanceException(String message) {
		super(message);
	}

}