package br.com.alx.models;

import java.math.BigDecimal;

public class Conversao extends ModelPrincipal{
	
	private static final long serialVersionUID = -1030976682802986920L;
	
	private BigDecimal total;
	
	public Conversao(String de, String para) {
		super(de, para);
	}

	public Conversao() {
		super();
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	

}
