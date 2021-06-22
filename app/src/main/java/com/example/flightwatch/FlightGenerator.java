
package com.example.flightwatch;


import java.util.Random;

public class FlightGenerator {

    //Subject Object
    private Subject airports;

    //Flight Generator static Instance
    private static FlightGenerator flightGenerator;

    //Different Types of States
    private String[] everyStatus = new String[]{"Scheduled", "Delayed", "Departed", "Cancelled", "Arrived"};

    //Constructor
    private FlightGenerator(Subject airports) {
        this.airports = airports;
    }

    //GetInstance Function
    public static FlightGenerator getInstance(Subject airports) {
        if (flightGenerator == null) {
            flightGenerator = new FlightGenerator(airports);
        }
        return flightGenerator;
    }

    //Function to generate Flight
    public Flight generateFlight(String airport) {
        Flight flight = new Flight(new Plane(), new Schedule(airport), new Random().nextInt(517)+95, everyStatus[new Random().nextInt(everyStatus.length)]);
        airports.notifyObserver("all", flight.getSchedule().getDestination());
        return flight;
    }

    //First Dummy Flights to generate
    public Flight[] getDummyFlights(String airport) {
        Flight[] flights = {
                new Flight(new Plane(), new Schedule(airport), new Random().nextInt(517)+95, everyStatus[new Random().nextInt(everyStatus.length)]),
                new Flight(new Plane(), new Schedule(airport), new Random().nextInt(517)+95, everyStatus[new Random().nextInt(everyStatus.length)]),
                new Flight(new Plane(), new Schedule(airport), new Random().nextInt(517)+95, everyStatus[new Random().nextInt(everyStatus.length)])
        };
        return flights;
    }

}

