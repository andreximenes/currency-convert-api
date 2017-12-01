package br.com.alx.utils;

import java.util.HashMap;

public class Util {
	
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

	
	
	public static String getCurrencyCodeByCountry(String nomePais) {
		HashMap<String, String> currencyCodeByCountry = new HashMap<String, String>();
		currencyCodeByCountry.put("BRASIL"                     	, "BRL");
		currencyCodeByCountry.put("EUA"   	 					, "USD");
		currencyCodeByCountry.put("ESTADOS UNIDOS"   	 		, "USD");
		currencyCodeByCountry.put("ZONA DO EURO"  		        , "EUR");
		currencyCodeByCountry.put("AFRICA DO SUL"              	, "ZAR");
		currencyCodeByCountry.put("ALBANIA"                    	, "ALL");
		currencyCodeByCountry.put("ALEMANHA"                   	, "EUR");
		currencyCodeByCountry.put("ANGOLA"                    	, "AOA");
		currencyCodeByCountry.put("ARABIA SAUDITA"      	 	, "SAR");
		currencyCodeByCountry.put("ARGELIA"                    	, "DZD");
		currencyCodeByCountry.put("ARGENTINA"                  	, "ARS");
		currencyCodeByCountry.put("AUSTRALIA"      	 			, "AUD");
		currencyCodeByCountry.put("AUSTRIA"                    	, "EUR");
		currencyCodeByCountry.put("BANGLADESH"                 	, "BDT");
		currencyCodeByCountry.put("BELARUS"             		, "BYR");
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
		currencyCodeByCountry.put("EGITO"              	    	, "EGP");
		currencyCodeByCountry.put("EMIRADOS ARABES"         	, "AED");
		currencyCodeByCountry.put("ESLOVAQUIA"                 	, "EUR");
		currencyCodeByCountry.put("ESLOVENIA"                  	, "EUR");
		currencyCodeByCountry.put("ESPANHA"                    	, "EUR");
		currencyCodeByCountry.put("ESTADOS UNIDOS DA AMERICA"  	, "USD");
		currencyCodeByCountry.put("ESTONIA"                    	, "EUR");
		currencyCodeByCountry.put("FILIPINAS"               	, "PHP");
		currencyCodeByCountry.put("FINLANDIA"                  	, "EUR");
		currencyCodeByCountry.put("FRANCA"                     	, "EUR");
		currencyCodeByCountry.put("GRECIA"                     	, "EUR");
		currencyCodeByCountry.put("HOLANDA"                    	, "EUR");
		currencyCodeByCountry.put("HONG KONG"          			, "HKD");
		currencyCodeByCountry.put("HUNGRIA"                    	, "HUF");
		currencyCodeByCountry.put("INDIA"                   	, "INR");
		currencyCodeByCountry.put("INDONESIA"             		, "IDR");
		currencyCodeByCountry.put("IRA"                     	, "IRR");
		currencyCodeByCountry.put("IRAQUE"                     	, "IQD");
		currencyCodeByCountry.put("IRLANDA"                    	, "EUR");
		currencyCodeByCountry.put("ISLANDIA"              		, "ISK");
		currencyCodeByCountry.put("ISRAEL"                     	, "ILS");
		currencyCodeByCountry.put("ITALIA"                     	, "EUR");
		currencyCodeByCountry.put("JAPAO"                      	, "JPY");
		currencyCodeByCountry.put("JORDANIA"             		, "JOD");
		currencyCodeByCountry.put("KUAIT"                 		, "KWD");
		currencyCodeByCountry.put("LAOS"                     	, "LAK");
		currencyCodeByCountry.put("LETONIA"                    	, "EUR");
		currencyCodeByCountry.put("LIBANO"                 		, "LBP");
		currencyCodeByCountry.put("LIBIA"                     	, "LYD");
		currencyCodeByCountry.put("LITUANIA"                   	, "EUR");
		currencyCodeByCountry.put("LUXEMBURGO"                 	, "EUR");
		currencyCodeByCountry.put("MALASIA"                    	, "MYR");
		currencyCodeByCountry.put("MALTA"                      	, "EUR");
		currencyCodeByCountry.put("MARROCOS"            		, "MAD");
		currencyCodeByCountry.put("MEXICO"             			, "MXN");
		currencyCodeByCountry.put("MOCAMBIQUE"                 	, "MZN");
		currencyCodeByCountry.put("MOLDOVA"                    	, "MDL");
		currencyCodeByCountry.put("MONACO"                     	, "EUR");
		currencyCodeByCountry.put("NAMIBIA"               		, "NAD");
		currencyCodeByCountry.put("NORUEGA"              		, "NOK");
		currencyCodeByCountry.put("NOVA ZELANDIA"  				, "NZD");
		currencyCodeByCountry.put("PPANAMA"                    	, "USD");
		currencyCodeByCountry.put("PPAQUISTAO"          		, "PKR");
		currencyCodeByCountry.put("PAGUAI"                     	, "PYG");
		currencyCodeByCountry.put("PERU"                       	, "PEN");
		currencyCodeByCountry.put("POLONIA"                    	, "PLN");
		currencyCodeByCountry.put("PORTUGAL"                   	, "EUR");
		currencyCodeByCountry.put("QATAR"                   	, "QAR");
		currencyCodeByCountry.put("QUENIA"                 		, "KES");
		currencyCodeByCountry.put("REINO UNIDO"           		, "GBP");
		currencyCodeByCountry.put("REPUBLICA TCHECA"         	, "CZK");
		currencyCodeByCountry.put("ROMENIA"               		, "RON");
		currencyCodeByCountry.put("RUSSIA"                     	, "RUB");
		currencyCodeByCountry.put("SIRIA"                     	, "SYP");
		currencyCodeByCountry.put("SRI LANKA"             		, "LKR");
		currencyCodeByCountry.put("SUECIA"                    	, "SEK");
		currencyCodeByCountry.put("SUICA"                    	, "CHF");
		currencyCodeByCountry.put("TAILANDIA"                  	, "THB");
		currencyCodeByCountry.put("TAIWAN"                 		, "TWD");
		currencyCodeByCountry.put("TUNISIA"               		, "TND");
		currencyCodeByCountry.put("TURQUIA"                    	, "TRY");
		currencyCodeByCountry.put("UCRANIA"                    	, "UAH");
		currencyCodeByCountry.put("ZONA DO EURO 2"             	, "EUR");
		currencyCodeByCountry.put("URUGUAI"                 	, "UYU");
		currencyCodeByCountry.put("VENEZUELA"                  	, "VEF");
		currencyCodeByCountry.put("ZIMBABUE"            		, "USD");
		return currencyCodeByCountry.get(nomePais);
	}
	
	
	
	public static String getCurrencyNameByCountry(String countryName) {
		HashMap<String, String> moedaIndex = new HashMap<String, String>();
		moedaIndex.put("BRASIL"                     , "Real");
		moedaIndex.put("EUA"   	 					, "Dólar Americano");
		moedaIndex.put("ZONA DO EURO"  		        , "Euro");
		moedaIndex.put("AFRICA DO SUL"              , "Rand");
		moedaIndex.put("ALBANIA"                    , "Lek");
		moedaIndex.put("ALEMANHA"                   , "Euro");
		moedaIndex.put("ANGOLA"                    	, "Kwanza");
		moedaIndex.put("ARABIA SAUDITA"      	 	, "Rial saudita");
		moedaIndex.put("ARGELIA"                    , "Dinar");
		moedaIndex.put("ARGENTINA"                  , "Peso");
		moedaIndex.put("AUSTRALIA"      	 		, "Dólar australiano");
		moedaIndex.put("AUSTRIA"                    , "Euro");
		moedaIndex.put("BANGLADESH"                 , "Teca");
		moedaIndex.put("BELARUS"             		, "Rublo bielo-russo");
		moedaIndex.put("BELGICA"                    , "Euro");
		moedaIndex.put("BOLIVIA"                    , "Boliviano");
		moedaIndex.put("BRASIL"                     , "Real");
		moedaIndex.put("BULGARIA"                   , "Lev");
		moedaIndex.put("CANADA"                		, "Dólar canadense");
		moedaIndex.put("CAZAQUISTAO"                , "Tenge");
		moedaIndex.put("CHILE"                      , "Peso");
		moedaIndex.put("CHINA"                      , "Yuan");
		moedaIndex.put("CHIPRE"                     , "Euro");
		moedaIndex.put("CINGAPURA"          		, "Dólar de Cingapura");
		moedaIndex.put("COLOMBIA"              		, "Peso colombiano");
		moedaIndex.put("COREIA DO SUL"         		, "Won sul-coreano");
		moedaIndex.put("CROACIA"                    , "Kuna");
		moedaIndex.put("DINAMARCA"          		, "Coroa dinamarquesa");
		moedaIndex.put("EGITO"              	    , "Libra egípcia");
		moedaIndex.put("EMIRADOS ARABES"         	, "Dirham");
		moedaIndex.put("ESLOVAQUIA"                 , "Euro");
		moedaIndex.put("ESLOVENIA"                  , "Euro");
		moedaIndex.put("ESPANHA"                    , "Euro");
		moedaIndex.put("ESTADOS UNIDOS"  			, "Dólar Americano");
		moedaIndex.put("ESTONIA"                    , "Euro");
		moedaIndex.put("FILIPINAS"               	, "Peso filipino");
		moedaIndex.put("FINLANDIA"                  , "Euro");
		moedaIndex.put("FRANCA"                     , "Euro");
		moedaIndex.put("GRECIA"                     , "Euro");
		moedaIndex.put("HOLANDA"                    , "Euro");
		moedaIndex.put("HONG KONG"          		, "Dólar de Hong Kong");
		moedaIndex.put("HUNGRIA"                    , "Forinte");
		moedaIndex.put("INDIA"                   	, "Rúpia indiana");
		moedaIndex.put("INDONESIA"             		, "Rúpia indonésia");
		moedaIndex.put("IRA"                     	, "Rial iraniano");
		moedaIndex.put("IRAQUE"                     , "Dinar");
		moedaIndex.put("IRLANDA"                    , "Euro");
		moedaIndex.put("ISLANDIA"              		, "Coroa islandesa");
		moedaIndex.put("ISRAEL"                     , "Shekel");
		moedaIndex.put("ITALIA"                     , "Euro");
		moedaIndex.put("JAPAO"                      , "Iene");
		moedaIndex.put("JORDANIA"             		, "Dinar jordaniano");
		moedaIndex.put("KUAIT"                 		, "Dinar kuaitiano");
		moedaIndex.put("LAOS"                     	, "Kip laosiano");
		moedaIndex.put("LETONIA"                    , "Euro");
		moedaIndex.put("LIBANO"                 	, "Libra libanesa");
		moedaIndex.put("LIBIA"                     	, "Dinar líbio");
		moedaIndex.put("LITUANIA"                   , "Litas");
		moedaIndex.put("LUXEMBURGO"                 , "Euro");
		moedaIndex.put("MALASIA"                    , "Ringgit");
		moedaIndex.put("MALTA"                      , "Euro");
		moedaIndex.put("MARROCOS"            		, "Dirham marroquino");
		moedaIndex.put("MEXICO"             		, "Peso novo mexicano");
		moedaIndex.put("MOCAMBIQUE"                 , "Metical");
		moedaIndex.put("MOLDOVA"                    , "Leu");
		moedaIndex.put("MONACO"                     , "Euro");
		moedaIndex.put("NAMIBIA"               		, "Dólar namibiano");
		moedaIndex.put("NORUEGA"              		, "Coroa norueguesa");
		moedaIndex.put("NOVA ZELANDIA"  			, "Dólar da Nova Zelândia");
		moedaIndex.put("PANAMA"                    , "Balboa");
		moedaIndex.put("PAQUISTAO"          		, "Rúpia paquistanesa");
		moedaIndex.put("PAGUAI"                     , "Guarani");
		moedaIndex.put("PERU"                       , "Novo sol");
		moedaIndex.put("POLONIA"                    , "Zloty");
		moedaIndex.put("PORTUGAL"                   , "Euro");
		moedaIndex.put("QATAR"                   	, "Rial de Qatar");
		moedaIndex.put("QUENIA"                 	, "Xelim queniano");
		moedaIndex.put("REINO UNIDO"           		, "Libra esterlina");
		moedaIndex.put("REPUBLICA TCHECA"         	, "Coroa tcheca");
		moedaIndex.put("ROMENIA"               		, "Novo leu romeno");
		moedaIndex.put("RUSSIA"                     , "Rublo");
		moedaIndex.put("SIRIA"                     	, "Libra síria");
		moedaIndex.put("SRI LANKA"             		, "Rúpia cingalesa");
		moedaIndex.put("SUECIA"                    	, "Coroa sueca");
		moedaIndex.put("SUICA"                    	, "Franco suíço");
		moedaIndex.put("TAILANDIA"                  , "Baht");
		moedaIndex.put("TAIWAN"                 	, "Dólar taiwanês");
		moedaIndex.put("TUNISIA"               		, "Dinar tunisiano");
		moedaIndex.put("TURQUIA"                    , "Lira");
		moedaIndex.put("UCRANIA"                    , "Hrivna");
		moedaIndex.put("ZONA DO EURO 2"             , "Euro");
		moedaIndex.put("URUGUAI"                 	, "Peso Uruguaio");
		moedaIndex.put("VENEZUELA"                  , "Bolívar");
		moedaIndex.put("ZIMBABUE"            		, "Dólar do Zimbábue");
		return moedaIndex.get(countryName);
	}
}
