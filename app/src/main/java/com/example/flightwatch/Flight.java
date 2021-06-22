package com.example.flightwatch;

import java.util.Random;

public class Flight {

    //Plane Object
    private Plane plane;

    //Schedule Object
    private Schedule schedule;

    //Distance
    private int distance;

    //Status
    private String status;

    //Different Types of States
    private String[] everyStatus = new String[]{"SCHEDULED", "DELAYED", "DEPARTED", "CANCELLED", "ARRIVED"};

    //Flight Constructor
    public Flight(Plane plane, Schedule schedule, int distance, String status){
        this.plane = plane;
        this.schedule = schedule;
        this.distance = distance;
        this.status = status;
    }

    //Random Flight Constructor
    public Flight() {
            this.generateFlight();
    }

    //Getter and Setter
    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getFlightStatus() {
        return status;
    }

    public void setFlightStatus(String status) {
        this.status = status;
    }

    //Method to generate random Flight
    public void generateFlight(){
        this.setDistance(new Random().nextInt(10000));              //Random Int set as Distance
        int randStatus = new Random().nextInt(everyStatus.length);         //Random Value from Status Array set as Status
        this.setFlightStatus(everyStatus[randStatus]);
    }

}
