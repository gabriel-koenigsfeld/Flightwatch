/*
 * Klasse
 *
 * Version 1.0
 *
 * Königsfeld, Gabriel
 * Özugurlu, Sina
 * Karampelas, Panagiotis
 * Konadu, Joshua Osei-Bonsu
 */

package com.example.flightwatch;


import java.util.Random;

public class FlightGenerator {
    public static Subject airports;
    private static FlightGenerator flightGenerator;
    private String[] everyStatus = new String[]{"Scheduled", "Delayed", "Departed", "Cancelled", "Arrived"};


    private FlightGenerator(Subject airports) {
        this.airports = airports;
    }

    public static FlightGenerator getInstance(Subject airports) {
        if (flightGenerator == null) {
            flightGenerator = new FlightGenerator(airports);
        }
        return flightGenerator;
    }


    //Generating a random flight object
    public Flight generateFlight(String airport) {
        Flight flight = new Flight(new Plane(), new Schedule(airport), new Random().nextInt(517)+95, everyStatus[new Random().nextInt(everyStatus.length)]);
        airports.notifyObserver("all", flight.getSchedule().getDestination());
        return flight;
    }

    //Generating three random flight objects so the list is not empty when started
    public Flight[] getDummyFlights(String airport) {
        Flight[] flights = {
                new Flight(new Plane(), new Schedule(airport), new Random().nextInt(517)+95, everyStatus[new Random().nextInt(everyStatus.length)]),
                new Flight(new Plane(), new Schedule(airport), new Random().nextInt(517)+95, everyStatus[new Random().nextInt(everyStatus.length)]),
                new Flight(new Plane(), new Schedule(airport), new Random().nextInt(517)+95, everyStatus[new Random().nextInt(everyStatus.length)])
        };
        return flights;
    }

}

