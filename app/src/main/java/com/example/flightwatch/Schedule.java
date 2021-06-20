package com.example.flightwatch;

import java.util.Random;

public class Schedule {

    private String departure;
    private String departureTime;
    private String destination;
    private String destinationTime;

    private String[] departures = new String[]{"Köln", "Hamburg", "Bremen", "Hannover", "Leipzig", "München"};
    private String[] destinations = new String[]{"Köln", "Hamburg", "Bremen", "Hannover", "Leipzig", "München"};

    public Schedule(String departure, String departureTime, String destination, String destinationTime){
        this.departure = departure;
        this.departureTime = departureTime;
        this.destination = destination;
        this.destinationTime = destinationTime;
    }

    public Schedule() {

    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestinationTime() {
        return destinationTime;
    }

    public void setDestinationTime(String destinationTime) {
        this.destinationTime = destinationTime;
    }

    public Schedule generateSchedule(){
        Schedule randSchedule = null;
        int randDep = new Random().nextInt(departures.length);
        randSchedule.setDeparture(departures[randDep]);
        int randDes = new Random().nextInt(destinations.length);
        randSchedule.setDestination(destinations[randDes]);

        return randSchedule;
    }
}
