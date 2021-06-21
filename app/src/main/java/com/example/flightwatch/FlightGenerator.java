
package com.example.flightwatch;


import android.util.Log;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FlightGenerator {
    private Subjekt airports;
    private static FlightGenerator flightGenerator;
    private String[] everyStatus = new String[]{"Scheduled", "Delayed", "Departed", "Cancelled", "Arrived"};


    private FlightGenerator(Subjekt airports) {
        this.airports = airports;
    }

    public static FlightGenerator getInstance(Subjekt airports) {
        if (flightGenerator == null) {
            flightGenerator = new FlightGenerator(airports);
        }
        return flightGenerator;
    }


    public Flight generateFlight(String airport) {
        Flight flight = new Flight(new Plane(), new Schedule(airport), new Random().nextInt(517)+95, everyStatus[new Random().nextInt(everyStatus.length)]);
        airports.benachrichtigeBeobachter("all", flight.getSchedule().getDestination());
        return flight;
    }

    public Flight[] getDummyFlights(String airport) {
        Flight[] flights = {
                new Flight(new Plane(), new Schedule(airport), new Random().nextInt(517)+95, everyStatus[new Random().nextInt(everyStatus.length)]),
                new Flight(new Plane(), new Schedule(airport), new Random().nextInt(517)+95, everyStatus[new Random().nextInt(everyStatus.length)]),
                new Flight(new Plane(), new Schedule(airport), new Random().nextInt(517)+95, everyStatus[new Random().nextInt(everyStatus.length)])
        };
        return flights;
    }

}

