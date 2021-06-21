package com.example.flightwatch;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import java.util.ArrayList;

public class Airports implements Subjekt, Parcelable {
    private ArrayList<Beobachter> beobachter;

    public Airports(){
        beobachter = new ArrayList<Beobachter>();
    }

    protected Airports(Parcel in) {
        beobachter = new ArrayList<Beobachter>();
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
    public void registriereBeobachter(Beobachter b) {

        Log.e("bug",""+this.beobachter);
        beobachter.add(b);
    }

    @Override
    public void entferneBeobachter(Beobachter b) {
        int i = beobachter.indexOf(b);
        if(i >= 0){
            beobachter.remove(i);
        }
    }

    public int beobachterSize(){
        return beobachter.size();
    }

    @Override
    public void benachrichtigeBeobachter(String landungsort,String abflugort) {
        for (int i =  0; i < beobachter.size(); i++){
            Beobachter b = (Beobachter)beobachter.get(i);
            b.aktualisieren(landungsort,abflugort);
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
