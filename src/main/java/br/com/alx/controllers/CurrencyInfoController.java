package br.com.alx.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	
	@ResponseBody
	@GetMapping("ci/todos")
	public List<CurrencyInfo> getLista() {
		List<CurrencyInfo> lista = service.findAll();
		
		return lista;
	}
	
	
}
