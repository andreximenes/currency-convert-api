package br.com.alx.services;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import br.com.alx.messages.Conversao;
import br.com.alx.messages.RequisicaoConversao;
import br.com.alx.utils.Util;

@Service
public class Conversor {
	
	private final static String USER_AGENT = "Mozilla/5.0";
	private static final String URL_COTACAO = "https://economia.uol.com.br/cotacoes/";

	
	private static String[] fetchCotacoes() throws IOException {
		Connection conn = Jsoup.connect(URL_COTACAO);
		conn.ignoreHttpErrors(true);		
		conn.userAgent(USER_AGENT);
		Document doc = conn.get();
		//Elements newsHeadlines = doc.getElementsByAttributeValue("id", "calculadora");
		Elements cotacoes = doc.getElementsByAttributeValue("id", "calculadora").prev().prev();
		String cotacoesAsString = cotacoes.toString();
		String dadosCotacao = cotacoesAsString.substring(cotacoesAsString.indexOf("("), cotacoesAsString.indexOf(")"));
		dadosCotacao = dadosCotacao.replace("(", "").replace(")", ")").replace("\",\"", "#").replace("\"", "").replace(",", ".");
		String[] listaCotacoes = dadosCotacao.split("#");

		return listaCotacoes;
	}


	
	
	private static HashMap<String, BigDecimal> moedaXContacao() throws IOException{
		HashMap<String, BigDecimal> moedaXCotacao = new HashMap<String, BigDecimal>();
		String[] cotacoes = fetchCotacoes();
		for (int i=0; i<cotacoes.length; i++){
			
			if (moedaXCotacao.containsKey(Util.currencyCodes[i])){
				//System.out.println(siglasMoedas[i]+ "-"+i + " = " + cotacoes[i]);
				moedaXCotacao.put(Util.currencyCodes[i] + "-" + i, new BigDecimal(cotacoes[i]));
			} else {
				//System.out.println(siglasMoedas[i] + " = " + cotacoes[i]);
				moedaXCotacao.put(Util.currencyCodes[i], new BigDecimal(cotacoes[i]));
			}
			
		}
		return moedaXCotacao;
	}
	
	
	
	public Conversao calcula (RequisicaoConversao requisicao) throws IOException {
		
		HashMap<String, BigDecimal> cotacoes = moedaXContacao();
		
		Conversao retorno  = new Conversao(requisicao.getDe(), requisicao.getPara());
		
		BigDecimal valorAConverter = requisicao.getValor();
		BigDecimal cotacaoDE= cotacoes.get(requisicao.getDe());
		BigDecimal cotacaoPARA= cotacoes.get(requisicao.getPara());
		BigDecimal valorReal = valorAConverter.multiply(cotacaoDE);
		BigDecimal valorConvertiro = valorReal.divide(cotacaoPARA,2, RoundingMode.HALF_UP);
		
		retorno.setTotal(valorConvertiro);
		return retorno;
	}
	
	
	


}
