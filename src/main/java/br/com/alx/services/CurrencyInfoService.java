package br.com.alx.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.alx.domain.CurrencyInfo;
import br.com.alx.exceptions.CurrencyCodeInvalidOrNotFountException;
import br.com.alx.exceptions.CurrencyInfoInvalidOrNotFountException;

public interface CurrencyInfoService {
	public CurrencyInfo findByCountryAndCurrencyCode(String country, String currencyCode);
	public List<CurrencyInfo> findAllByCurrencyCode(String currencyCode);
	public CurrencyInfo save(CurrencyInfo ci);
	public void delete(Integer id);
	public List<CurrencyInfo> findAll();
	public void deleteAll();
	public CurrencyInfo findByCountry(String country) throws CurrencyInfoInvalidOrNotFountException;
	public boolean existsByCountryAndCurrencyCode(String country, String currencyCode);
	public CurrencyInfo findOneByCurrencyCode(String currencyCode);
	public CurrencyInfo findFirstByCurrencyCode(String currencyCode) throws CurrencyCodeInvalidOrNotFountException;
	public void updateQuotes(String[] quotes);
}
