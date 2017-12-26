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
	
	
	public static String getCurrencyCodeXCountry(String nomePais) {
		HashMap<String, String> moedaIndex = new HashMap<String, String>();
		moedaIndex.put("BRASIL"                      , "BRL");
		moedaIndex.put("EUA"   	 					, "USD");
		moedaIndex.put("ESTADOS UNIDOS"   	 		, "USD");
		moedaIndex.put("ZONA DO EURO"  		        	, "EUR");
		moedaIndex.put("AFRICA DO SUL"               , "ZAR");
		moedaIndex.put("ALBANIA"                     , "ALL");
		moedaIndex.put("ALEMANHA"                    , "EUR");
		moedaIndex.put("ANGOLA"                    	, "AOA");
		moedaIndex.put("ARABIA SAUDITA"      	 	, "SAR");
		moedaIndex.put("ARGELIA"                    	, "DZD");
		moedaIndex.put("ARGENTINA"                   , "ARS");
		moedaIndex.put("AUSTRALIA"      	 			, "AUD");
		moedaIndex.put("AUSTRIA"                     , "EUR");
		moedaIndex.put("BANGLADESH"                  , "BDT");
		moedaIndex.put("BELARUS"             		, "BYR");
		moedaIndex.put("BELGICA"                     , "EUR");
		moedaIndex.put("BOLIVIA"                     , "BOB");
		moedaIndex.put("BRASIL"                      , "BRL");
		moedaIndex.put("BULGARIA"                    , "BGN");
		moedaIndex.put("CANADA"                		, "CAD");
		moedaIndex.put("CAZAQUISTAO"                 , "KZT");
		moedaIndex.put("CHILE"                       , "CLP");
		moedaIndex.put("CHINA"                       , "CNY");
		moedaIndex.put("CHIPRE"                      , "EUR");
		moedaIndex.put("CINGAPURA"          			, "SGD");
		moedaIndex.put("COLOMBIA"              		, "COP");
		moedaIndex.put("COREIA DO SUL"         		, "KRW");
		moedaIndex.put("CROACIA"                     , "HRK");
		moedaIndex.put("DINAMARCA"          			, "DKK");
		moedaIndex.put("EGITO"              	     	, "EGP");
		moedaIndex.put("EMIRADOS ARABES"         	, "AED");
		moedaIndex.put("ESLOVAQUIA"                  , "EUR");
		moedaIndex.put("ESLOVENIA"                   , "EUR");
		moedaIndex.put("ESPANHA"                     , "EUR");
		moedaIndex.put("ESTADOS UNIDOS DA AMERICA"   , "USD");
		moedaIndex.put("ESTONIA"                     , "EUR");
		moedaIndex.put("FILIPINAS"               	, "PHP");
		moedaIndex.put("FINLANDIA"                   , "EUR");
		moedaIndex.put("FRANCA"                      , "EUR");
		moedaIndex.put("GRECIA"                      , "EUR");
		moedaIndex.put("HOLANDA"                     , "EUR");
		moedaIndex.put("HONG KONG"          			, "HKD");
		moedaIndex.put("HUNGRIA"                     , "HUF");
		moedaIndex.put("INDIA"                   	, "INR");
		moedaIndex.put("INDONESIA"             		, "IDR");
		moedaIndex.put("IRA"                     	, "IRR");
		moedaIndex.put("IRAQUE"                      , "IQD");
		moedaIndex.put("IRLANDA"                     , "EUR");
		moedaIndex.put("ISLANDIA"              		, "ISK");
		moedaIndex.put("ISRAEL"                      , "ILS");
		moedaIndex.put("ITALIA"                      , "EUR");
		moedaIndex.put("JAPAO"                       , "JPY");
		moedaIndex.put("JORDANIA"             		, "JOD");
		moedaIndex.put("KUAIT"                 		, "KWD");
		moedaIndex.put("LAOS"                     	, "LAK");
		moedaIndex.put("LETONIA"                     , "EUR");
		moedaIndex.put("LIBANO"                 		, "LBP");
		moedaIndex.put("LIBIA"                     	, "LYD");
		moedaIndex.put("LITUANIA"                    , "EUR");
		moedaIndex.put("LUXEMBURGO"                  , "EUR");
		moedaIndex.put("MALASIA"                     , "MYR");
		moedaIndex.put("MALTA"                       , "EUR");
		moedaIndex.put("MARROCOS"            		, "MAD");
		moedaIndex.put("MEXICO"             			, "MXN");
		moedaIndex.put("MOCAMBIQUE"                  , "MZN");
		moedaIndex.put("MOLDOVA"                     , "MDL");
		moedaIndex.put("MONACO"                      , "EUR");
		moedaIndex.put("NAMIBIA"               		, "NAD");
		moedaIndex.put("NORUEGA"              		, "NOK");
		moedaIndex.put("NOVA ZELANDIA"  				, "NZD");
		moedaIndex.put("PPANAMA"                     , "USD");
		moedaIndex.put("PPAQUISTAO"          		, "PKR");
		moedaIndex.put("PAGUAI"                      , "PYG");
		moedaIndex.put("PERU"                        , "PEN");
		moedaIndex.put("POLONIA"                     , "PLN");
		moedaIndex.put("PORTUGAL"                    , "EUR");
		moedaIndex.put("QATAR"                   	, "QAR");
		moedaIndex.put("QUENIA"                 		, "KES");
		moedaIndex.put("REINO UNIDO"           		, "GBP");
		moedaIndex.put("REPUBLICA TCHECA"         	, "CZK");
		moedaIndex.put("ROMENIA"               		, "RON");
		moedaIndex.put("RUSSIA"                      , "RUB");
		moedaIndex.put("SIRIA"                     	, "SYP");
		moedaIndex.put("SRI LANKA"             		, "LKR");
		moedaIndex.put("SUECIA"                    	, "SEK");
		moedaIndex.put("SUICA"                    	, "CHF");
		moedaIndex.put("TAILANDIA"                   , "THB");
		moedaIndex.put("TAIWAN"                 		, "TWD");
		moedaIndex.put("TUNISIA"               		, "TND");
		moedaIndex.put("TURQUIA"                     , "TRY");
		moedaIndex.put("UCRANIA"                     , "UAH");
		moedaIndex.put("ZONA DO EURO 2"              , "EUR");
		moedaIndex.put("URUGUAI"                 	, "UYU");
		moedaIndex.put("VENEZUELA"                   , "VEF");
		moedaIndex.put("ZIMBABUE"            		, "USD");
		
		return moedaIndex.get(nomePais);
	}
	
	
	
	//Implementar o hash de pais e simbolo monetario
	private static String TODO(String nomePais) {
		HashMap<String, String> moedaIndex = new HashMap<String, String>();
		moedaIndex.put("Brasil"             	, "Real");
		moedaIndex.put("Estados Unidos"     	, "Dólar Americano");
		moedaIndex.put("Zona do euro"       	, "Euro");
		moedaIndex.put("África do Sul"		, "Rand");
		moedaIndex.put("Albânia" 			, "Lek");
		moedaIndex.put("Alemanha" 			, "Euro");
		moedaIndex.put("Angola" 				, "Kwanza");
		moedaIndex.put("Arábia Saudita" 		, "Rial saudita");
		moedaIndex.put("Argélia" 			, "Dinar");
		moedaIndex.put("Argentina" 			, "Peso");
		moedaIndex.put("Austrália" 			, "Dólar australiano");
		moedaIndex.put("Áustria"            	, "Euro");
		moedaIndex.put("Bangladesh"         	, "Teca");
		moedaIndex.put("Belarus"            	, "Rublo bielo-russo");
		moedaIndex.put("Bélgica"            	, "Euro");
		moedaIndex.put("Bolívia"            	, "Boliviano");
		moedaIndex.put("Brasil"             	, "Real");
		moedaIndex.put("Bulgária"           	, "Lev");
		moedaIndex.put("Canadá"             	, "Dólar canadense");
		moedaIndex.put("Cazaquistão"        	, "Tenge");
		moedaIndex.put("Chile"              	, "Peso");
		moedaIndex.put("China"              	, "Yuan");
		moedaIndex.put("Chipre"             	, "Euro");
		moedaIndex.put("Cingapura"          	, "Dólar de Cingapura");
		moedaIndex.put("Colômbia"           	, "Peso colombiano");
		moedaIndex.put("Coréia do Sul"      	, "Won sul-coreano");
		moedaIndex.put("Croácia"            	, "Kuna");
		moedaIndex.put("Dinamarca"          	, "Coroa dinamarquesa");
		moedaIndex.put("Egito"              	, "Libra egípcia");
		moedaIndex.put("Emirados Árabes Unidos" , "Dirham");
		moedaIndex.put("Eslováquia"             , "Euro");
		moedaIndex.put("Eslovênia"              , "Euro");
		moedaIndex.put("Espanha"                , "Euro");
		moedaIndex.put("Estados Unidos"         , "Dólar Americano");
		moedaIndex.put("Estônia"                , "Euro");
		moedaIndex.put("Filipinas"              , "Peso filipino");
		moedaIndex.put("Finlândia"              , "Euro");
		moedaIndex.put("França"                 , "Euro");
		moedaIndex.put("Grécia"                 , "Euro");
		moedaIndex.put("Holanda"                , "Euro");
		moedaIndex.put("Hong Kong"              , "Dólar de Hong Kong");
		moedaIndex.put("Hungria"                , "Forinte");
		moedaIndex.put("Índia"                  , "Rúpia indiana");
		moedaIndex.put("Indonésia"              , "Rúpia indonésia");
		moedaIndex.put("Irã"                    , "Rial iraniano");
		moedaIndex.put("Iraque"                 , "Dinar");
		moedaIndex.put("Irlanda"                , "Euro");
		moedaIndex.put("Islândia"               , "Coroa islandesa");
		moedaIndex.put("Israel"                 , "Shekel");
		moedaIndex.put("Itália"                 , "Euro");
		moedaIndex.put("Japão"                  , "Iene");
		moedaIndex.put("Jordânia"               , "Dinar jordaniano");
		moedaIndex.put("Kuait"                  , "Dinar kuaitiano");
		moedaIndex.put("Laos"                   , "Kip laosiano");
		moedaIndex.put("Letônia"                , "Euro");
		moedaIndex.put("Líbano"                 , "Libra libanesa");
		moedaIndex.put("Líbia"                  , "Dinar líbio");
		moedaIndex.put("Lituânia"               , "Litas");
		moedaIndex.put("Luxemburgo"             , "Euro");
		moedaIndex.put("Malásia"                , "Ringgit");
		moedaIndex.put("Malta"                  , "Euro");
		moedaIndex.put("Marrocos"               , "Dirham marroquino"           );
		moedaIndex.put("México"                 , "Peso novo mexicano"            );
		moedaIndex.put("Moçambique"             , "Metical"                   );
		moedaIndex.put("Moldova"                , "Leu"                          );
		moedaIndex.put("Mônaco"                 , "Euro"                          );
		moedaIndex.put("Namíbia"                , "Dólar namibiano"              );
		moedaIndex.put("Noruega"                , "Coroa norueguesa"             );
		moedaIndex.put("Nova Zelândia"          , "Dólar da Nova Zelândia" );
		moedaIndex.put("Panamá"                 , "Balboa"                        );
		moedaIndex.put("Paquistão"              , "Rúpia paquistanesa"         );
		moedaIndex.put("Paraguai"               , "Guarani"                     );
		moedaIndex.put("Peru"                   , "Novo sol"                        );
		moedaIndex.put("Polônia"                , "Zloty"                        );
		moedaIndex.put("Portugal"               , "Euro"                        );
		moedaIndex.put("Qatar"                  , "Rial de Qatar"                  );
		moedaIndex.put("Quênia"                 , "Xelim queniano"                );
		moedaIndex.put("Reino Unido"            , "Libra esterlina"          );
		moedaIndex.put("República Tcheca"       , "Coroa tcheca"        );
		moedaIndex.put("Romênia"                , "Novo leu romeno"              );
		moedaIndex.put("Rússia"                 , "Rublo"                         );
		moedaIndex.put("Síria"                  , "Libra síria"                    );
		moedaIndex.put("Sri Lanka"              , "Rúpia cingalesa"            );
		moedaIndex.put("Suécia"                 , "Coroa sueca"                   );
		moedaIndex.put("Suíça"                  , "Franco suíço"                   );
		moedaIndex.put("Tailândia"              , "Baht"                       );
		moedaIndex.put("Taiwan"                 , "Dólar taiwanês"                );
		moedaIndex.put("Tunísia"                , "Dinar tunisiano"              );
		moedaIndex.put("Turquia"                , "Lira"                         );
		moedaIndex.put("Ucrânia"                , "Hrivna"                       );
		moedaIndex.put("Zona do euro"           , "Euro"                    );
		moedaIndex.put("Uruguai"                , "Peso Uruguaio"                );
		moedaIndex.put("Venezuela"              , "Bolívar"                    );
		moedaIndex.put("Zimbábue"               , "Dólar do Zimbábue"           );
		
		return moedaIndex.get(nomePais);
	}

}
