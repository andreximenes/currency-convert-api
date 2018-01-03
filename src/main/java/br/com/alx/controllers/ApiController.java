package br.com.alx.controllers;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.alx.domain.CurrencyInfo;
import br.com.alx.exceptions.ConverterServiceException;
import br.com.alx.exceptions.CurrencyCodeInvalidOrNotFountException;
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
	@GetMapping({"", "/"})
	public ModelAndView getServerInfo() {
		ModelAndView modelAndView = new ModelAndView("serverInfo");
		return 	modelAndView;
	}
	
	@ResponseBody
	@GetMapping("/calc/value={value}&from={from}&to={to}")
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
	@GetMapping("/update-quotations")
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
	@GetMapping("quotation/country/{country}")
	public ResponseConverter getCurrencyInfoByCountry(@PathVariable String country) throws CurrencyInfoInvalidOrNotFountException {
		ResponseConverter ret = new ResponseConverter();
		try {
			CurrencyInfo data = service.findByCountry(country.toUpperCase());
			ret.setStatus(ResponseMessages.SUCCESS.getCode());
			ret.setInfo(ResponseMessages.SUCCESS.getMsg());
			ret.setData(data);
		} catch (CurrencyInfoInvalidOrNotFountException e) {
			ret.setStatus(ResponseMessages.ERROR.getCode());
			ret.setInfo(e.getMessage());
			ret.setData(null);
		}
		return ret;
	}
	
	@ResponseBody
	@GetMapping("quotation/currency/{code}")
	public ResponseConverter getCurrencyInfoByCode(@PathVariable String code) throws CurrencyCodeInvalidOrNotFountException {
		ResponseConverter ret = new ResponseConverter();
		try {
			CurrencyInfo data = service.findFirstByCurrencyCode(code.toUpperCase());
			ret.setStatus(ResponseMessages.SUCCESS.getCode());
			ret.setInfo(ResponseMessages.SUCCESS.getMsg());
			ret.setData(data);
		} catch (CurrencyCodeInvalidOrNotFountException e) {
			ret.setStatus(ResponseMessages.ERROR.getCode());
			ret.setInfo(e.getMessage());
			ret.setData(null);
		}
		return ret;
	}
	
	@ResponseBody
	@GetMapping("/quotations")
	public ResponseConverter getLista() {
		ResponseConverter ret = new ResponseConverter();
		ret.setStatus(ResponseMessages.SUCCESS.getCode());
		ret.setInfo(ResponseMessages.SUCCESS.getMsg());
		ret.setData(service.findAll());
		return ret;
	}
}
