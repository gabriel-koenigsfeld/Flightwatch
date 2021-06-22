package com.example.flightwatch;

import java.util.Random;

public class Weather {

    //Weather condition
    private String condition;

    //Types of Weather Conditions
    private String[] conditions = new String[]{"Sonnig", "Regen", "Stürmisch"};

    //Int Value for temperature
    private int temperature;

    //Weather Constructor
    public Weather(String condition, int temperature){
        this.condition = condition;
        this.temperature = temperature;
    }

    //Weather Randomizer Constructor
    public Weather(){
        this.generateWeather();
    }

    //Getter and Setter
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

    //Method to generate random Weather Object
    public void generateWeather(){
        int randCondition = new Random().nextInt(conditions.length);
        this.setCondition(conditions[randCondition]);
        this.setTemperature(new Random().nextInt(35));
    }
}
