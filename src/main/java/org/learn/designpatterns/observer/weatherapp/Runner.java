package org.learn.designpatterns.observer.weatherapp;

/**

 Ref - GFG

 - Let us Imagine a scenario where the weather station is observed by various smart devices.
 - The weather station maintains a list of registered devices.
 - When there’s a change in weather conditions, the weather station notifies all devices about the update.

 Observer - Device is an observer, each device, acts as a concrete observer.
 Subject - Weather station is a subject, each weather station at different location, acts as a concrete subject.

 Implementation Steps -
    - Subject Interface - Declare an interface Subject with abstract methods -
        - addObserver(Observer observer)
        - removeObserver(Observer observer)
        - notifyObservers()
    - Observer Interface - Declare an interface Observer with abstract methods -
        - update(String weather);
    - WeatherStation (Concrete Subject)
        - maintains the list of Observer
        - provides method to inform all the Observers - notifyObservers()
        - setWeather() - set weather and notify All
    - PhoneDisplay, TVDisplay (Concrete observer)
        - implements method update to set weather
 */



public class Runner {

    public static void main(String[] args) {
        TVDisplay tvDisplay = new TVDisplay();
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        WeatherStation weatherStation = new WeatherStation();

        weatherStation.addObserver(tvDisplay);
        weatherStation.addObserver(phoneDisplay);
        weatherStation.updateWeather("Sunny");

        weatherStation.removeObserver(tvDisplay);
        weatherStation.updateWeather("Rainy");

    }
}
