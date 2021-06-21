package com.example.flightwatch;

public class City {

    private String name;
    public String[] airports;

    public City(String name, String[] airports){
        this.name = name;
        this.airports = airports;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAirports() {
        return airports;
    }

    public void setAirports(String[] airports) {
        this.airports = airports;
    }
}
