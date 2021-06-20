package com.example.flightwatch;

public class Flight {

    Plane plane;
    Schedule schedule;
    private int distance;
    private String flightStatus;

    //private enum Status
    //{SCHEDULED, DELAYED, DEPARTED, CANCELLED, ARRIVED};

    public Flight(Plane plane, Schedule schedule, int distance, String status){
        this.plane = plane;
        this.schedule = schedule;
        this.distance = distance;
        this.flightStatus = status;
    }


    public int getDistance(){
        return distance;
    }

    public String getFlightStatus() {
        return flightStatus;
    }
}
