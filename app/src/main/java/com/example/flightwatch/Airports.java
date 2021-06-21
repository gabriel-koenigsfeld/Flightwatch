package com.example.flightwatch;

import android.util.Log;

import java.util.ArrayList;

public class Airports implements Subjekt {
    private ArrayList<Beobachter> beobachter;

    public Airports(){
        beobachter = new ArrayList<Beobachter>();
    }
    @Override
    public void registriereBeobachter(Beobachter b) {
        beobachter.add(b);
    }

    @Override
    public void entferneBeobachter(Beobachter b) {
        int i = beobachter.indexOf(b);
        if(i >= 0){
            beobachter.remove(i);
        }
    }

    @Override
    public void benachrichtigeBeobachter(String landungsort,String abflugort) {
        for (int i =  0; i < beobachter.size(); i++){
            Beobachter b = (Beobachter)beobachter.get(i);
            b.aktualisieren(landungsort,abflugort);
        }
    }
}
