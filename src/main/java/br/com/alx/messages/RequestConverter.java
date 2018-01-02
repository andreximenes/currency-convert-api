package br.com.alx.messages;

import java.math.BigDecimal;

public class RequestConverter extends MainMessage{
	
	private static final long serialVersionUID = 9015379319939839728L;

	private BigDecimal value;
	
	public RequestConverter(BigDecimal value, String from, String to) {
		super(from, to);
		this.value = value;
	}

	public RequestConverter() {
		super();
	}


	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

}
