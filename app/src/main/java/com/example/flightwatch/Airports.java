package com.example.flightwatch;

import java.util.ArrayList;

public class Airports implements Subject {

    //ArrayList with Observer Objects
    private ArrayList<Observer> observer;

    public Airports(){
        observer = new ArrayList<Observer>();
    }

    //Overrides of Subject Function
    @Override
    public void registerObserver(Observer b) {
        observer.add(b);
    }

    @Override
    public void removeObserver(Observer b) {
        int i = observer.indexOf(b);
        if(i >= 0){
            observer.remove(i);
        }
    }

    @Override
    public void notifyObserver(String landungsort, String abflugort) {
        for (int i = 0; i < observer.size(); i++){
            Observer b = (Observer) observer.get(i);
            b.refresh(landungsort,abflugort);
        }
    }
}
