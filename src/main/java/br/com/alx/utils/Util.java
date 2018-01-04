package br.com.alx.utils;

import java.util.HashMap;

public class Util {
	private static HashMap<String, String> currencyCodeByCountry;
	private static HashMap<String, String> currencyNameByCountry;
	
	public static String[] currencyCodes = new String[]{
			"BRL", "USD", "EUR", "ZAR", "ALL", "EUR", "AOA", "SAR", "DZD", "ARS", 
			"AUD", "EUR", "BDT", "BYR", "EUR", "BOB", "BRL", "BGN", "CAD", "KZT", 
			"CLP", "CNY", "EUR", "SGD", "COP", "KRW", "HRK", "DKK", "EGP", "AED",
			"EUR", "EUR", "EUR", "USD", "EUR", "PHP", "EUR", "EUR", "EUR", "EUR",
			"HKD", "HUF", "INR", "IDR", "IRR", "IQD", "EUR", "ISK", "ILS", "EUR",
			"JPY", "JOD", "KWD", "LAK", "EUR", "LBP", "LYD", "EUR", "EUR", "MYR",
			"EUR", "MAD", "MXN", "MZN", "MDL", "EUR", "NAD", "NOK", "NZD", "USD",
			"PKR", "PYG", "PEN", "PLN", "EUR", "QAR", "KES", "GBP", "CZK", "RON",
			"RUB", "SYP", "LKR", "SEK", "CHF", "THB", "TWD", "TND", "TRY", "UAH",
			"EUR", "UYU", "VEF", "USD"
	};
	
	public static String[] countryNames = new String[] {
			"BRASIL", "EUA", "ZONA DO EURO", "AFRICA DO SUL", "ALBANIA",
			"ALEMANHA", "ANGOLA", "ARABIA SAUDITA", "ARGELIA", "ARGENTINA",
			"AUSTRALIA", "AUSTRIA", "BANGLADESH", "BELARUS", "BELGICA",
			"BOLIVIA", "BRASIL", "BULGARIA", "CANADA", "CAZAQUISTAO", "CHILE",
			"CHINA", "CHIPRE", "CINGAPURA", "COLOMBIA", "COREIA DO SUL", "CROACIA",
			"DINAMARCA", "EGITO", "EMIRADOS ARABES", "ESLOVAQUIA", "ESLOVENIA",      
			"ESPANHA", "ESTADOS UNIDOS DA AMERICA", "ESTONIA", "FILIPINAS", "FINLANDIA", 
			"FRANCA", "GRECIA", "HOLANDA", "HONG KONG", "HUNGRIA", "INDIA", "INDONESIA",
			"IRA", "IRAQUE", "IRLANDA", "ISLANDIA", "ISRAEL", "ITALIA", "JAPAO", 
			"JORDANIA", "KUAIT", "LAOS", "LETONIA", "LIBANO", "LIBIA", "LITUANIA", "LUXEMBURGO", 
			"MALASIA", "MALTA", "MARROCOS", "MEXICO", "MOCAMBIQUE", "MOLDOVA", "MONACO",    
			"NAMIBIA", "NORUEGA", "NOVA ZELANDIA", "PPANAMA", "PPAQUISTAO", "PAGUAI",      
			"PERU", "POLONIA", "PORTUGAL", "QATAR", "QUENIA", "REINO UNIDO", "REPUBLICA TCHECA", 
			"ROMENIA", "RUSSIA", "SIRIA", "SRI LANKA", "SUECIA", "SUICA", "TAILANDIA", "TAIWAN",        
			"TUNISIA", "TURQUIA", "UCRANIA", "ZONA DO EURO 2", "URUGUAI", "VENEZUELA", "ZIMBABUE"    
		};

	public static String getCurrencyCodeByCountry(String countryName) {
		return currencyCodeByCountry.get(countryName);
	}
	
	public static String getCurrencyNameByCountry(String countryName) {
		return currencyNameByCountry.get(countryName);
	}

	static {
		// currencyCodeByCountry
		currencyCodeByCountry = new HashMap<String, String>();
		currencyCodeByCountry.put("BRASIL"                     	, "BRL");
		currencyCodeByCountry.put("EUA"   	 					, "USD");
		currencyCodeByCountry.put("ESTADOS UNIDOS"   	 		, "USD");
		currencyCodeByCountry.put("ZONA DO EURO"  		        , "EUR");
		currencyCodeByCountry.put("AFRICA DO SUL"              	, "ZAR");
		currencyCodeByCountry.put("ALBANIA"                    	, "ALL");
		currencyCodeByCountry.put("ALEMANHA"                   	, "EUR");
		currencyCodeByCountry.put("ANGOLA"                    	, "AOA");
		currencyCodeByCountry.put("ARABIA SAUDITA"      	 		, "SAR");
		currencyCodeByCountry.put("ARGELIA"                    	, "DZD");
		currencyCodeByCountry.put("ARGENTINA"                  	, "ARS");
		currencyCodeByCountry.put("AUSTRALIA"      	 			, "AUD");
		currencyCodeByCountry.put("AUSTRIA"                    	, "EUR");
		currencyCodeByCountry.put("BANGLADESH"                 	, "BDT");
		currencyCodeByCountry.put("BELARUS"             			, "BYR");
		currencyCodeByCountry.put("BELGICA"                    	, "EUR");
		currencyCodeByCountry.put("BOLIVIA"                    	, "BOB");
		currencyCodeByCountry.put("BRASIL"                     	, "BRL");
		currencyCodeByCountry.put("BULGARIA"                   	, "BGN");
		currencyCodeByCountry.put("CANADA"                		, "CAD");
		currencyCodeByCountry.put("CAZAQUISTAO"                	, "KZT");
		currencyCodeByCountry.put("CHILE"                      	, "CLP");
		currencyCodeByCountry.put("CHINA"                      	, "CNY");
		currencyCodeByCountry.put("CHIPRE"                     	, "EUR");
		currencyCodeByCountry.put("CINGAPURA"          			, "SGD");
		currencyCodeByCountry.put("COLOMBIA"              		, "COP");
		currencyCodeByCountry.put("COREIA DO SUL"         		, "KRW");
		currencyCodeByCountry.put("CROACIA"                    	, "HRK");
		currencyCodeByCountry.put("DINAMARCA"          			, "DKK");
		currencyCodeByCountry.put("EGITO"              	      	, "EGP");
		currencyCodeByCountry.put("EMIRADOS ARABES"         		, "AED");
		currencyCodeByCountry.put("ESLOVAQUIA"               	  	, "EUR");
		currencyCodeByCountry.put("ESLOVENIA"                  	, "EUR");
		currencyCodeByCountry.put("ESPANHA"                    	, "EUR");
		currencyCodeByCountry.put("ESTADOS UNIDOS DA AMERICA"		, "USD");
		currencyCodeByCountry.put("ESTONIA"                    	, "EUR");
		currencyCodeByCountry.put("FILIPINAS"               		, "PHP");
		currencyCodeByCountry.put("FINLANDIA"                  	, "EUR");
		currencyCodeByCountry.put("FRANCA"                     	, "EUR");
		currencyCodeByCountry.put("GRECIA"                     	, "EUR");
		currencyCodeByCountry.put("HOLANDA"                    	, "EUR");
		currencyCodeByCountry.put("HONG KONG"          			, "HKD");
		currencyCodeByCountry.put("HUNGRIA"                    	, "HUF");
		currencyCodeByCountry.put("INDIA"                   		, "INR");
		currencyCodeByCountry.put("INDONESIA"             		, "IDR");
		currencyCodeByCountry.put("IRA"                     		, "IRR");
		currencyCodeByCountry.put("IRAQUE"                     	, "IQD");
		currencyCodeByCountry.put("IRLANDA"                    	, "EUR");
		currencyCodeByCountry.put("ISLANDIA"              		, "ISK");
		currencyCodeByCountry.put("ISRAEL"                     	, "ILS");
		currencyCodeByCountry.put("ITALIA"                     	, "EUR");
		currencyCodeByCountry.put("JAPAO"                      	, "JPY");
		currencyCodeByCountry.put("JORDANIA"             			, "JOD");
		currencyCodeByCountry.put("KUAIT"                 		, "KWD");
		currencyCodeByCountry.put("LAOS"                      	, "LAK");
		currencyCodeByCountry.put("LETONIA"                    	, "EUR");
		currencyCodeByCountry.put("LIBANO"                 		, "LBP");
		currencyCodeByCountry.put("LIBIA"                     	, "LYD");
		currencyCodeByCountry.put("LITUANIA"                   	, "EUR");
		currencyCodeByCountry.put("LUXEMBURGO"                 	, "EUR");
		currencyCodeByCountry.put("MALASIA"                    	, "MYR");
		currencyCodeByCountry.put("MALTA"                      	, "EUR");
		currencyCodeByCountry.put("MARROCOS"            			, "MAD");
		currencyCodeByCountry.put("MEXICO"             			, "MXN");
		currencyCodeByCountry.put("MOCAMBIQUE"                 	, "MZN");
		currencyCodeByCountry.put("MOLDOVA"                    	, "MDL");
		currencyCodeByCountry.put("MONACO"                     	, "EUR");
		currencyCodeByCountry.put("NAMIBIA"               		, "NAD");
		currencyCodeByCountry.put("NORUEGA"              			, "NOK");
		currencyCodeByCountry.put("NOVA ZELANDIA"  				, "NZD");
		currencyCodeByCountry.put("PANAMA"                    	, "USD");
		currencyCodeByCountry.put("PAQUISTAO"          			, "PKR");
		currencyCodeByCountry.put("PAGUAI"                     	, "PYG");
		currencyCodeByCountry.put("PERU"                       	, "PEN");
		currencyCodeByCountry.put("POLONIA"                    	, "PLN");
		currencyCodeByCountry.put("PORTUGAL"                   	, "EUR");
		currencyCodeByCountry.put("QATAR"                   		, "QAR");
		currencyCodeByCountry.put("QUENIA"                 		, "KES");
		currencyCodeByCountry.put("REINO UNIDO"           		, "GBP");
		currencyCodeByCountry.put("REPUBLICA TCHECA"         		, "CZK");
		currencyCodeByCountry.put("ROMENIA"               		, "RON");
		currencyCodeByCountry.put("RUSSIA"                     	, "RUB");
		currencyCodeByCountry.put("SIRIA"                     	, "SYP");
		currencyCodeByCountry.put("SRI LANKA"             		, "LKR");
		currencyCodeByCountry.put("SUECIA"                    	, "SEK");
		currencyCodeByCountry.put("SUICA"                     	, "CHF");
		currencyCodeByCountry.put("TAILANDIA"                  	, "THB");
		currencyCodeByCountry.put("TAIWAN"                 		, "TWD");
		currencyCodeByCountry.put("TUNISIA"               		, "TND");
		currencyCodeByCountry.put("TURQUIA"                    	, "TRY");
		currencyCodeByCountry.put("UCRANIA"                    	, "UAH");
		currencyCodeByCountry.put("ZONA DO EURO 2"             	, "EUR");
		currencyCodeByCountry.put("URUGUAI"                 		, "UYU");
		currencyCodeByCountry.put("VENEZUELA"                  	, "VEF");
		currencyCodeByCountry.put("ZIMBABUE"            			, "ZWD");
		
		// currencyNameByCountry
		currencyNameByCountry = new HashMap<String, String>();
		currencyNameByCountry.put("BRASIL"				, "Real");
		currencyNameByCountry.put("EUA"					, "Dólar Americano");
		currencyNameByCountry.put("ZONA DO EURO"  	   	, "Euro");
		currencyNameByCountry.put("AFRICA DO SUL"      	, "Rand");
		currencyNameByCountry.put("ALBANIA"            	, "Lek");
		currencyNameByCountry.put("ALEMANHA"           	, "Euro");
		currencyNameByCountry.put("ANGOLA"             	, "Kwanza");
		currencyNameByCountry.put("ARABIA SAUDITA"     	, "Rial saudita");
		currencyNameByCountry.put("ARGELIA"            	, "Dinar");
		currencyNameByCountry.put("ARGENTINA"          	, "Peso");
		currencyNameByCountry.put("AUSTRALIA"      		, "Dólar australiano");
		currencyNameByCountry.put("AUSTRIA"            	, "Euro");
		currencyNameByCountry.put("BANGLADESH"         	, "Teca");
		currencyNameByCountry.put("BELARUS"            	, "Rublo bielo-russo");
		currencyNameByCountry.put("BELGICA"            	, "Euro");
		currencyNameByCountry.put("BOLIVIA"            	, "Boliviano");
		currencyNameByCountry.put("BRASIL"             	, "Real");
		currencyNameByCountry.put("BULGARIA"           	, "Lev");
		currencyNameByCountry.put("CANADA"             	, "Dólar canadense");
		currencyNameByCountry.put("CAZAQUISTAO"        	, "Tenge");
		currencyNameByCountry.put("CHILE"              	, "Peso");
		currencyNameByCountry.put("CHINA"              	, "Yuan");
		currencyNameByCountry.put("CHIPRE"             	, "Euro");
		currencyNameByCountry.put("CINGAPURA"          	, "Dólar de Cingapura");
		currencyNameByCountry.put("COLOMBIA"           	, "Peso colombiano");
		currencyNameByCountry.put("COREIA DO SUL"      	, "Won sul-coreano");
		currencyNameByCountry.put("CROACIA"            	, "Kuna");
		currencyNameByCountry.put("DINAMARCA"          	, "Coroa dinamarquesa");
		currencyNameByCountry.put("EGITO"              	, "Libra egípcia");
		currencyNameByCountry.put("EMIRADOS ARABES"    	, "Dirham");
		currencyNameByCountry.put("ESLOVAQUIA"         	, "Euro");
		currencyNameByCountry.put("ESLOVENIA"          	, "Euro");
		currencyNameByCountry.put("ESPANHA"            	, "Euro");
		currencyNameByCountry.put("ESTADOS UNIDOS"     	, "Dólar Americano");
		currencyNameByCountry.put("ESTONIA"            	, "Euro");
		currencyNameByCountry.put("FILIPINAS"          	, "Peso filipino");
		currencyNameByCountry.put("FINLANDIA"          	, "Euro");
		currencyNameByCountry.put("FRANCA"             	, "Euro");
		currencyNameByCountry.put("GRECIA"             	, "Euro");
		currencyNameByCountry.put("HOLANDA"            	, "Euro");
		currencyNameByCountry.put("HONG KONG"          	, "Dólar de Hong Kong");
		currencyNameByCountry.put("HUNGRIA"            	, "Forinte");
		currencyNameByCountry.put("INDIA"              	, "Rúpia indiana");
		currencyNameByCountry.put("INDONESIA"          	, "Rúpia indonésia");
		currencyNameByCountry.put("IRA"                	, "Rial iraniano");
		currencyNameByCountry.put("IRAQUE"             	, "Dinar");
		currencyNameByCountry.put("IRLANDA"            	, "Euro");
		currencyNameByCountry.put("ISLANDIA"           	, "Coroa islandesa");
		currencyNameByCountry.put("ISRAEL"             	, "Shekel");
		currencyNameByCountry.put("ITALIA"             	, "Euro");
		currencyNameByCountry.put("JAPAO"              	, "Iene");
		currencyNameByCountry.put("JORDANIA"           	, "Dinar jordaniano");
		currencyNameByCountry.put("KUAIT"              	, "Dinar kuaitiano");
		currencyNameByCountry.put("LAOS"               	, "Kip laosiano");
		currencyNameByCountry.put("LETONIA"            	, "Euro");
		currencyNameByCountry.put("LIBANO"             	, "Libra libanesa");
		currencyNameByCountry.put("LIBIA"              	, "Dinar líbio");
		currencyNameByCountry.put("LITUANIA"           	, "Litas");
		currencyNameByCountry.put("LUXEMBURGO"         	, "Euro");
		currencyNameByCountry.put("MALASIA"            	, "Ringgit");
		currencyNameByCountry.put("MALTA"              	, "Euro");
		currencyNameByCountry.put("MARROCOS"           	, "Dirham marroquino");
		currencyNameByCountry.put("MEXICO"             	, "Peso novo mexicano");
		currencyNameByCountry.put("MOCAMBIQUE"         	, "Metical");
		currencyNameByCountry.put("MOLDOVA"            	, "Leu");
		currencyNameByCountry.put("MONACO"             	, "Euro");
		currencyNameByCountry.put("NAMIBIA"            	, "Dólar namibiano");
		currencyNameByCountry.put("NORUEGA"            	, "Coroa norueguesa");
		currencyNameByCountry.put("NOVA ZELANDIA"	   	, "Dólar da Nova Zelândia");
		currencyNameByCountry.put("PANAMA"             	, "Balboa");
		currencyNameByCountry.put("PAQUISTAO"          	, "Rúpia paquistanesa");
		currencyNameByCountry.put("PAGUAI"             	, "Guarani");
		currencyNameByCountry.put("PERU"               	, "Novo sol");
		currencyNameByCountry.put("POLONIA"            	, "Zloty");
		currencyNameByCountry.put("PORTUGAL"           	, "Euro");
		currencyNameByCountry.put("QATAR"              	, "Rial de Qatar");
		currencyNameByCountry.put("QUENIA"             	, "Xelim queniano");
		currencyNameByCountry.put("REINO UNIDO"        	, "Libra esterlina");
		currencyNameByCountry.put("REPUBLICA TCHECA"		, "Coroa tcheca");
		currencyNameByCountry.put("ROMENIA"            	, "Novo leu romeno");
		currencyNameByCountry.put("RUSSIA"             	, "Rublo");
		currencyNameByCountry.put("SIRIA"              	, "Libra síria");
		currencyNameByCountry.put("SRI LANKA"          	, "Rúpia cingalesa");
		currencyNameByCountry.put("SUECIA"             	, "Coroa sueca");
		currencyNameByCountry.put("SUICA"              	, "Franco suíço");
		currencyNameByCountry.put("TAILANDIA"          	, "Baht");
		currencyNameByCountry.put("TAIWAN"             	, "Dólar taiwanês");
		currencyNameByCountry.put("TUNISIA"            	, "Dinar tunisiano");
		currencyNameByCountry.put("TURQUIA"            	, "Lira");
		currencyNameByCountry.put("UCRANIA"            	, "Hrivna");
		currencyNameByCountry.put("ZONA DO EURO 2"     	, "Euro");
		currencyNameByCountry.put("URUGUAI"            	, "Peso Uruguaio");
		currencyNameByCountry.put("VENEZUELA"          	, "Bolívar");
		currencyNameByCountry.put("ZIMBABUE"           	, "Dólar do Zimbábue");
	}
	
}
