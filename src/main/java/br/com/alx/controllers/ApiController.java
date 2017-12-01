package br.com.alx.controllers;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alx.domain.CurrencyInfo;
import br.com.alx.exceptions.ConverterServiceException;
import br.com.alx.messages.Conversion;
import br.com.alx.messages.RequisicaoConversao;
import br.com.alx.services.ConverterService;
import br.com.alx.services.CurrencyInfoService;

@RestController
public class ApiController {
	
	private final ConverterService conversor;
	private CurrencyInfoService service;
	
	@Autowired
	public ApiController(ConverterService conversor, CurrencyInfoService service) {
		this.conversor = conversor;
		this.service = service;
	}
	
	@ResponseBody
	@GetMapping("/calcula/valor={valor}&de={de}&para={para}")
    public Conversion index(@PathVariable("valor") String valor,
    					@PathVariable("de") String de,
    					@PathVariable("para") String para) throws IOException {
		
		RequisicaoConversao req = new RequisicaoConversao(de, para);
		req.setValor(new BigDecimal(valor));
		
		Conversion retorno = conversor.calculate(req);
		
        return retorno;
    }

	@ResponseBody
	@GetMapping("/atualiza-cotacao")
	public List<CurrencyInfo> atualizaCotacoes(){
		try {
			conversor.atualizaCotacao();
		} catch (ConverterServiceException e) {
			e.printStackTrace();
		}
		return service.findAll();
	}
	
}
