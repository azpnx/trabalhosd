package br.unip.climatempo.domain.mapper;

import br.unip.climatempo.controller.model.ClimaSaida;
import br.unip.climatempo.domain.ClimaResponse;
import br.unip.climatempo.domain.Current;
import br.unip.climatempo.domain.Location;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface SaidaMapper {

    default ClimaSaida toSaida(ClimaResponse response){
        ClimaSaida climaSaida = map(response.getLocal());
        afterMap(climaSaida, response.getClimaAgora());
        return climaSaida;
    }

    ClimaSaida map(Location location);

    default void afterMap(@MappingTarget final ClimaSaida climaSaida, Current current){
        climaSaida.setTemperatura(String.format("%s°C", current.getTemperatura()));
        climaSaida.setUmidade(String.format("%s%%", current.getUmidade()));
        climaSaida.setSensacaoTermica(String.format("%s°C", current.getSensacaoTermica()));
        climaSaida.setVentoKmh(current.getVentoKmh());
    }

}