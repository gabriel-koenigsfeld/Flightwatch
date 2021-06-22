package com.example.flightwatch;

import java.util.Random;

public class Weather {

    private String condition;
    private String[] conditions = new String[]{"Sonnig", "Regen", "Stürmisch"};
    private int temperature;

    public Weather(String condition, int temperature){
        this.condition = condition;
        this.temperature = temperature;
    }

    public Weather(){
        this.generateWeather();
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

    //Method to generate a random Weather object
    public void generateWeather(){
        int randCondition = new Random().nextInt(conditions.length);
        this.setCondition(conditions[randCondition]);
        this.setTemperature(new Random().nextInt(35));
    }
}
