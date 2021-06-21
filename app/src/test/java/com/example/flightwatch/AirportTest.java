package com.example.flightwatch;

import junit.framework.TestCase;

public class AirportTest extends TestCase {

    Subject subject;
    Weather weather;

    Airport airport = new Airport("Hamburg", "Hamburg", 1000, 10, 10, subject, null);


    public void testGetCity() {
        String city = "Hamburg";
        assertEquals(city, airport.getCity());
    }

}