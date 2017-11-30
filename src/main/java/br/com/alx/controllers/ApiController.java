package br.com.alx.controllers;

import java.io.IOException;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alx.components.Conversor;
import br.com.alx.models.RequisicaoConversao;
import br.com.alx.models.Conversao;

@RestController
public class ApiController {
	
	private final Conversor conversor;
	
	@Autowired
	public ApiController(Conversor conversor) {
		this.conversor = conversor;
	}
	
	@ResponseBody
	@GetMapping("/calcula/valor={valor}&de={de}&para={para}")
    public Conversao index(@PathVariable("valor") String valor,
    					@PathVariable("de") String de,
    					@PathVariable("para") String para) throws IOException {
		RequisicaoConversao req = new RequisicaoConversao(de, para);
		req.setValor(new BigDecimal(valor));
		
		Conversao retorno = conversor.calcula(req);
		
        return retorno;
    }

}
