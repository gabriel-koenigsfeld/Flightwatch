package com.example.flightwatch;

import junit.framework.TestCase;

public class FlightTest extends TestCase {

    Flight flight = new Flight(new Plane(), new Schedule(), 100, "DELAYED");

    public void testGetDistance(){
        assertEquals(100, flight.getDistance());
    }

    public void testGetStatus(){
        assertEquals("DELAYED", flight.getFlightStatus());
    }

}