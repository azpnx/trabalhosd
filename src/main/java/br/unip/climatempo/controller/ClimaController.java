package br.unip.climatempo.controller;

import br.unip.climatempo.controller.model.ClimaSaida;
import br.unip.climatempo.domain.mapper.SaidaMapper;
import br.unip.climatempo.service.ClimaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/clima")
public class ClimaController {

    @Autowired
    ClimaService climaService;

    @Autowired
    SaidaMapper saidaMapper;

    @GetMapping("/cidade")
    public ResponseEntity<ClimaSaida> getClimaPorCidade(@RequestParam("cidade") String cidade){
        return ResponseEntity.ok().body(saidaMapper.toSaida(climaService.climaAgora(cidade)));
    }
}
