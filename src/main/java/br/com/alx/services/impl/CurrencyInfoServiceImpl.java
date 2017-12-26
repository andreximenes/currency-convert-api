package br.com.alx.services.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.alx.domain.CurrencyInfo;
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
	public CurrencyInfo findByCountry(String country) {
		CurrencyInfo ci = repository.findByCountry(country);
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
			ci = repository.findByCountryAndCurrencyCode(Util.countryNames[i],
					Util.getCurrencyCodeByCountry(Util.countryNames[i]));
			if (ci != null) {
				ci.setQuote(new BigDecimal(quotes[i]));
				ci.setUpdateDate(new Date());
			} else {
				ci = new CurrencyInfo(Util.countryNames[i],
						Util.getCurrencyNameByCountry(Util.countryNames[i]), 
						Util.getCurrencyCodeByCountry(Util.countryNames[i]), 
						"", new BigDecimal(quotes[i]), new Date());
			}
			repository.save(ci);
		}
		
	}

}
