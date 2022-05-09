package br.unip.climatempo.client;

import br.unip.climatempo.domain.FutebolReponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "esporteFeignClient", url = "${api.esporte.url}")
public interface EsporteClient {

    @GetMapping
    FutebolReponse getPartidas(@RequestParam("key") String key,
                               @RequestParam("q") String cidade,
                               @RequestParam("lang") String idioma);
}
