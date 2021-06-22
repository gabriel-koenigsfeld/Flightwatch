package com.example.flightwatch;

import java.util.ArrayList;

public class Airport implements Observer {
    private ArrayList<Flight> flights;
    private Weather weather;
    private String name;
    private String city;
    private String status;
    private int incomingFlights;
    private int departingFlights;
    private int capacity;
    private Subject airports;
    private AllFlights allFlights;

    public Airport(String name, String city, int capacity, int departingFlights, int incomingFlights, Subject airports, Weather weather ){
        this.name = name;
        this.city = city;
        this.capacity = capacity;
        this.departingFlights = departingFlights;
        this.incomingFlights = incomingFlights;
        this.airports = airports;
        this.flights = new ArrayList<Flight>();
        airports.registerObserver(this);
        this.weather = weather;
        this.allFlights = new AllFlights(this.name,airports);
    }

    public Airport(String name, Subject airports){
        this.name = name;
        this.airports = airports;
        this.allFlights = new AllFlights(this.name,airports);
        airports.registriereBeobachter(this);
        this.setFlights();
    }

    @Override
    public void refresh(String departure, String destination) {
        if (departure.equals("all") || departure.equals(this.name) || destination.equals(this.name)) {
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
