package com.example.flightwatch;

public class Schedule {

    private String departure;
    private String departureTime;
    private String destination;
    private String destinationTime;

    public Schedule(String departure, String departureTime, String destination, String destinationTime){
        this.departure = departure;
        this.departureTime = departureTime;
        this.destination = destination;
        this.destinationTime = destinationTime;
    }

    public String getDeparture(){
        return departure;
    }

    public String getDestination(){
        return destination;
    }

    public String getDepartureTime(){
        return departureTime;
    }

    public String getDestinationTime(){
        return destinationTime;
    }
}
