package br.com.alx.messages;

import java.math.BigDecimal;

public class RequisicaoConversao extends MainMessage{
	
	private static final long serialVersionUID = 9015379319939839728L;

	private BigDecimal valor;
	
	public RequisicaoConversao(String de, String para) {
		super(de, para);
	}

	public RequisicaoConversao() {
		super();
	}


	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
