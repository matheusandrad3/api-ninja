package br.com.matheusandrad3.ninjasapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class NinjasApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(NinjasApiApplication.class, args);
    }

}
