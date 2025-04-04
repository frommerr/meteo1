package org.infanta.meteo1.service;

import org.infanta.meteo1.config.OpenWeatherConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OpenWeatherService {

    @Autowired
    private OpenWeatherConfig config;

    private final RestTemplate restTemplate = new RestTemplate();

    public String getWeather(String city) {
        String url = String.format("%s?q=%s&appid=%s", config.getApiUrl(), city, config.getApiKey());
        return restTemplate.getForObject(url, String.class);
    }
}