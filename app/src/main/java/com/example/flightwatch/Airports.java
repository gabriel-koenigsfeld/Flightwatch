package com.example.flightwatch;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import java.util.ArrayList;
//Parcelable interface for transfering object between activities
public class Airports implements Subject, Parcelable {
    private ArrayList<Observer> observer;

    public Airports(){
        observer = new ArrayList<Observer>();
    }

    protected Airports(Parcel in) {
        observer = new ArrayList<Observer>();
    }

    public static final Creator<Airports> CREATOR = new Creator<Airports>() {
        @Override
        public Airports createFromParcel(Parcel in) {
            return new Airports(in);
        }

        @Override
        public Airports[] newArray(int size) {
            return new Airports[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
