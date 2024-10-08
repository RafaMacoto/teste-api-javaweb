package br.com.desafioalura.screenmatch_frases.service;


import br.com.desafioalura.screenmatch_frases.dto.FraseDto;
import br.com.desafioalura.screenmatch_frases.model.Frase;
import br.com.desafioalura.screenmatch_frases.repository.FraseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public FraseDto obterFraseAleatoria() {
        Frase frase = repository.buscaFraseAleatoria();
        return new FraseDto(frase.getTitulo() , frase.getFrase() , frase.getPersonagem(), frase.getPoster());
    }
}
