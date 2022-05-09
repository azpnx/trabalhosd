package br.unip.climatempo.controller;

import br.unip.climatempo.service.EsporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/esporte")
public class esporteController {

    @Autowired
    EsporteService esporteService;

    @GetMapping
    public ResponseEntity<?> getJogos(){
        return ResponseEntity.ok().body(esporteService.getPartidasFutebol());
    }
}
