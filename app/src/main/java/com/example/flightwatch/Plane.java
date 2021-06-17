package com.example.flightwatch;

public class Plane {
    private int passengerCapacity;
    private String type;

    public Plane(int passengerCapacity, String type){
        this.passengerCapacity = passengerCapacity;
        this.type = type;
    }

    public int getPassengerCapacity(){
        return passengerCapacity;
    }

    public String getType(){
        return type;
    }

}
