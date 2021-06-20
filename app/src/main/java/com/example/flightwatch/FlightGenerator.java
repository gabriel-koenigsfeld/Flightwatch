package com.example.flightwatch;

import java.util.Random;

public class FlightGenerator {

    private Flight flight;

    public FlightGenerator(Flight flight){
        this.flight = flight;
    }

    public FlightGenerator createFlight(){
        Plane plane = new Plane();
        plane.generatePlane();
        Schedule sched = new Schedule();
        sched.generateSchedule();

        Flight flight = new Flight();
        flight.generateFlight();
        flight.setSchedule(sched);
        flight.setPlane(plane);

        FlightGenerator flightGenerator = new FlightGenerator(flight);

        return flightGenerator;
        

    }


}
