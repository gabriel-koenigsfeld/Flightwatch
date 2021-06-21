package com.example.flightwatch;

import java.util.Random;

public class Flight {

    private Plane plane;
    private Schedule schedule;
    private int distance;
    private String status;
    private String[] everyStatus = new String[]{"SCHEDULED", "DELAYED", "DEPARTED", "CANCELLED", "ARRIVED"};

    //private enum Status
    //{SCHEDULED, DELAYED, DEPARTED, CANCELLED, ARRIVED};

    public Flight(Plane plane, Schedule schedule, int distance, String status){
        this.plane = plane;
        this.schedule = schedule;
        this.distance = distance;
        this.status = status;
    }

    public Flight() {
            this.generateFlight();
    }

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

    public void generateFlight(){
        this.setDistance(new Random().nextInt(10000));
        int randStatus = new Random().nextInt(everyStatus.length);
        this.setFlightStatus(everyStatus[randStatus]);
    }

}
