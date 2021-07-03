package dev.alexengrig.microservise.weatherforecast.controller;

public final class Mapping {

    public static final String API = "/api";
    public static final String API_V1 = API + "/v1";

    public static final String WEATHER_FORECAST = "/weather-forecast";
    public static final String API_V1_WEATHER_FORECAST = API_V1 + WEATHER_FORECAST;

    private Mapping() throws IllegalAccessException {
        throw new IllegalAccessException("This is class with constants!");
    }

}
