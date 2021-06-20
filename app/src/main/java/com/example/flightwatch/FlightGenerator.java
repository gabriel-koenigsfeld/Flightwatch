package com.example.flightwatch;

import java.util.Random;

public class FlightGenerator {

    private Flight flight;
    private String[] departures = new String[]{"Köln", "Hamburg", "Bremen", "Hannover", "Leipzig", "München"};
    private String[] destinations = new String[]{"Köln", "Hamburg", "Bremen", "Hannover", "Leipzig", "München"};

    public FlightGenerator(Flight flight){
        this.flight = flight;
    }

    public Schedule generateSchedule(){
        Schedule randSchedule = null;
        int randDep = new Random().nextInt(departures.length);
        randSchedule.setDeparture(departures[randDep]);

    }
}
