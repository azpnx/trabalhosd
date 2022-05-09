package br.unip.climatempo.service;

import br.unip.climatempo.controller.model.FutebolSaida;
import br.unip.climatempo.domain.FutebolReponse;

public interface EsporteService {

    FutebolSaida getPartidasFutebol();
}
