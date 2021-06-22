package com.example.flightwatch;

import java.util.Random;

public class Schedule {

    //Place of Departure
    private String departure;

    //Time of Departure
    private String departureTime;

    //Place of Destination
    private String destination;

    //Time at Destination
    private String destinationTime;

    //Places of Departures
    private String[] departures = new String[]{"KLN", "HAM", "BRE", "HAJ", "LEJ", "MUC"};

    //Places of Destination
    private String[] destinations = new String[]{"KLN", "HAM", "BRE", "HAJ", "LEJ", "MUC"};

    //Schedule Constructor
    public Schedule(String departure, String departureTime, String destination, String destinationTime){
        this.departure = departure;
        this.departureTime = departureTime;
        this.destination = destination;
        this.destinationTime = destinationTime;
    }

    //Schedule Randomizer Constructor
    public Schedule(String departure){

        this.generateRoute(departure);
        this.generateSchedule();
    }

    public Schedule() {
        this.generateSchedule();
    }

    //Getter and Setter
    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestinationTime() {
        return destinationTime;
    }

    public void setDestinationTime(String destinationTime) {
        this.destinationTime = destinationTime;
    }

    //Method to generate Schedule
    public void generateSchedule(){
        int departureRandHour = new Random().nextInt(23);                                       //Create Random Value for Departure Hour in range(24)
        int departureRandMinute = new Random().nextInt(59);                                     //Create Random Minute in range(60)
        int destinationRandHour = (departureRandHour + new Random().nextInt(2)+1) % 24;         //Making sure Hour and Minutes are close
        int destinationRandMinute = (departureRandMinute + new Random().nextInt(59)) % 60;

        String departureHourString;                                                                   //Create empty Strings for Time Values
        String departureMinuteString;
        String destinationHourString;
        String destinationMinuteString;

        if( departureRandHour < 10){                                                                  //Create String by Adding departure Hour to 0 (if hour below 10)
            departureHourString = "0" + departureRandHour;
        }else{
            departureHourString = String.valueOf(departureRandHour);                                  //Else just overwrite Hour with int Value of Hour (toString)
        }
        if( departureRandMinute < 10){                                                                //Create String by adding departure Minute to 0 (if minute below 10)
            departureMinuteString = "0" + departureRandMinute;
        }else{
            departureMinuteString = String.valueOf(departureRandMinute);                              //Else just overwrite Minute with int Value of Minute (toString)
        }

        if( destinationRandHour < 10){                                                                //Create String by adding destination Hour to 0 (if hour below 10)
            destinationHourString = "0" + destinationRandHour;
        }else{
            destinationHourString = String.valueOf(destinationRandHour);                              //Else just overwrite Hour with int Value of Hour (toString)
        }
        if( destinationRandMinute < 10){
            destinationMinuteString = "0" + destinationRandMinute;                                    //Create String by adding destination Minute to 0 (if minute below 10)
        }else{
            destinationMinuteString = String.valueOf(destinationRandMinute);                          //Else just overwrite Minute with int Value of Minute (toString)
        }

        this.setDepartureTime(departureHourString + ":" + departureMinuteString);                     //Set Minute and Hour to Object
        this.setDestinationTime(destinationHourString + ":" + destinationMinuteString);

    }

    //Method to generate Route
    public void generateRoute(String departure){
        int randDes = new Random().nextInt(destinations.length);                                        //Pick Random Value from destinations Array

        while(departure.equals(destinations[randDes])){                                                 //If Destination Value == Departure Value (e.g HAM - HAM) generate new departure
            randDes = new Random().nextInt(destinations.length);
        }

        if(new Random().nextBoolean()){
            this.departure = departure;
            this.setDestination(destinations[randDes]);
        }else{
            this.departure = destinations[randDes];
            this.setDestination(departure);
        }

    }
}
