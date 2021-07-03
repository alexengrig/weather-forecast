package dev.alexengrig.microservise.weatherforecast.controller;

import dev.alexengrig.microservise.weatherforecast.model.WeatherForecast;
import dev.alexengrig.microservise.weatherforecast.service.WeatherForecastReactiveService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(Mapping.API_REACTIVE_V1_WEATHER_FORECAST)
public record WeatherForecastReactiveController(WeatherForecastReactiveService weatherForecastReactiveService) {

    @GetMapping(Mapping.NOW)
    public Mono<ResponseEntity<WeatherForecast>> now() {
        return weatherForecastReactiveService.getNow()
                .map(ResponseEntity::ok);
    }

    public static final class Mapping {

        public static final String NOW = "/now";

        private Mapping() throws IllegalAccessException {
            throw new IllegalAccessException("This is class with constants!");
        }

    }

}
