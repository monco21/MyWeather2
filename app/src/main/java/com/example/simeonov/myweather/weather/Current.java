package com.example.simeonov.myweather.weather;

/**
 * Created by gerry on 15.4.2017 г..
 */

public class Current {
    private double temp;
    private double humidity;
    private String summary;
    private double windSpeed;
    private double rain;
    private double feelsLike;

    public double getTemp() {
        return temp;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public double getRain() {
        return rain;
    }

    public void setRain(double rain) {
        this.rain = rain;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Override
    public String toString() {
        return "Current{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                ", summary='" + summary + '\'' +
                ", windSpeed=" + windSpeed +
                ", rain=" + rain +
                ", feelsLike=" + feelsLike +
                '}';
    }
}
