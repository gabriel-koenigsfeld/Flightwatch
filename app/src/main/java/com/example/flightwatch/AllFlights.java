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

    public void getDummyData(){
        Flight[] flights = flightGenerator.getDummyFlights(this.airport);
        for (Flight flight: flights) {
            pendingFlights.add(flight);
        }
    }

    public void restartGenerator(){
        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        getGeneratedFlight();
                    }
                }, 5000);
    }
}
