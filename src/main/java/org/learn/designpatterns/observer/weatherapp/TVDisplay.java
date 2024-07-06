package org.learn.designpatterns.observer.weatherapp;

public class TVDisplay implements Observer{

    private String weather;

    public TVDisplay() {
    }

    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    private void display() {
        System.out.println("Weather updated - " + weather);
    }

}
