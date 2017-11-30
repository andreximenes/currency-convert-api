package br.com.alx.utils;

import java.util.HashMap;

public class Util {
	
	public static String[] currencyCode = new String[]{
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
	
	
	public static String getCurrencyCodeXCountry(String nomePais) {
		HashMap<String, String> moedaIndex = new HashMap<String, String>();
		moedaIndex.put("Brasil - Real"                      	 , "BRL");
		moedaIndex.put("Estados Unidos - Dólar Americano"   	 , "USD");
		moedaIndex.put("Zona do euro - Euro"                	 , "EUR");
		moedaIndex.put("África do Sul - Rand"               	 , "ZAR");
		moedaIndex.put("Albânia - Lek"                      	 , "ALL");
		moedaIndex.put("Alemanha - Euro"                    	 , "EUR");
		moedaIndex.put("Angola - Kwanza"                    	 , "AOA");
		moedaIndex.put("Arábia Saudita - Rial saudita"      	 , "SAR");
		moedaIndex.put("Argélia - Dinar"                    	 , "DZD");
		moedaIndex.put("Argentina - Peso"                   	 , "ARS");
		moedaIndex.put("Austrália - Dólar australiano"      	 , "AUD");
		moedaIndex.put("Áustria - Euro"                     	 , "EUR");
		moedaIndex.put("Bangladesh - Teca"                  	 , "BDT");
		moedaIndex.put("Belarus - Rublo bielo-russo"             , "BYR");
		moedaIndex.put("Bélgica - Euro"                          , "EUR");
		moedaIndex.put("Bolívia - Boliviano"                     , "BOB");
		moedaIndex.put("Brasil - Real"                           , "BRL");
		moedaIndex.put("Bulgária - Lev"                          , "BGN");
		moedaIndex.put("Canadá - Dólar canadense"                , "CAD");
		moedaIndex.put("Cazaquistão - Tenge"                     , "KZT");
		moedaIndex.put("Chile - Peso"                            , "CLP");
		moedaIndex.put("China - Yuan"                            , "CNY");
		moedaIndex.put("Chipre - Euro"                           , "EUR");
		moedaIndex.put("Cingapura - Dólar de Cingapura"          , "SGD");
		moedaIndex.put("Colômbia - Peso colombiano"              , "COP");
		moedaIndex.put("Coréia do Sul - Won sul-coreano"         , "KRW");
		moedaIndex.put("Croácia - Kuna"                          , "HRK");
		moedaIndex.put("Dinamarca - Coroa dinamarquesa"          , "DKK");
		moedaIndex.put("Egito - Libra egípcia"                   , "EGP");
		moedaIndex.put("Emirados Árabes Unidos - Dirham"         , "AED");
		moedaIndex.put("Eslováquia - Euro"                       , "EUR");
		moedaIndex.put("Eslovênia - Euro"                        , "EUR");
		moedaIndex.put("Espanha - Euro"                          , "EUR");
		moedaIndex.put("Estados Unidos - Dólar Americano"        , "USD");
		moedaIndex.put("Estônia - Euro"                          , "EUR");
		moedaIndex.put("Filipinas - Peso filipino"               , "PHP");
		moedaIndex.put("Finlândia - Euro"                        , "EUR");
		moedaIndex.put("França - Euro"                           , "EUR");
		moedaIndex.put("Grécia - Euro"                           , "EUR");
		moedaIndex.put("Holanda - Euro"                          , "EUR");
		moedaIndex.put("Hong Kong - Dólar de Hong Kong"          , "HKD");
		moedaIndex.put("Hungria - Forinte"                       , "HUF");
		moedaIndex.put("Índia - Rúpia indiana"                   , "INR");
		moedaIndex.put("Indonésia - Rúpia indonésia"             , "IDR");
		moedaIndex.put("Irã - Rial iraniano"                     , "IRR");
		moedaIndex.put("Iraque - Dinar"                          , "IQD");
		moedaIndex.put("Irlanda - Euro"                          , "EUR");
		moedaIndex.put("Islândia - Coroa islandesa"              , "ISK");
		moedaIndex.put("Israel - Shekel"                         , "ILS");
		moedaIndex.put("Itália - Euro"                           , "EUR");
		moedaIndex.put("Japão - Iene"                            , "JPY");
		moedaIndex.put("Jordânia - Dinar jordaniano"             , "JOD");
		moedaIndex.put("Kuait - Dinar kuaitiano"                 , "KWD");
		moedaIndex.put("Laos - Kip laosiano"                     , "LAK");
		moedaIndex.put("Letônia - Euro"                          , "EUR");
		moedaIndex.put("Líbano - Libra libanesa"                 , "LBP");
		moedaIndex.put("Líbia - Dinar líbio"                     , "LYD");
		moedaIndex.put("Lituânia - Litas"                        , "EUR");
		moedaIndex.put("Luxemburgo - Euro"                       , "EUR");
		moedaIndex.put("Malásia - Ringgit"                       , "MYR");
		moedaIndex.put("Malta - Euro"                            , "EUR");
		moedaIndex.put("Marrocos - Dirham marroquino"            , "MAD");
		moedaIndex.put("México - Peso novo mexicano"             , "MXN");
		moedaIndex.put("Moçambique - Metical"                    , "MZN");
		moedaIndex.put("Moldova - Leu"                           , "MDL");
		moedaIndex.put("Mônaco - Euro"                           , "EUR");
		moedaIndex.put("Namíbia - Dólar namibiano"               , "NAD");
		moedaIndex.put("Noruega - Coroa norueguesa"              , "NOK");
		moedaIndex.put("Nova Zelândia - Dólar da Nova Zelândia"  , "NZD");
		moedaIndex.put("Panamá - Balboa"                         , "USD");
		moedaIndex.put("Paquistão - Rúpia paquistanesa"          , "PKR");
		moedaIndex.put("Paraguai - Guarani"                      , "PYG");
		moedaIndex.put("Peru - Novo sol"                         , "PEN");
		moedaIndex.put("Polônia - Zloty"                         , "PLN");
		moedaIndex.put("Portugal - Euro"                         , "EUR");
		moedaIndex.put("Qatar - Rial de Qatar"                   , "QAR");
		moedaIndex.put("Quênia - Xelim queniano"                 , "KES");
		moedaIndex.put("Reino Unido - Libra esterlina"           , "GBP");
		moedaIndex.put("República Tcheca - Coroa tcheca"         , "CZK");
		moedaIndex.put("Romênia - Novo leu romeno"               , "RON");
		moedaIndex.put("Rússia - Rublo"                          , "RUB");
		moedaIndex.put("Síria - Libra síria"                     , "SYP");
		moedaIndex.put("Sri Lanka - Rúpia cingalesa"             , "LKR");
		moedaIndex.put("Suécia - Coroa sueca"                    , "SEK");
		moedaIndex.put("Suíça - Franco suíço"                    , "CHF");
		moedaIndex.put("Tailândia - Baht"                        , "THB");
		moedaIndex.put("Taiwan - Dólar taiwanês"                 , "TWD");
		moedaIndex.put("Tunísia - Dinar tunisiano"               , "TND");
		moedaIndex.put("Turquia - Lira"                          , "TRY");
		moedaIndex.put("Ucrânia - Hrivna"                        , "UAH");
		moedaIndex.put("Zona do euro - Euro"                     , "EUR");
		moedaIndex.put("Uruguai - Peso Uruguaio"                 , "UYU");
		moedaIndex.put("Venezuela - Bolívar"                     , "VEF");
		moedaIndex.put("Zimbábue - Dólar do Zimbábue"            , "USD");
		
		return moedaIndex.get(nomePais);
	}

}
