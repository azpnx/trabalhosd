package br.unip.climatempo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Futebol {

    @JsonProperty("stadium")
    private String estadio;
    @JsonProperty("country")
    private String pais;
    @JsonProperty("tournament")
    private String torneio;
    @JsonProperty("start")
    private String horario;
    @JsonProperty("match")
    private String jogo;

}
