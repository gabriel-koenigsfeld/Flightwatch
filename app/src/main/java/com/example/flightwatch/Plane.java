package com.example.flightwatch;

import java.util.Random;

public class Plane {
    private int passengerCapacity;
    private String type;

    private String[] planeTypes = new String[]{"Airbus", "Boeing"};

    public Plane(int passengerCapacity, String type){
        this.passengerCapacity = passengerCapacity;
        this.type = type;
    }

    public Plane() {
        this.generatePlane();
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

    public void generatePlane(){
        int randType = new Random().nextInt(planeTypes.length);
        //Airbus Names
        if(randType == 0){
            this.setType(planeTypes[randType] + " A" + String.valueOf(new Random().nextInt(9)*10 + 300));
        }

        //Boeing Names
        if(randType == 1){
            this.setType(planeTypes[randType] + " " + String.valueOf(new Random().nextInt(9)*10 + 707));
        }
        this.setPassengerCapacity(new Random().nextInt(300));
    }
}
