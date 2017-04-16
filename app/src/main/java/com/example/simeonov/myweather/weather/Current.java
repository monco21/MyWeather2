package com.example.simeonov.myweather.weather;

/**
 * Created by gerry on 15.4.2017 г..
 */

public class Current {
    private double temp;
    private double humidity;
    private String summary;

    public double getTemp() {
        return temp;
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


    @Override
    public String toString() {
        return "Current{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                ", summary='" + summary + '\'' +
                '}';
    }
}
