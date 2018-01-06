package br.com.alx.services.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.alx.domain.CurrencyInfo;
import br.com.alx.exceptions.CurrencyCodeInvalidOrNotFountException;
import br.com.alx.exceptions.CurrencyInfoInvalidOrNotFountException;
import br.com.alx.repository.CurrencyInfoRepository;
import br.com.alx.services.CurrencyInfoService;
import br.com.alx.utils.Util;

@Service
public class CurrencyInfoServiceImpl implements CurrencyInfoService {

	private final CurrencyInfoRepository repository;

	@Autowired
	public CurrencyInfoServiceImpl(CurrencyInfoRepository repository) {
		this.repository = repository;
	}

	@Override
	@Transactional(readOnly = true)
	public CurrencyInfo findByCountryAndCurrencyCode(String country, String currencyCode) {
		return repository.findByCountryAndCurrencyCode(country, currencyCode);
	}

	@Override
	@Transactional(readOnly = true)
	public List<CurrencyInfo> findAllByCurrencyCode(String currencyCode) {
		return repository.findAllByCurrencyCode(currencyCode);
	}

	@Override
	@Transactional()
	public CurrencyInfo save(CurrencyInfo ci) {
		return repository.save(ci);
	}

	@Override
	@Transactional()
	public void delete(Integer id) {
		repository.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<CurrencyInfo> findAll() {
		return repository.findAll();
	}

	@Override
	@Transactional()
	public void deleteAll() {
		repository.deleteAll();
	}

	@Override
	@Transactional(readOnly = true)
	public CurrencyInfo findByCountry(String country) throws CurrencyInfoInvalidOrNotFountException {
		CurrencyInfo ci = repository.findByCountry(country);
		if (ci == null) {
			throw new CurrencyInfoInvalidOrNotFountException(country);
		}
		return ci;
	}

	@Override
	@Transactional(readOnly = true)
	public boolean existsByCountryAndCurrencyCode(String country, String currencyCode) {
		return repository.existsByCountryAndCurrencyCode(country, currencyCode);
	}

	@Override
	public CurrencyInfo findOneByCurrencyCode(String currencyCode) {
		return repository.findOneByCurrencyCode(currencyCode);
	}

	@Override
	@Transactional
	public void updateQuotes(String[] quotes) {
		CurrencyInfo ci = null;
		for (int i=0; i<quotes.length; i++){
			ci = repository.findByCountryAndCurrencyCode(Util.getCountryNames()[i],
					Util.getCurrencyCodeByCountry(Util.getCountryNames()[i]));
			if (ci != null) {
				ci.setQuote(new BigDecimal(quotes[i]));
				ci.setUpdateDate(new Date());
				//TODO: depois remover essa linha abaixo, colocada apenas para resolver o problema dos EUA.
				ci.setCurrencyName(Util.getCurrencyNameByCountry(Util.getCountryNames()[i]));
			} else {
				ci = new CurrencyInfo(Util.getCountryNames()[i],
						Util.getCurrencyNameByCountry(Util.getCountryNames()[i]), 
						Util.getCurrencyCodeByCountry(Util.getCountryNames()[i]), 
						null
						, new BigDecimal(quotes[i]), new Date());
			}
			repository.save(ci);
		}
		
	}

	@Override
	public CurrencyInfo findFirstByCurrencyCode(String currencyCode) throws CurrencyCodeInvalidOrNotFountException {
		CurrencyInfo ret = repository.findFirstByCurrencyCode(currencyCode);
		if (ret == null) {
			throw new CurrencyCodeInvalidOrNotFountException(currencyCode);
		}
		return ret;
	}

}
