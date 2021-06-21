package com.example.flightwatch;

public interface Subjekt {
    public void registriereBeobachter(Beobachter b);
    public void entferneBeobachter(Beobachter b);
    public void benachrichtigeBeobachter(String abflugsort, String landungsort);
}
