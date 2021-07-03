package dev.alexengrig.microservise.weatherforecast.service;

import dev.alexengrig.microservise.weatherforecast.model.WeatherForecast;
import reactor.core.publisher.Mono;

public interface WeatherForecastReactiveService {

    Mono<WeatherForecast> getNow();

}
