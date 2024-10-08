package br.com.desafioalura.screenmatch_frases.controller;

import br.com.desafioalura.screenmatch_frases.dto.FraseDto;
import br.com.desafioalura.screenmatch_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    private FraseService service;

    @GetMapping("/series/frases")
    public FraseDto gerarFraseAleatoria(){
        return service.obterFraseAleatoria();

    }

}
