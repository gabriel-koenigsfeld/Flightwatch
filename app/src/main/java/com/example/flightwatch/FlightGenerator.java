
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
        Flight flight = new Flight(new Plane(), new Schedule(airport), 1000, "regular");

        new Thread(() -> {
            airports.benachrichtigeBeobachter("all", flight.getSchedule().getDestination());
        }).start();
        return flight;
    }

    public Flight[] getDummyFlights(String airport) {
        Flight[] flights = {
                new Flight(new Plane(), new Schedule(airport), 200, "regular"),
                new Flight(new Plane(), new Schedule(airport), 400, "regular"),
                new Flight(new Plane(), new Schedule(airport), 600, "regular")
        };
        return flights;
    }

}

