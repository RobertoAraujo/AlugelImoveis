package com.poshyweb.aluguelapp.server;

import com.poshyweb.aluguelapp.dto.UsuarioDto;
import org.hibernate.ObjectNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.poshyweb.aluguelapp.model.Usuario;
import com.poshyweb.aluguelapp.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosService {

	private UsuarioRepository repository;
	
	@RequestMapping(path = "/dist/register", method = RequestMethod.POST)
	public ModelAndView CadastroContatoPost(Usuario usuario) {
		// usar o repository salva no banco
		repository.save(usuario);
		return new ModelAndView("/dist/register");
	}

    public List<UsuarioDto> findAll() {
		return null;
    }

	public Usuario findById(Long id) {
		Optional<Usuario> objUsuario = repository.findById(id);
		Usuario usuario = objUsuario.orElseThrow(() -> new ObjectNotFoundException("Produto não encontrado!  id:" + id + " tipo: " + Usuario.class.getName()));
		return usuario;
	}
}
