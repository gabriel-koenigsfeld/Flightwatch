package com.example.flightwatch;

public class FlightGenerator {
    private Subjekt airports;
    private static FlightGenerator flightGenerator;
    private FlightGenerator(Subjekt airports){
        this.airports = airports;
    }
    public static FlightGenerator getInstance(Subjekt airports){
        if(flightGenerator == null){
            flightGenerator = new FlightGenerator(airports);
        }
        return flightGenerator;
    }


}
