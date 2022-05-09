package br.unip.climatempo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FutebolReponse {

    @JsonProperty("football")
    private List<Futebol> partidas;
}
