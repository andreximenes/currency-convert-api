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
import br.com.alx.exceptions.CurrencyCodeInvalidOrNotFountException;
import br.com.alx.exceptions.CurrencyInfoInvalidOrNotFountException;
import br.com.alx.exceptions.InvalidAttributesCalcException;
import br.com.alx.messages.Conversion;
import br.com.alx.messages.RequestConverter;

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
			Elements quotes = doc.getElementsByAttributeValue("id", "calculadora").prev().prev();
			String quotesAsString = quotes.toString();
			String dadosCotacao = quotesAsString.substring(quotesAsString.indexOf("("), quotesAsString.indexOf(")"));
			dadosCotacao = dadosCotacao.replace("(", "").replace(")", ")").replace("\",\"", "#").replace("\"", "").replace(",", ".");
			listaCotacoes = dadosCotacao.split("#");
		} catch(Exception e) {
			throw  new ConverterServiceException("Error to fetch quotes in source: " + URL_COTACAO);
		}
		return listaCotacoes;
	}

	public void updateQuotes() throws ConverterServiceException{
		String[] quotes = fetchCotacoes();
		ciService.updateQuotes(quotes);
	}
	
	public Conversion calculate (BigDecimal value, String from, String to) throws IOException, CurrencyCodeInvalidOrNotFountException, InvalidAttributesCalcException {
		
		if (!validateData(value, from, to)){
			throw new InvalidAttributesCalcException();
		}
		
		CurrencyInfo ciFrom = ciService.findFirstByCurrencyCode(from);
		CurrencyInfo ciTo 	= ciService.findFirstByCurrencyCode(to);
		Conversion retorno  = new Conversion(from, to, ciFrom.getUpdateDate());
		
		BigDecimal valorAConverter 	= value;
		BigDecimal quoteFrom 		= ciFrom.getQuote();
		BigDecimal quoteTo			= ciTo.getQuote();
		BigDecimal BRLValue 		= valorAConverter.multiply(quoteFrom);
		BigDecimal convertedValue	= BRLValue.divide(quoteTo,2, RoundingMode.HALF_EVEN);
		
		retorno.setTotal(convertedValue);
		return retorno;
	}

	private boolean validateData(BigDecimal value, String from, String to) {
		boolean ret = true;
		if (value == null || value.min(BigDecimal.ZERO).equals(true) || value.equals(BigDecimal.ZERO) 
				|| from == null || from.equals("") || to == null || to.equals("")) {
			return false;
		}
		return ret;
	}
}
