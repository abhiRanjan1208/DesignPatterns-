package org.learn.designpatterns.observer.weatherapp;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private List<Observer> allObservers;
    private String weather;

    public WeatherStation() {
        allObservers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer){
        allObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        allObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        allObservers.stream().forEach(observer -> observer.update(weather));
    }

    public void updateWeather(String weather) {
        this.weather = weather;
        notifyObservers();
    }
}
