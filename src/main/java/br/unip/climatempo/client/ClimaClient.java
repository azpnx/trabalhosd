package br.unip.climatempo.client;

import br.unip.climatempo.domain.ClimaResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "climaFeignClient", url = "${api.clima.url}")
public interface ClimaClient {

    @GetMapping
    ClimaResponse getClima(@RequestParam("q") String cidade,
                           @RequestParam("lang") String lang,
                           @RequestParam("key") String key);
}
