package br.unip.climatempo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter@Getter
@NoArgsConstructor
public class Current {
    @JsonProperty("temp_c")
    private Integer temperatura;
    @JsonProperty("feelslike_c")
    private Integer sensacaoTermica;
    @JsonProperty("condition")
    private Condition condicao;
    @JsonProperty("humidity")
    private Double umidade;
    @JsonProperty("wind_kph")
    private String ventoKmh;
}

@Setter@Getter
@NoArgsConstructor
@AllArgsConstructor
class Condition{
    @JsonProperty("text")
    private String texto;
}