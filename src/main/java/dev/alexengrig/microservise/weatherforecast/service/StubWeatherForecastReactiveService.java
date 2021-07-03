package dev.alexengrig.microservise.weatherforecast.service;

import dev.alexengrig.microservise.weatherforecast.model.WeatherForecast;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Service
public class StubWeatherForecastReactiveService implements WeatherForecastReactiveService {

    @Override
    public Mono<WeatherForecast> getNow() {
        return Mono.just(new WeatherForecast(LocalDateTime.now()));
    }

}
