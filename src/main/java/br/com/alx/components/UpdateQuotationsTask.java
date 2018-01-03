package br.com.alx.components;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.com.alx.exceptions.ConverterServiceException;
import br.com.alx.services.ConverterService;

@Component
public class UpdateQuotationsTask {
	private static final Logger log = LoggerFactory.getLogger(UpdateQuotationsTask.class);
	private final ConverterService conversor;
	@Autowired
	public UpdateQuotationsTask(ConverterService conversor) {
		this.conversor = conversor;
	}
	
	// Atualiza as cotações a cada 30 minutos
	@Scheduled(fixedRate = 1800000)
	public void reportCurrentTime() {
		try {
			conversor.updateQuotes();
		} catch (ConverterServiceException e) {
			log.error("UpdateQuotationsTask :: Error during update quotations: " + e.getMessage());
		}
	}
}
