package br.com.alx.services;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alx.domain.CurrencyInfo;
import br.com.alx.exceptions.ConverterServiceException;
import br.com.alx.messages.Conversion;
import br.com.alx.messages.RequisicaoConversao;

@Service
public class ConverterService {
	
	private final static String USER_AGENT = "Mozilla/5.0";
	private static final String URL_COTACAO = "https://economia.uol.com.br/cotacoes/";
	private static CurrencyInfoService ciService;
	
	@Autowired
	public ConverterService (CurrencyInfoService ciService) {
		this.ciService = ciService;
	}

	private static String[] fetchCotacoes() throws ConverterServiceException {
		String[] listaCotacoes = null;
		try {
			Connection conn = Jsoup.connect(URL_COTACAO);
			conn.ignoreHttpErrors(true);		
			conn.userAgent(USER_AGENT);
			Document doc = conn.get();
			Elements cotacoes = doc.getElementsByAttributeValue("id", "calculadora").prev().prev();
			String cotacoesAsString = cotacoes.toString();
			String dadosCotacao = cotacoesAsString.substring(cotacoesAsString.indexOf("("), cotacoesAsString.indexOf(")"));
			dadosCotacao = dadosCotacao.replace("(", "").replace(")", ")").replace("\",\"", "#").replace("\"", "").replace(",", ".");
			listaCotacoes = dadosCotacao.split("#");
		} catch(Exception e) {
			throw  new ConverterServiceException("Erro ao buscar cotações na fonte: " + URL_COTACAO);
		}
		return listaCotacoes;
	}


	
	
	private void atualizaCotacoes() throws ConverterServiceException{
		String[] quotes = fetchCotacoes();
		ciService.updateQuotes(quotes);
		
	}
	
	public Conversion calculate (RequisicaoConversao requisicao) throws IOException {
		
		CurrencyInfo ciFrom = ciService.findOneByCurrencyCode(requisicao.getDe());
		CurrencyInfo ciTo 	= ciService.findOneByCurrencyCode(requisicao.getPara());
		
		Conversion retorno  = new Conversion(requisicao.getDe(), requisicao.getPara());
		
		BigDecimal valorAConverter = requisicao.getValor();
		BigDecimal cotacaoDE= ciFrom.getQuote();
		BigDecimal cotacaoPARA= ciTo.getQuote();
		BigDecimal valorReal = valorAConverter.multiply(cotacaoDE);
		BigDecimal valorConvertiro = valorReal.divide(cotacaoPARA,2, RoundingMode.HALF_UP);
		
		retorno.setTotal(valorConvertiro);
		return retorno;
	}
	
	
	// transformar esse método em um metodo executado periodicamente
	public void atualizaCotacao() throws ConverterServiceException {
		atualizaCotacoes();
	}
	
	
	


}
