package dev.alexengrig.microservise.weatherforecast.controller;

import dev.alexengrig.microservise.weatherforecast.model.WeatherForecast;
import dev.alexengrig.microservise.weatherforecast.service.WeatherForecastService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Mapping.API_V1_WEATHER_FORECAST)
public record WeatherForecastController(WeatherForecastService weatherForecastService) {

    @GetMapping(Mapping.NOW)
    public ResponseEntity<WeatherForecast> now() {
        return ResponseEntity.ok(weatherForecastService.getNow());
    }

    public static final class Mapping {

        public static final String NOW = "/now";

        private Mapping() throws IllegalAccessException {
            throw new IllegalAccessException("This is class with constants!");
        }

    }

}
