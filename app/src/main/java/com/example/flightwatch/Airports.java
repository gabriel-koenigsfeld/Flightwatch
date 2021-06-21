package com.example.flightwatch;

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
    public void benachrichtigeBeobachter(String landungsort,String abflugort) {
        for (int i =  0; i < beobachter.size(); i++){
            Beobachter b = (Beobachter)beobachter.get(i);
            b.aktualisieren(landungsort,abflugort);
        }
    }
}
