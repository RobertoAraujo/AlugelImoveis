package com.poshyweb.aluguelapp.controller;

import com.poshyweb.aluguelapp.dto.QuartoDto;
import com.poshyweb.aluguelapp.server.QuartoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.poshyweb.aluguelapp.model.Quarto;

@Controller
public class QuartoController {
	
	@Autowired
	private QuartoServer server;

	@RequestMapping (path = "dist/lista-de-quartos", method = RequestMethod.GET)
	private String  listarQuartos() {
		return "dist/lista-de-quartos";
	}

	@RequestMapping (path = "dist/cadastro-de-quarto", method = RequestMethod.POST)
	public ModelAndView inserirCadstroQuartos(Quarto quarto) {
		return new ModelAndView("dist/cadastro-de-quarto");

	}

}
