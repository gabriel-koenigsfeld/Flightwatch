package com.example.flightwatch;

import junit.framework.TestCase;

public class PlaneTest extends TestCase {

    Plane plane = new Plane(50, "groß");

    public void testGetPassengerCapacity(){
        assertEquals(50, plane.getPassengerCapacity());
    }

    public void testGetType(){
        assertEquals("groß", plane.getType());
    }

}