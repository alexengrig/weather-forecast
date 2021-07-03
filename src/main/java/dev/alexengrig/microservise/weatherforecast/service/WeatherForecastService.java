package dev.alexengrig.microservise.weatherforecast.service;

import dev.alexengrig.microservise.weatherforecast.model.WeatherForecast;

public interface WeatherForecastService {

    WeatherForecast getNow();

}
