package br.com.alx.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.alx.domain.CurrencyInfo;

public interface CurrencyInfoRepository extends JpaRepository<CurrencyInfo, Integer> {
	
	public CurrencyInfo findByCountryAndCurrencyCode(String country, String currencyCode);
	public List<CurrencyInfo> findAllByCurrencyCode(String currencyCode);
	public CurrencyInfo findByCountry(String country);
	public boolean existsByCountryAndCurrencyCode(String country, String currencyCode);
	public CurrencyInfo findOneByCurrencyCode(String currencyCode);
	public CurrencyInfo findFirstByCurrencyCode(String currencyCode);
}
