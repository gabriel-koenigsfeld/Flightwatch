package com.example.flightwatch;

import java.util.ArrayList;

public class Airport implements Beobachter{
    private ArrayList flights;
    private Weather weather;
    private String name;
    private String city;
    private String status;
    private int incomingFlights;
    private int departingFlights;
    private int capacity;
    private Subjekt airports;

    public Airport(String name, String city,int capacity,int departingFlights,int incomingFlights, Subjekt airports,Weather weather ){
        this.name = name;
        this.city = city;
        this.capacity = capacity;
        this.departingFlights = departingFlights;
        this.incomingFlights = incomingFlights;
        this.airports = airports;
        airports.registriereBeobachter(this);
        this.weather = weather;
    }

    @Override
    public void aktualisieren(String abflugsort, String landungsort) {
        if (abflugsort.equals("all") || abflugsort.equals(this.name) || landungsort.equals(this.name)) {
            //Get New flights data
        }
    }
}
