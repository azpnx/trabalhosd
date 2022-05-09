package br.unip.climatempo.service.impl;

import br.unip.climatempo.client.EsporteClient;
import br.unip.climatempo.controller.model.FutebolSaida;
import br.unip.climatempo.domain.FutebolReponse;
import br.unip.climatempo.domain.mapper.EsporteMapper;
import br.unip.climatempo.service.EsporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EsporteServiceImpl implements EsporteService {

    @Autowired
    private EsporteClient esporteClient;

    @Autowired
    EsporteMapper esporteMapper;

    @Value("${app.idioma}")
    String lang;

    @Value("${key.value}")
    private String keyValue;

    @Override
    public FutebolSaida getPartidasFutebol() {
        String cidade = "sao paulo";

        return esporteMapper.toFutebolSaida(esporteClient.getPartidas(keyValue, cidade, lang));
    }
}

