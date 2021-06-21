package com.example.flightwatch;

import junit.framework.TestCase;

public class AirportTest extends TestCase {

    Subjekt subject;
    Weather weather;

    Airport airport = new Airport("Hamburg", "Hamburg", 1000, 10, 10, subject, weather);

    public void testAktualisieren() {
    }

    public void testGetFlights() {

    }

    public void testSetFlights() {
    }

    public void testGetWeather() {
    }

    public void testTestGetName() {
    }

    public void testGetCity() {
        String city = "Hamburg";
        assertEquals(city, airport.getCity());
    }

    public void testGetStatus() {
    }

    public void testStartGeneratingFlights() {
    }
}