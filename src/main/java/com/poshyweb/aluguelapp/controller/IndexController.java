package com.poshyweb.aluguelapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String paginaInicial() {
		return "dist/login";
	}

	@RequestMapping(path = "/dist/index", method = RequestMethod.GET)
	public String paginaDistIndex() {
		return "dist/index";
	}
	
	@RequestMapping(path = "/dist/charts", method = RequestMethod.GET)
	public String paginaDistCharts() {
		return "dist/index";
	}
	
	@RequestMapping(path = "/dist/layout-sidenav-light", method = RequestMethod.GET)
	public String paginaDistlayoutsidenavlight() {
		return "dist/layout-sidenav-light";
	}
	
	@RequestMapping(path = "/dist/layout-static", method = RequestMethod.GET)
	public String paginaDistlayoutstatic() {
		return "dist/layout-static";
	}
	
	@RequestMapping(path = "/dist/login", method = RequestMethod.GET)
	public String paginaDistlogin() {
		return "dist/login";
	}
	
	@RequestMapping(path = "/dist/register", method = RequestMethod.GET)
	public String paginaDistRegister() {
		return "dist/register";
	}
	
	@RequestMapping(path = "/dist/password", method = RequestMethod.GET)
	public String paginaDistpassword() {
		return "dist/password";
	}
	
	@RequestMapping(path = "/dist/administracao", method = RequestMethod.GET)
	public String paginaDistAdministracao() {
		return "dist/administracao";
	}
	
	@RequestMapping(path = "/dist/inquilino", method = RequestMethod.GET)
	public String paginaDistInquilino() {
		return "dist/inquilino";
	}

}
