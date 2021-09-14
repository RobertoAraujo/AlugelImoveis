package com.poshyweb.aluguelapp.server;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.poshyweb.aluguelapp.model.Usuario;
import com.poshyweb.aluguelapp.repository.UsuarioRepository;

@Service
public class UsuariosService {

	private UsuarioRepository usuarioRepository;
	
	@RequestMapping(path = "/dist/register", method = RequestMethod.POST)
	public ModelAndView CadastroContatoPost(Usuario usuario) {
		// usar o repository salva no banco
		usuarioRepository.save(usuario);
		return new ModelAndView("/dist/register");
	}
}
