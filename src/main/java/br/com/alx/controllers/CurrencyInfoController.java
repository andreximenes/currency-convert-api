package br.com.alx.controllers;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alx.domain.CurrencyInfo;
import br.com.alx.services.CurrencyInfoService;

@RestController
public class CurrencyInfoController {

	private CurrencyInfoService service;
	
	@Autowired
	public CurrencyInfoController(CurrencyInfoService service) {
		this.service = service;
	}
	
	@GetMapping("/ci/incluir")
	public String incluir() {
		String mensgem = null;
		
		try {
			CurrencyInfo ci = new CurrencyInfo();
			ci.setCountry("brasil");
			ci.setCurrencyCode("brl");
			ci.setCurrencyName("real");
			ci.setQuote(new BigDecimal("1.00"));
			ci.setUpdateDate(new Date());
			service.save(ci);
			mensgem = "sucesso";
			
		} catch (Exception e) {
			mensgem = "error";
			throw e;
		}
		
		return mensgem;
	}
	
	@ResponseBody
	@GetMapping("ci/todos")
	public List<CurrencyInfo> getLista() {
		List<CurrencyInfo> lista = service.findAll();
		
		return lista;
	}
	
	
}
