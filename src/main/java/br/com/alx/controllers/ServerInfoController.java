package br.com.alx.controllers;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.alx.domain.CurrencyInfo;
import br.com.alx.exceptions.CurrencyCodeInvalidOrNotFountException;
import br.com.alx.exceptions.InvalidAttributesCalcException;
import br.com.alx.messages.Conversion;
import br.com.alx.services.ConverterService;
import br.com.alx.services.CurrencyInfoService;

@Controller
public class ServerInfoController {
	private ConverterService conversor;
	private CurrencyInfoService service;
	
	@Autowired
	public ServerInfoController(ConverterService conversor, CurrencyInfoService service) {
		this.conversor = conversor;
		this.service = service;
	}

	@GetMapping({"/", "/home"})
	public ModelAndView getServerInfo() {
		ModelAndView mav = new ModelAndView("serverInfo");
		List<CurrencyInfo> listaMoedas = service.findAll();
		mav.addObject("listaMoedas", listaMoedas);
		return 	mav;
	}
	
	@PostMapping("/calculo-conversao")
	public ModelAndView calculaConversao(@RequestParam("moedaOrigem") String moedaOrigem,
			@RequestParam("moedaDestino") String moedaDestino, @RequestParam("valor") String valor) throws IOException, CurrencyCodeInvalidOrNotFountException, InvalidAttributesCalcException {
		
		Conversion conversao = conversor.calculate(new BigDecimal(valor), moedaOrigem, moedaDestino);
		
		ModelAndView mav = new ModelAndView("serverInfo");
		mav.addObject("moedaOrigem", moedaOrigem);
		mav.addObject("moedaDestino", moedaDestino);
		mav.addObject("valorConvertido", conversao.getTotal());
		
		return mav;
		
	}

}
