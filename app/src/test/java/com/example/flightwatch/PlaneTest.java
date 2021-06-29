/*
 * PlaneTest
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

public class PlaneTest extends TestCase {

    Plane plane = new Plane(50, "groß");

    /* Constructor Tests */
    public void testGetPassengerCapacity(){
        assertEquals(50, plane.getPassengerCapacity());
    }

    public void testGetType(){
        assertEquals("groß", plane.getType());
    }

    /* Generator Test */
    public void testGeneratePlane(){
        Plane plane2 = new Plane();

        assertEquals(plane2.getType(), plane.getType());
    }

}