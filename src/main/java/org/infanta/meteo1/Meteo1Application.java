package org.infanta.meteo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.infanta.meteo1.controller.WeatherConfig;

@SpringBootApplication
@EnableConfigurationProperties(WeatherConfig.class)
public class Meteo1Application {

    public static void main(String[] args) {
         //prueba para el commit
        SpringApplication.run(Meteo1Application.class, args);

    }

}
