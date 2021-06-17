package com.example.flightwatch;

public class Flight {

    private String flightName;
    private String departureTime;
    private String destinationTime;
    private String departureCity;
    private String destinationCity;

    private int distance;
    private String flightStatus;

    //private enum Status
    //{SCHEDULED, DELAYED, DEPARTED, CANCELLED, ARRIVED};

    public Flight(String flightName, String departureTime, String destinationTime, String departureCity, String destinationCity, int distance, String status){
        this.flightName = flightName;
        this.departureTime = departureTime;
        this.destinationTime = destinationTime;
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.distance = distance;
        this.flightStatus = status;
    }

    public String getFlightName() {
        return flightName;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getDestinationTime() {
        return destinationTime;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public int getDistance(){
        return distance;
    }


}
