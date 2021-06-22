package com.example.flightwatch;

import java.util.ArrayList;

public class Airport implements Observer {

    //Array of flights at Airport
    private ArrayList<Flight> flights;

    //Weather Object
    private Weather weather;

    //Name of Airport
    private String name;

    //Name of the City
    private String city;

    //Status
    private String status;

    //Number of incoming Flights
    private int incomingFlights;

    //Number of departing Flights
    private int departingFlights;

    //Capacity of the Airport
    private int capacity;

    //Subject Interface Airports
    private Subject airports;

    //All Flights Object
    private AllFlights allFlights;

    //Airport Constructor
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

    //Airport Constructor with Interface
    public Airport(String name, Subject airports){
        this.name = name;
        this.airports = airports;
        this.allFlights = new AllFlights(this.name,airports);
        this.setFlights();
    }

    //Implementation of Observer Function
    @Override
    public void refresh(String departure, String destination) {
        if (departure.equals("all") || departure.equals(this.name) || destination.equals(this.name)) {
            this.setFlights();
        }
    }

    //Getter and Setter
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

    //Method to Start generating Flights
    public void startGeneratingFlights(){
        allFlights.getGeneratedFlight();
    }
}
