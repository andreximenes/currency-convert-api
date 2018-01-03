package br.com.alx.exceptions;

import java.text.MessageFormat;

public class CurrencyCodeInvalidOrNotFountException extends Exception{

	private static final long serialVersionUID = -420226273771038087L;
	private static String message = "currency code: {0} invalid or not found!";

	public CurrencyCodeInvalidOrNotFountException(String info) {
		super(MessageFormat.format(message, new String[] {info}));
	}

}
