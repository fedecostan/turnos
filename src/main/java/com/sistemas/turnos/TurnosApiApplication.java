package com.sistemas.turnos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.sistemas.turnos")
@SpringBootApplication
public class TurnosApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurnosApiApplication.class, args);
    }
}
