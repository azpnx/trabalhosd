package br.unip.climatempo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ClimaTempoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClimaTempoApplication.class, args);
    }
}