package org.learn.designpatterns.observer.weatherapp;

public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
