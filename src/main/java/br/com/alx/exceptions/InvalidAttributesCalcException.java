package br.com.alx.exceptions;

public class InvalidAttributesCalcException extends Exception{

	private static final long serialVersionUID = 6599848591607609987L;

	public InvalidAttributesCalcException() {
		super("all attributes: VALUE, currency FROM and currency TO, must be valids");
	}
}
