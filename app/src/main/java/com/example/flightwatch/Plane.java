package com.example.flightwatch;

import java.util.Random;

public class Plane {
    private int passengerCapacity;
    private String type;

    private String[] planeType = new String[]{"Airbus", "Boeing"};

    public Plane(int passengerCapacity, String type){
        this.passengerCapacity = passengerCapacity;
        this.type = type;
    }

    public Plane() {

    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Plane generatePlane(){
        Plane randPlane = null;
        int randType = new Random().nextInt(planeType.length);

        randPlane.setType(planeType[randType]);
        randPlane.setPassengerCapacity(new Random().nextInt(300));

        return randPlane;
    }
}
