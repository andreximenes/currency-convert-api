package br.com.alx.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ServerInfoController {

	@GetMapping({"/", "/home"})
	public ModelAndView getServerInfo() {
		ModelAndView modelAndView = new ModelAndView("serverInfo");
		return 	modelAndView;
	}

}
