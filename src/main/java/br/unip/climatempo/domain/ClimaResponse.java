package br.unip.climatempo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClimaResponse {
    @JsonProperty("location")
    private Location local;
    @JsonProperty("current")
    private Current climaAgora;
}
