package com.example.flightwatch;

import java.util.Random;

public class Schedule {

    private String departure;
    private String departureTime;
    private String destination;
    private String destinationTime;

    private String[] departures = new String[]{"KLN", "HAM", "BRE", "HAJ", "LEJ", "MUC"};
    private String[] destinations = new String[]{"KLN", "HAM", "BRE", "HAJ", "LEJ", "MUC"};

    //private String[] departures = new String[]{"Köln", "Hamburg", "Bremen", "Hannover", "Leipzig", "München"};
    //private String[] destinations = new String[]{"Köln", "Hamburg", "Bremen", "Hannover", "Leipzig", "München"};

    public Schedule(String departure, String departureTime, String destination, String destinationTime){
        this.departure = departure;
        this.departureTime = departureTime;
        this.destination = destination;
        this.destinationTime = destinationTime;
    }
    public Schedule(String departure){

        this.generateRoute(departure);
        this.generateSchedule();
    }

    public Schedule() {
        this.generateSchedule();
    }

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

    public void generateSchedule(){
        int departureRandHour = new Random().nextInt(23);
        int departureRandMinute = new Random().nextInt(59);
        int destinationRandHour = (departureRandHour + new Random().nextInt(2)+1) % 24;
        int destinationRandMinute = (departureRandMinute + new Random().nextInt(59)) % 60;

        String departureHourString;
        String departureMinuteString;
        String destinationHourString;
        String destinationMinuteString;

        if( departureRandHour < 10){
            departureHourString = "0" + departureRandHour;
        }else{
            departureHourString = String.valueOf(departureRandHour);
        }
        if( departureRandMinute < 10){
            departureMinuteString = "0" + departureRandMinute;
        }else{
            departureMinuteString = String.valueOf(departureRandMinute);
        }

        if( destinationRandHour < 10){
            destinationHourString = "0" + destinationRandHour;
        }else{
            destinationHourString = String.valueOf(destinationRandHour);
        }
        if( destinationRandMinute < 10){
            destinationMinuteString = "0" + destinationRandMinute;
        }else{
            destinationMinuteString = String.valueOf(destinationRandMinute);
        }

        this.setDepartureTime(departureHourString + ":" + departureMinuteString);
        this.setDestinationTime(destinationHourString + ":" + destinationMinuteString);

    }

    public void generateRoute(String departure){
        int randDes = new Random().nextInt(destinations.length);

        while(departure.equals(destinations[randDes])){
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
