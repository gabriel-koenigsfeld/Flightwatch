package com.example.flightwatch;

import junit.framework.TestCase;

public class AirportTest extends TestCase {
    
    Subject subject;
    Weather weather;

    Airport airport = new Airport("Hamburg", "Hamburg", 1000, 10, 10,new Airports(), new Weather());

    //Constructor Tests
    public void testGetCity() {
        assertEquals("Hamburg", airport.getCity());
    }

    public void testGetName(){
        assertEquals("Hamburg", airport.getName());
    }


}