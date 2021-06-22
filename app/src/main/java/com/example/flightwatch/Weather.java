package com.example.flightwatch;

import java.util.Random;

public class Weather {

    //Weather Condition
    private String condition;

    //Types of Condition
    private String[] conditions = new String[]{"Sonnig", "Regen", "Stürmisch"};

    //Temperature as Integer
    private int temperature;

    //Weather Constructor
    public Weather(String condition, int temperature){
        this.condition = condition;
        this.temperature = temperature;
    }

    //Random Weather Constructor
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

    //Method to generate a random Weather object
    public void generateWeather(){
        int randCondition = new Random().nextInt(conditions.length);                //Pick Condition from Conditions Array
        this.setCondition(conditions[randCondition]);
        this.setTemperature(new Random().nextInt(35));                       //Pick Random Integer in Range 25 for Temperature
    }
}
