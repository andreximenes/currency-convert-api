package br.com.alx.exceptions;

import java.text.MessageFormat;

public class CurrencyInfoInvalidOrNotFountException extends Exception{

	private static final long serialVersionUID = -420226273771038087L;
	private static String message = "Currency info:  {0} invalid or not found!";

	public CurrencyInfoInvalidOrNotFountException(String info) {
		super(MessageFormat.format(message, new String[] {info}));
	}

}
