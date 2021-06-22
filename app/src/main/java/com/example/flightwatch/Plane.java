package com.example.flightwatch;

import java.util.Random;

public class Plane {

    //Number of possible Passengers
    private int passengerCapacity;

    //Type of Plane
    private String type;

    //Types of Planes
    private String[] planeTypes = new String[]{"Airbus", "Boeing"};

    //Constructor
    public Plane(int passengerCapacity, String type){
        this.passengerCapacity = passengerCapacity;
        this.type = type;
    }

    //Randomizer Constructor
    public Plane() {

        this.generatePlane(); //uses generatePlane() function
    }

    //Getter and Setter
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

    //Plane Generator
    public void generatePlane(){
        int randType = new Random().nextInt(planeTypes.length);                                                    //generate Random Number
        //Airbus Names
        if(randType == 0){                                                                                         //If the Random Number is 0, pick an Airbus Name
            this.setType(planeTypes[randType] + " A" + String.valueOf(new Random().nextInt(9)*10 + 300));
        }

        //Boeing Names
        if(randType == 1){                                                                                         //If the Random Number ist 1, pick a Boeing Name
            this.setType(planeTypes[randType] + " " + String.valueOf(new Random().nextInt(9)*10 + 707));
        }
        this.setPassengerCapacity(new Random().nextInt(300));                                               //Random Value for Passenger Capacity in range(300)
    }
}
