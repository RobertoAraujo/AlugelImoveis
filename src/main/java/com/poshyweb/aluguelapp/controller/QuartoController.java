package com.poshyweb.aluguelapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.poshyweb.aluguelapp.model.Quarto;
import com.poshyweb.aluguelapp.repository.QuartosRepository;

@Controller
public class QuartoController {
	
	@Autowired
	private QuartosRepository quartosRepository;
	
	@RequestMapping (path = "dist/cadastroQuartos", method = RequestMethod.GET)
	private String  cadstroQuartos() {
		return "dist/cadastroQuartos";
	}
	
	@RequestMapping (path = "dist/cadastroQuartos", method = RequestMethod.POST)
	public ModelAndView inserirCadstroQuartos(Quarto quarto) {
		quartosRepository.save(quarto);
		return new ModelAndView("dist/cadastroQuartos");
		
	}
}
