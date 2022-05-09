package br.unip.climatempo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    @JsonProperty("name")
    private String cidade;
    @JsonProperty("region")
    private String estado;
    @JsonProperty("country")
    private String pais;
    @JsonProperty("localtime")
    private String horarioLocal;
}
