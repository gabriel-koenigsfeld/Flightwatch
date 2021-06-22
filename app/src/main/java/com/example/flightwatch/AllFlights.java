package com.example.flightwatch;

import java.util.ArrayList;

public class AllFlights {
    //List with pending Flights
    private ArrayList<Flight> pendingFlights;

    //List with past Flights
    private ArrayList<Flight> pastFlights;

    //Airport Name
    private String airport;

    //Flight Generator Object
    private FlightGenerator flightGenerator;

    //All Flights Constructor
    public AllFlights(String airport, Subject airports){
        this.airport = airport;
        pendingFlights = new ArrayList<Flight>();
        pastFlights = new ArrayList<Flight>();
        flightGenerator = FlightGenerator.getInstance(airports);
        this.getDummyData();
    }

    //Constructor for Lists
    public ArrayList<Flight> getPendingFlights(){
        return this.pendingFlights;
    }

    public ArrayList<Flight> getPastFlights(){
        return this.pastFlights;
    }

    //Get generated Flight
    public void getGeneratedFlight(){
        pendingFlights.add(flightGenerator.generateFlight(airport));            //Add generated Flight to pendingFlightsArray
        this.restartGenerator();                                                //Restart the Generator
    }

    //Dummy Function to get Data
    public void getDummyData(){
        Flight[] flights = flightGenerator.getDummyFlights(this.airport);
        for (Flight flight: flights) {
            pendingFlights.add(flight);
        }
        this.getGeneratedFlight();
    }

    //Function to restart Generator
    public void restartGenerator(){
        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        getGeneratedFlight();
                    }
                }, 5000);
    }
}
