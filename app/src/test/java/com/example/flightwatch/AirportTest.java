package com.example.flightwatch;

import junit.framework.TestCase;

public class AirportTest extends TestCase {

    Subjekt subject;

    Airport airport = new Airport("Hamburg", "Hamburg", 1000, 10, 10,new Airports(), new Weather());


    public void testGetCity() {
        assertEquals("Hamburg", airport.getCity());
    }

    public void testGetName(){
        assertEquals("Hamburg", airport.getName());
    }


}