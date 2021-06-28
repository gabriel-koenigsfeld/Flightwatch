/*
 * ScheduleTest
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

public class ScheduleTest extends TestCase {

    Schedule schedule = new Schedule("Hamburg", "8:00", "Köln", "10:00");

    /* Constructor Tests */
    public void testGetDeparture(){
        assertEquals("Hamburg", schedule.getDeparture());
    }

    public void testGetDepartureTime(){
        assertEquals("8:00", schedule.getDepartureTime());
    }

    public void testGetDestination(){
        assertEquals("Köln", schedule.getDestination());
    }

    public void testGetDestinationTime(){
        assertEquals("10:00", schedule.getDestinationTime());
    }

    /* Generator Test */
    public void testScheduleGenerator(){
        Schedule schedule = new Schedule();

        assertTrue(schedule.getDepartureTime().contains(":"));
        assertTrue(schedule.getDestination() != "");
    }

}