package com.example.backend.Controller;

import com.google.gson.Gson;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@RestController
public class WeatherController {

    private static final String WEATHER_API_URL = "https://restapi.amap.com/v3/weather/weatherInfo";
    private static final String API_KEY = "947d272491f7d44890dc0c9002d02bbf";

    @GetMapping("/GetWeather")
    public WeatherData getWeaher(@RequestParam("city")String City) throws IOException {
        String apiUrl = WEATHER_API_URL + "?key=" + API_KEY + "&city=" + City;
        String json = getJsonDataFromUrl(apiUrl);
        WeatherData weatherData = parseJsontoObject(json);
        return weatherData;
    }

    private String getJsonDataFromUrl(String apiUrl) throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        StringBuilder response = new StringBuilder();
        try (InputStream inputStream = connection.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
        }
        return response.toString();
    }

    private static WeatherData parseJsontoObject(String json){
        Gson gson = new Gson();
        WeatherData weatherData = gson.fromJson(json,WeatherData.class);
        return weatherData;
    }
}
