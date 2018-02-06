package br.com.alx.controllers;

import java.math.BigDecimal;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alx.domain.Indicador;
import br.com.alx.messages.ResponseIndicadores;
import br.com.alx.messages.ResponseMessages;

@Controller
@RequestMapping("/api/v1")
public class IndicadorController {
	
	private final static String USER_AGENT = "Mozilla/5.0";
	private static final String URL_INDICADORES = "http://www.bolsafinanceira.com/cotacoes/resumo/";

	@ResponseBody
	@GetMapping({"/indicadores/{ind}"})
	public ResponseIndicadores getIndicadores(@PathVariable("ind") String ind) {
		ResponseIndicadores response = new ResponseIndicadores();
		Indicador indicador = fetchIndicadores(ind);
		if (indicador != null) {
			response.setStatus(ResponseMessages.SUCCESS.getCode());
			response.setInfo(ResponseMessages.SUCCESS.getMsg());
			response.setData(indicador);
		} else {
			response.setStatus(ResponseMessages.ERROR.getCode());
			response.setInfo(ResponseMessages.ERROR.getMsg());
		}
		
		return response;
	}
	
	
	
	
	//TODO: Remover essa lógica de negócio de dentro do controller
	private static Indicador fetchIndicadores(String ind){
		Indicador indicador = new Indicador();
		HashMap<String, String> dados = null;
		try {
			Connection conn = Jsoup.connect(URL_INDICADORES+ind);
			conn.ignoreHttpErrors(true);		
			conn.userAgent(USER_AGENT);
			Document doc = conn.timeout(5000).get();
			Elements table = doc.getElementsByAttributeValue("id", "empresa_info");
			Elements rows = table.select("tr");
			dados = new HashMap<>();
			for (int i = 0; i < rows.size(); i++) { //first row is the col names so skip it.
			    Element row = rows.get(i);
			    Elements cols = row.select("td");
			    String  desc = removeAccents(cols.get(0).text());
			    String  valor = cols.get(1).text();
			    dados.put(desc, valor);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		if (dados.size() > 0) {
			indicador.setEmpresa(dados.get(Indicador.KEY_EMPRESA));
			indicador.setCodigo(dados.get(Indicador.KEY_CODIGO));
			indicador.setData(dados.get(Indicador.KEY_DATA));
			indicador.setAbertura(dados.get(Indicador.KEY_ABERTURA));
			indicador.setMaxima(dados.get(Indicador.KEY_MAXIMA));
			indicador.setMinima(dados.get(Indicador.KEY_MINIMA));
			indicador.setFechamento(dados.get(Indicador.KEY_FECHAMENTO));
			indicador.setAnterior(dados.get(Indicador.KEY_ANTERIOR));
			indicador.setVariacao(dados.get(Indicador.KEY_VARIACAO));
			indicador.setVolume(dados.get(Indicador.KEY_VOLUME));
			indicador.setVolumeFinanceiro(dados.get(Indicador.KEY_VOLUME_FINANCEIRO));
			indicador.setNegocios(dados.get(Indicador.KEY_NEGOCIOS));
			indicador.setOfertaCompra(dados.get(Indicador.KEY_OFERTA_COMPRA));
			indicador.setOfertaVenda(dados.get(Indicador.KEY_OFERTA_VENDA));
		} else {
			indicador = null;
		}
		
		return indicador;
		
	}
	
	
	public static String removeAccents(String str) {
		if (str != null && !str.equals("")) {
			str = Normalizer.normalize(str, Normalizer.Form.NFD);
			str = str.replaceAll("[^\\p{ASCII}]", "");
			str = str.replace(":", "");
			str = str.toLowerCase();
		}
	    return str;
	}

}
