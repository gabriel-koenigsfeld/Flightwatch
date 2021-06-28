/*
 * Schedule
 *
 * Version 1.0
 *
 * Königsfeld, Gabriel
 * Özugurlu, Sina
 * Karampelas, Panagiotis
 * Konadu, Joshua Osei-Bonsu
 */

package com.example.flightwatch;

import java.util.Random;

public class Schedule {

    /* Place of Departure */
    private String departure;

    /* Time of Departure */
    private String departureTime;

    /* Place at Destination */
    private String destination;

    /* Time at Destination */
    private String destinationTime;

    /* Places of Departure */
    private String[] departures = new String[]{"KLN", "HAM", "BRE", "HAJ", "LEJ", "MUC"};

    /* Places of Destination */
    private String[] destinations = new String[]{"KLN", "HAM", "BRE", "HAJ", "LEJ", "MUC"};

    /* Schedule Constructor */
    public Schedule(String departure, String departureTime, String destination, String destinationTime){
        this.departure = departure;
        this.departureTime = departureTime;
        this.destination = destination;
        this.destinationTime = destinationTime;
    }
    /* Schedule Randomizer Constructor */
    public Schedule(String departure){

        this.generateRoute(departure);
        this.generateSchedule();
    }

    public Schedule() {
        this.generateSchedule();
    }

    /* Getter and Setter */
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


    /* Method to generate Random Schedule */
    public void generateSchedule(){
        int departureRandHour = new Random().nextInt(23);                                       //Generate Random Int in Range 24
        int departureRandMinute = new Random().nextInt(59);                                     //Generate Random Int in Range 60
        int destinationRandHour = (departureRandHour + new Random().nextInt(2)+1) % 24;         //Generate Destination Hour and Minute (not too far from Departure)
        int destinationRandMinute = (departureRandMinute + new Random().nextInt(59)) % 60;

        String departureHourString;                                                                   //Strings to add Time into
        String departureMinuteString;
        String destinationHourString;
        String destinationMinuteString;

        if( departureRandHour < 10){                                                                    //If generated Departure Hour below 10, create String starting with 0
            departureHourString = "0" + departureRandHour;
        }else{
            departureHourString = String.valueOf(departureRandHour);                                    //If Departure Hour above 10, just create a String from Departure Hour Integer
        }
        if( departureRandMinute < 10){                                                                  //If generated Departure Minute below 10, create String starting with 0
            departureMinuteString = "0" + departureRandMinute;
        }else{
            departureMinuteString = String.valueOf(departureRandMinute);                                //If Departure Minute above 10, just create a String from Departure Minute Integer
        }

        if( destinationRandHour < 10){                                                                  //If Destination Hour below 10, create String starting with 0
            destinationHourString = "0" + destinationRandHour;
        }else{
            destinationHourString = String.valueOf(destinationRandHour);                                //If Destination Hour above 10, just create String from Destination Hour Integer
        }
        if( destinationRandMinute < 10){
            destinationMinuteString = "0" + destinationRandMinute;                                      //If Destination Minute below 10, create String starting with 0
        }else{
            destinationMinuteString = String.valueOf(destinationRandMinute);                            //If Destination Minute above 10, just c reate String from Destination Minute Integer
        }

        this.setDepartureTime(departureHourString + ":" + departureMinuteString);                       //Set Departure Time String as "..:.." Format
        this.setDestinationTime(destinationHourString + ":" + destinationMinuteString);                 //Set Destination Time String as "..:.." Format

    }

    /* Function to generate random Route */
    public void generateRoute(String departure){
        int randDes = new Random().nextInt(destinations.length);                                        //Pick a random Int in the range of Destinations Array

        while(departure.equals(destinations[randDes])){                                                 //If departure equals destination, generate new place of Departure
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
