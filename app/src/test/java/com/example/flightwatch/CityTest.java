package com.example.flightwatch;

import junit.framework.TestCase;

public class CityTest extends TestCase {

    City city = new City("Stadt", new String[]{"Airport1", "Airport2"});

    public void testTestGetName() {
        assertEquals("Stadt", city.getName());
    }

    public void testGetAirports() {
        assertEquals(new String[]{"Airport1", "Airport2"}, city.getAirports());
    }
}