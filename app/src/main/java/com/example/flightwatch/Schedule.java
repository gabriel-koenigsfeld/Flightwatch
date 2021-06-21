package com.example.flightwatch;

import java.util.Random;

public class Schedule {

    private String departure;
    private String departureTime;
    private String destination;
    private String destinationTime;

    private String[] departures = new String[]{"KLN", "HAM", "BRE", "HAJ", "LEJ", "MUC"};
    private String[] destinations = new String[]{"KLN", "HAM", "BRE", "HAJ", "LEJ", "MUC"};

    //private String[] departures = new String[]{"Köln", "Hamburg", "Bremen", "Hannover", "Leipzig", "München"};
    //private String[] destinations = new String[]{"Köln", "Hamburg", "Bremen", "Hannover", "Leipzig", "München"};

    public Schedule(String departure, String departureTime, String destination, String destinationTime){
        this.departure = departure;
        this.departureTime = departureTime;
        this.destination = destination;
        this.destinationTime = destinationTime;
    }
    public Schedule(String departure){
        this.departure = departure;
        this.generateDestination();
    }

    public Schedule() {
        this.generateSchedule();
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

    public void generateSchedule(){
        int randDep = new Random().nextInt(departures.length);
        this.setDeparture(departures[randDep]);
        int randDes = new Random().nextInt(destinations.length);
        this.setDestination(destinations[randDes]);
    }

    public void generateDestination(){
        int randDes = new Random().nextInt(destinations.length);

        while(this.departure.equals(destinations[randDes])){
            randDes = new Random().nextInt(destinations.length);
        }
        this.setDestination(destinations[randDes]);
    }
}
