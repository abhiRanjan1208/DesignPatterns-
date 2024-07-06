package org.learn.designpatterns.observer.weatherapp;

public class PhoneDisplay implements Observer{

    private String weather;

    public PhoneDisplay() {
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
