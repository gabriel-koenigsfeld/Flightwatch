package com.example.flightwatch;

import java.util.ArrayList;

public class AllFlights {
    private ArrayList pendingFlights;
    private ArrayList pastFlights;
    private String airport;
    private FlightGenerator flightGenerator;

    public AllFlights(String airport,Subjekt airports){
        this.airport = airport;
        flightGenerator = FlightGenerator.getInstance(airports);
    }

    public ArrayList<Flight> getPendingFlights(){
        return this.pendingFlights;
    }

    public ArrayList<Flight> getPastFlights(){
        return this.pastFlights;
    }
}
