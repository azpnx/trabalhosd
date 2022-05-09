package br.unip.climatempo.service.impl;

import br.unip.climatempo.client.ClimaClient;
import br.unip.climatempo.domain.ClimaResponse;
import br.unip.climatempo.service.ClimaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ClimaServiceImpl implements ClimaService {

    @Autowired
    private ClimaClient climaClient;

    @Value("${app.idioma}")
    String lang;

    @Value("${key.value}")
    private String keyValue;

    @Override
    public ClimaResponse climaAgora(String cidade) {
        return climaClient.getClima(cidade, lang, keyValue);
    }
}

