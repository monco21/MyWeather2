package com.example.simeonov.myweather.weather;

/**
 * Created by gerry on 15.4.2017 г..
 */

public class Current {
    private double temp;
    private double humidity;

    public double getTemp() {
        return temp;
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

    @Override
    public String toString() {
        return "Current{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                '}';
    }
}
