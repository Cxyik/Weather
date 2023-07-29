package com.example.backend.Controller;

import java.util.List;

public class WeatherData {
    public String status;
    public String count;
    public String info;
    public String infocode;
    public List<WeatherInfo> lives;

    public void show(){
        for(WeatherInfo weatherInfo:lives){
            weatherInfo.show();
        }
    }
    // 添加getter和setter方法
}
