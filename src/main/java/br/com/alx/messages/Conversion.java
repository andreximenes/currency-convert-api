package br.com.alx.messages;

import java.math.BigDecimal;

public class Conversion extends MainMessage{
	
	private static final long serialVersionUID = -1030976682802986920L;
	
	private BigDecimal total;
	
	public Conversion(String de, String para) {
		super(de, para);
	}

	public Conversion() {
		super();
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	

}
