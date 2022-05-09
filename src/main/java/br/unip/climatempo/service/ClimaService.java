package br.unip.climatempo.service;

import br.unip.climatempo.domain.ClimaResponse;

public interface ClimaService {

    ClimaResponse climaAgora(String cidade);

}
