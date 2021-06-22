package com.example.flightwatch;

import java.util.ArrayList;

public class AllFlights {
    private ArrayList<Flight> pendingFlights;
    private ArrayList<Flight> pastFlights;
    private String airport;
    private FlightGenerator flightGenerator;

    public AllFlights(String airport, Subject airports){
        this.airport = airport;
        pendingFlights = new ArrayList<Flight>();
        pastFlights = new ArrayList<Flight>();
        flightGenerator = FlightGenerator.getInstance(airports);
        this.getDummyData();
    }

    public ArrayList<Flight> getPendingFlights(){
        return this.pendingFlights;
    }

    public ArrayList<Flight> getPastFlights(){
        return this.pastFlights;
    }

    public void getGeneratedFlight(){
        pendingFlights.add(flightGenerator.generateFlight(airport));
        this.restartGenerator();
    }
    //Get dummy Flights and start Generating Flights
    public void getDummyData(){
        Flight[] flights = flightGenerator.getDummyFlights(this.airport);
        for (Flight flight: flights) {
            pendingFlights.add(flight);
        }
        this.getGeneratedFlight();
    }

    //Every 5 seconds new Flights will be added
    public void restartGenerator(){
        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        getGeneratedFlight();
                    }
                }, 5000);
    }
}
