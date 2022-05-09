package br.unip.climatempo.controller.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter@Getter
@NoArgsConstructor
public class Partida {
    private String estadio;
    private String pais;
    private String horario;
    private String jogo;
}
