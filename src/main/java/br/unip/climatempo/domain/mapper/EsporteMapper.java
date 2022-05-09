package br.unip.climatempo.domain.mapper;

import br.unip.climatempo.controller.model.FutebolSaida;
import br.unip.climatempo.domain.FutebolReponse;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface EsporteMapper {

    FutebolSaida toFutebolSaida(FutebolReponse reponse);

}