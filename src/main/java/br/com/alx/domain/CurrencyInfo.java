package br.com.alx.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Entity
public class CurrencyInfo implements Serializable {

	private static final long serialVersionUID = -1083862045781643475L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String country;
	private String currencyName;
	private String currencyCode;
	private BigDecimal quote;
	private Date updateDate;

	
	
	public CurrencyInfo() {
		super();
	}

	public CurrencyInfo(String country, String currencyName, String currencyCode, BigDecimal quote, Date updateDate) {
		super();
		this.country 	  = country;
		this.currencyName = currencyName;
		this.currencyCode = currencyCode;
		this.quote 		  = quote;
		this.updateDate   = updateDate;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		if (country != null && !country.equals("")) {
			country = country.toUpperCase();
		}
		this.country = country;
	}
	
	public String getCurrencyName() {
		return currencyName;
	}
	public void setCurrencyName(String currencyName) {
		if (currencyName != null && !currencyName.equals("")) {
			currencyName = currencyName.toUpperCase();
		}
		this.currencyName = currencyName;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		if (currencyCode != null && !currencyCode.equals("")) {
			currencyCode = currencyCode.toUpperCase();
		}
		this.currencyCode = currencyCode;
	}

	public BigDecimal getQuote() {
		return quote;
	}
	public void setQuote(BigDecimal quote) {
		this.quote = quote;
	}
	
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
