package com.example.flightwatch;

public class Flight {

    private int distance;

    private enum Status
    {SCHEDULED, DELAYED, DEPARTED, CANCELLED, ARRIVED};

    public Flight(int distance, Status status){
        this.distance = distance;
    }

    public int getDistance(){
        return distance;
    }


}
