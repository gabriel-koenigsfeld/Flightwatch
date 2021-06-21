package com.example.flightwatch;

import junit.framework.TestCase;

public class ScheduleTest extends TestCase {

    Schedule schedule = new Schedule("Hamburg", "8:00", "Köln", "10:00");

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

}