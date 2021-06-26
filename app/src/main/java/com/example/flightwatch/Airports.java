package com.example.flightwatch;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import java.util.ArrayList;
public class Airports implements Subject {
    private ArrayList<Observer> observer;

    public Airports(){
        observer = new ArrayList<Observer>();
    }


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

    public int beobachterSize(){
        return observer.size();
    }

    @Override
    public void notifyObserver(String landungsort, String abflugort) {
        for (int i = 0; i < observer.size(); i++){
            Observer b = (Observer) observer.get(i);
            b.refresh(landungsort,abflugort);
        }
    }
}
