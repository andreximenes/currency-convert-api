package br.com.alx.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Indicador implements Serializable{
	
	private static final long serialVersionUID = -4639888560143226353L;
	
	public static final String KEY_EMPRESA 			= "empresa";
	public static final String KEY_CODIGO 			= "codigo";
	public static final String KEY_DATA 			= "data";
	public static final String KEY_ABERTURA 		= "abertura";
	public static final String KEY_MAXIMA 			= "maxima";
	public static final String KEY_MINIMA 			= "minima";
	public static final String KEY_FECHAMENTO 		= "fechamento";
	public static final String KEY_ANTERIOR 		= "anterior";
	public static final String KEY_VARIACAO 		= "variacao";
	public static final String KEY_VOLUME 			= "volume";
	public static final String KEY_VOLUME_FINANCEIRO = "volume financeiro";
	public static final String KEY_NEGOCIOS 		= "negocios";
	public static final String KEY_OFERTA_COMPRA 	= "oferta de compra";
	public static final String KEY_OFERTA_VENDA 	= "oferta de venda";
	
	private String empresa;
	private String codigo;
	private String data;
	private String abertura;
	private String maxima;
	private String minima;
	private String fechamento;
	private String anterior;
	private String variacao;
	private String volume;
	private String volumeFinanceiro;
	private String negocios;
	private String ofertaCompra;
	private String ofertaVenda;
	
	public Indicador() {
		super();
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getAbertura() {
		return abertura;
	}

	public void setAbertura(String abertura) {
		this.abertura = abertura;
	}

	public String getMaxima() {
		return maxima;
	}

	public void setMaxima(String maxima) {
		this.maxima = maxima;
	}

	public String getMinima() {
		return minima;
	}

	public void setMinima(String minima) {
		this.minima = minima;
	}

	public String getFechamento() {
		return fechamento;
	}

	public void setFechamento(String fechamento) {
		this.fechamento = fechamento;
	}

	public String getAnterior() {
		return anterior;
	}

	public void setAnterior(String anterior) {
		this.anterior = anterior;
	}

	public String getVariacao() {
		return variacao;
	}

	public void setVariacao(String variacao) {
		this.variacao = variacao;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getVolumeFinanceiro() {
		return volumeFinanceiro;
	}

	public void setVolumeFinanceiro(String volumeFinanceiro) {
		this.volumeFinanceiro = volumeFinanceiro;
	}

	public String getNegocios() {
		return negocios;
	}

	public void setNegocios(String negocios) {
		this.negocios = negocios;
	}

	public String getOfertaCompra() {
		return ofertaCompra;
	}

	public void setOfertaCompra(String ofertaCompra) {
		this.ofertaCompra = ofertaCompra;
	}

	public String getOfertaVenda() {
		return ofertaVenda;
	}

	public void setOfertaVenda(String ofertaVenda) {
		this.ofertaVenda = ofertaVenda;
	}
}
