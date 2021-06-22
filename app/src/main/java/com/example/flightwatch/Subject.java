package com.example.flightwatch;

public interface Subject {
    public void registerObserver(Observer b);
    public void removeObserver(Observer b);
    public void notifyObserver(String abflugsort, String landungsort);
}
