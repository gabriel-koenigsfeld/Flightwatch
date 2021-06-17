package com.example.flightwatch;

import java.util.ArrayList;

public class AllFlights {
    private ArrayList pendingFlights;
    private ArrayList pastFlights;
    private String airport;

    public AllFlights(String airport){
        this.airport = airport;
    }

    public ArrayList<Flight> getPendingFlights(){
        return this.pendingFlights;
    }

    public ArrayList<Flight> getPastFlights(){
        return this.pastFlights;
    }
}
