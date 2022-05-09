package br.unip.climatempo.exceptions;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class FeignErrorDecoder implements ErrorDecoder {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public Exception decode(String s, Response response) {
        switch (response.status()){
            case 400:
                logger.error("Codigo de Status" + response.status() + ", methodKey = " + s );
            case 404:
            {
                {
                    logger.error("Erro utilizando o FEIGNCLIENT. Código de status " + response.status() + ", methodKey = " + s);
                    return new ResponseStatusException(HttpStatus.valueOf(response.status()), response.body().toString());
                }
            }
            default:
                return new Exception(response.reason());
        }
    }
}
