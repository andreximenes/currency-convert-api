package br.com.alx.exceptions;

public class ConverterServiceException extends Exception{

	private static final long serialVersionUID = 6660785713806466486L;

	public ConverterServiceException(String message) {
		super(message);
	}
}
