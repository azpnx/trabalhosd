package br.unip.climatempo.controller.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClimaSaida {
    private String cidade;
    private String Estado;
    private String pais;
    private String horarioLocal;
    private String temperatura;
    private String umidade;
    private String ventoKmh;
    private String sensacaoTermica;
}