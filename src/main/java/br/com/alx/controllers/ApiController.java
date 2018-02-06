package br.com.alx.controllers;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alx.domain.CurrencyInfo;
import br.com.alx.exceptions.ConverterServiceException;
import br.com.alx.exceptions.CurrencyInfoInvalidOrNotFountException;
import br.com.alx.messages.ResponseConverter;
import br.com.alx.messages.ResponseMessages;
import br.com.alx.services.ConverterService;
import br.com.alx.services.CurrencyInfoService;

@RestController
@RequestMapping("/api/v1")
public class ApiController {
	private final ConverterService conversor;
	private CurrencyInfoService service;
	
	@Autowired
	public ApiController(ConverterService conversor, CurrencyInfoService service) {
		this.conversor = conversor;
		this.service = service;
	}
	
	@ResponseBody
	@GetMapping("/calc/{value}&{from}-{to}")
    public ResponseConverter index(@PathVariable("value") BigDecimal value,
    					@PathVariable("from") String from,
    					@PathVariable("to") String to) throws IOException {
		ResponseConverter ret = new ResponseConverter();
		
		try {
			ret.setStatus(ResponseMessages.SUCCESS.getCode());
			ret.setInfo(ResponseMessages.SUCCESS.getMsg());
			ret.setData(conversor.calculate(value, from, to));
		} catch (Exception e) {
			ret.setStatus(ResponseMessages.ERROR.getCode());
			ret.setInfo(e.getMessage());
			ret.setData(null);
		}
		
        return ret;
    }
	

	@ResponseBody
	@GetMapping("/update-quotes")
	public ResponseConverter atualizaCotacoes(){
		ResponseConverter ret = new ResponseConverter();
		try {
			conversor.updateQuotes();
			ret.setStatus(ResponseMessages.SUCCESS.getCode());
			ret.setInfo(ResponseMessages.SUCCESS.getMsg());
			ret.setData(service.findAll());
		} catch (ConverterServiceException e) {
			ret.setStatus(ResponseMessages.ERROR.getCode());
			ret.setInfo(e.getMessage());
			ret.setData(new ArrayList<>());
			e.printStackTrace();
		}
		return ret;
	}
	
	@ResponseBody
	@GetMapping({"/quote?country={country}", "/quote?code={code}"})
	public ResponseConverter getCurrencyInfoByCountry(@PathVariable Map<String, String> pathVariablesMap) 
			throws CurrencyInfoInvalidOrNotFountException {
		
		ResponseConverter ret = new ResponseConverter();
		CurrencyInfo data = null;
		try {
			
			if (pathVariablesMap.containsKey("country") && pathVariablesMap.get("country") != null &&
					!"".equals(pathVariablesMap.get("country"))) {
				data = service.findByCountry(pathVariablesMap.get("country").toUpperCase());
				
			} else if (pathVariablesMap.containsKey("code") && pathVariablesMap.get("code") != null &&
					!"".equals(pathVariablesMap.get("code"))) {
				data = service.findFirstByCurrencyCode(pathVariablesMap.get("code").toUpperCase());
			} else {
				throw new Exception("Invalid request parameter!");
			}
			
			ret.setStatus(ResponseMessages.SUCCESS.getCode());
			ret.setInfo(ResponseMessages.SUCCESS.getMsg());
			ret.setData(data);
		} catch (Exception e) {
			ret.setStatus(ResponseMessages.ERROR.getCode());
			ret.setInfo(e.getMessage());
			ret.setData(null);
		}
		return ret;
	}
	
	@ResponseBody
	@GetMapping({"/", "/all"})
	public ResponseConverter getLista() {
		ResponseConverter ret = new ResponseConverter();
		ret.setStatus(ResponseMessages.SUCCESS.getCode());
		ret.setInfo(ResponseMessages.SUCCESS.getMsg());
		ret.setData(service.findAll());
		return ret;
	}
}
