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
    private FlightGenerator(Subjekt airports){
        this.airports = airports;
    }
    public static FlightGenerator getInstance(Subjekt airports){
        if(flightGenerator == null){
            flightGenerator = new FlightGenerator(airports);
        }
        return flightGenerator;
    }


    public Flight generateFlight(String airport){
        String[] list = this.getDestinationAndDeparture(airport);
        Flight flight = new Flight("A380","16:00","18:00",list[0],list[1],1000,"regular");

        new Thread(()->{
            airports.benachrichtigeBeobachter("all",list[0]);
        }).start();
        return flight;
    }

    public Flight[] getDummyFlights(String airport){
        Flight[] flights = {
                new Flight("A380","12:00","14:00",airport,"irgendwo",200,"regular"),
                new Flight("A380","14:00","16:00",airport,"irgendwo",400,"regular"),
                new Flight("A380","16:00","18:00",airport,"irgendwo",600,"regular")
        };
        return flights;
    }

    private String[] getDestinationAndDeparture(String airport){
        String[] resultList = new String[2];
        List<String> airportList = Arrays.asList(this.getAirportList());
        for (String item: airportList) {
            if(item.equals(airport)){
                airportList.remove(item);
            }
        }

        Collections.shuffle(airportList);
        resultList[0] = airportList.get(0);
        resultList[1] = airportList.get(1);

        return resultList;
    }

    private String[] getAirportList(){
        String[] airportList = {"a","b","c","d","e","f"};
        return airportList;
    }
}
