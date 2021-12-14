package com.poshyweb.aluguelapp.server;

import com.poshyweb.aluguelapp.model.Quarto;
import com.poshyweb.aluguelapp.repository.QuartosRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class QuartoServer {

    private QuartosRepository repository;

    @RequestMapping(path = "dist/cadastro-de-quarto", method = RequestMethod.POST)
    public String CadastroContatoPost(Quarto quarto) {
        // usar o repository salva no banco
        Quarto saveQuarto = repository.save(quarto);
        return "dist/cadastro-de-quarto";

    }

}
