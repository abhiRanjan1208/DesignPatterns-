package org.learn.designpatterns.state.vendingmachine;

public class VendingMachine {

    State state;

    public VendingMachine(){
        this.state = new NoCoinState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertCoin(){
        this.state = state.insertCoin();
    }

    public void ejectCoin(){
        this.state = state.ejectCoin();
    }

    public void pressButton(){
        this.state = state.pressButton();
    }

    public void dispense(){
        this.state = state.dispense();
    }
}
