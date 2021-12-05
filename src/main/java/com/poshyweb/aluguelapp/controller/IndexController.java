package com.poshyweb.aluguelapp.controller;

import com.poshyweb.aluguelapp.dto.UsuarioDto;
import com.poshyweb.aluguelapp.model.Usuario;
import com.poshyweb.aluguelapp.server.UsuariosService;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class IndexController {

	@Autowired
	private UsuariosService servico;

	// tela de login
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String paginaInicial() {
		return "dist/login";
	}

	@RequestMapping(path = "/listar-usuarios", method = RequestMethod.GET)
	public ResponseEntity<List<UsuarioDto>> findAll(@RequestParam(value ="usuario", defaultValue ="0") Long id_cat) throws ObjectNotFoundException {
		List<UsuarioDto> list = servico.findAll();
		//converte de lista de livro em lista de livros dto
		List<UsuarioDto> listDTO = list.stream().map(objUsuario -> new UsuarioDto(objUsuario)).collect(Collectors.toList());
		//return ResponseEntity.ok().body(objProduto);
		return ResponseEntity.ok().body(listDTO);
	}

	@GetMapping (value = "/{id}")// busca geral
	public ResponseEntity<Usuario> findById(@PathVariable Long id) throws ObjectNotFoundException {
		Usuario objUsuario = servico.findById(id);
		return ResponseEntity.ok().body(objUsuario);
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
