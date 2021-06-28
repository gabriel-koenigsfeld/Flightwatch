/*
 * FlightTest
 *
 * Version 1.0
 *
 * Königsfeld, Gabriel
 * Özugurlu, Sina
 * Karampelas, Panagiotis
 * Konadu, Joshua Osei-Bonsu
 */

package com.example.flightwatch;

import junit.framework.TestCase;

public class FlightTest extends TestCase {

    Flight flight = new Flight(new Plane(), new Schedule(), 100, "DELAYED");

    /* Constructor Tests */
    public void testGetDistance(){
        assertEquals(100, flight.getDistance());
    }

    public void testGetStatus(){
        assertEquals("DELAYED", flight.getFlightStatus());
    }

    /* Generator Test */
    public void testFlightGenerator(){
        Flight flight = new Flight();
        assertFalse(flight.getDistance() > 10000);
        assertTrue(flight.getFlightStatus() != "");
    }

}