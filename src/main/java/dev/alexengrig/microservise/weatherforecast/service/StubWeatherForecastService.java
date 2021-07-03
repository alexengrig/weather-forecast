package dev.alexengrig.microservise.weatherforecast.service;

import dev.alexengrig.microservise.weatherforecast.model.WeatherForecast;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public record StubWeatherForecastService() implements WeatherForecastService {

    @Override
    public WeatherForecast getNow() {
        return new WeatherForecast(LocalDateTime.now());
    }

}
