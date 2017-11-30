package br.com.alx.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.alx.domain.CurrencyInfo;
import br.com.alx.repository.CurrencyInfoRepository;
import br.com.alx.services.CurrencyInfoService;

@Service
public class CurrencyInfoServiceImpl implements CurrencyInfoService{
	
	private final CurrencyInfoRepository repository;
	
	@Autowired
	public CurrencyInfoServiceImpl(CurrencyInfoRepository repository) {
		this.repository = repository;
	}

	@Override
	public CurrencyInfo findByCountryAndCurrencyCode(String country, String currencyCode) {
		return repository.findByCountryAndCurrencyCode(country, currencyCode);
	}

	@Override
	public List<CurrencyInfo> findAllByCurrencyCode(String currencyCode) {
		return repository.findAllByCurrencyCode(currencyCode);
	}

	@Override
	public CurrencyInfo save(CurrencyInfo ci) {
		return repository.save(ci);
	}

	@Override
	public void delete(Integer id) {
		repository.delete(id);
	}

	@Override
	public List<CurrencyInfo> findAll() {
		return repository.findAll();
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
	}

}
