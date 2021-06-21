package com.example.flightwatch;

public class Weather {

    private String condition;
    private String[] conditions = new String[]{"", ""};
    private int temperature;

    public Weather(String condition, int temperature){
        this.condition = condition;
        this.temperature = temperature;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
