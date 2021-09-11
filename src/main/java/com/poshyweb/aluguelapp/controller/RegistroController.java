package com.poshyweb.aluguelapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.poshyweb.aluguelapp.model.Usuario;
import com.poshyweb.aluguelapp.repository.UsuarioRepository;

@Controller
public class RegistroController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@RequestMapping(path = "/dist/register", method = RequestMethod.POST)
	public ModelAndView CadastroUsuarioPost(Usuario usuario) {
		// usar o repository salva no banco
		usuarioRepository.save(usuario);
		return new ModelAndView("/dist/register");
	}
	
}
