package com.example.flightwatch;

import java.util.ArrayList;

public class Airport implements Beobachter{
    private ArrayList<Flight> flights;
    private Weather weather;
    private String name;
    private String city;
    private String status;
    private int incomingFlights;
    private int departingFlights;
    private int capacity;
    private Subjekt airports;
    private AllFlights allFlights;

    public Airport(String name, String city,int capacity,int departingFlights,int incomingFlights, Subjekt airports,Weather weather ){
        this.name = name;
        this.city = city;
        this.capacity = capacity;
        this.departingFlights = departingFlights;
        this.incomingFlights = incomingFlights;
        this.airports = airports;
        this.flights = new ArrayList<Flight>();
        airports.registriereBeobachter(this);
        this.weather = weather;
        this.allFlights = new AllFlights(this.name,airports);
    }

    public Airport(String name,Subjekt airports){
        this.name = name;
        this.airports = airports;
        this.allFlights = new AllFlights(this.name,airports);
        airports.registriereBeobachter(this);
        this.setFlights();
    }

    @Override
    public void aktualisieren(String abflugsort, String landungsort) {
        if (abflugsort.equals("all") || abflugsort.equals(this.name) || landungsort.equals(this.name)) {
            this.setFlights();
        }
    }

    public ArrayList<Flight> getFlights(){
        return this.flights;
    }

    public void setFlights(){
        flights = allFlights.getPendingFlights();
    }
    public Weather getWeather(){
        return this.weather;
    }

    public String getName(){
        return this.name;
    }

    public String getCity(){
        return this.city;
    }

    public String getStatus(){
        return this.status;
    }

    public void startGeneratingFlights(){
        allFlights.getGeneratedFlight();
    }
}
