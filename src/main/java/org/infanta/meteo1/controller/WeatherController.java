package org.infanta.meteo1.controller;

import org.infanta.meteo1.service.OpenWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    private OpenWeatherService weatherService;

    @GetMapping("/weather")
    public String getWeather(@RequestParam String city) {
        return weatherService.getWeather(city);
    }
}