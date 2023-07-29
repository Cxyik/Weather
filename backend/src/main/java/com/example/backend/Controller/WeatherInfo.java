package com.example.backend.Controller;

public class WeatherInfo {
    private String province;
    private String city;
    private String adcode;
    private String weather;
    private String temperature;
    private String winddirection;
    private String windpower;
    private String humidity;
    private String reporttime;
    private String temperature_float;
    private String humidity_float;
    public WeatherInfo() {
    }


    public WeatherInfo(String province, String city, String adcode, String weather, String temperature, String winddirection, String windpower, String humidity, String reporttime, String temperature_float, String humidity_float) {
        this.province = province;
        this.city = city;
        this.adcode = adcode;
        this.weather = weather;
        this.temperature = temperature;
        this.winddirection = winddirection;
        this.windpower = windpower;
        this.humidity = humidity;
        this.reporttime = reporttime;
        this.temperature_float = temperature_float;
        this.humidity_float = humidity_float;
    }



    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getAdcode() {
        return adcode;
    }

    public String getWeather() {
        return weather;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getWinddirection() {
        return winddirection;
    }

    public String getWindpower() {
        return windpower;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getReporttime() {
        return reporttime;
    }

    public String getTemperature_float() {
        return temperature_float;
    }

    public String getHumidity_float() {
        return humidity_float;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAdcode(String adcode) {
        this.adcode = adcode;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setWinddirection(String winddirection) {
        this.winddirection = winddirection;
    }

    public void setWindpower(String windpower) {
        this.windpower = windpower;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public void setReporttime(String reporttime) {
        this.reporttime = reporttime;
    }

    public void setTemperature_float(String temperature_float) {
        this.temperature_float = temperature_float;
    }

    public void setHumidity_float(String humidity_float) {
        this.humidity_float = humidity_float;
    }



    public void show(){
        System.out.println(city+" "+temperature);
    }
}
