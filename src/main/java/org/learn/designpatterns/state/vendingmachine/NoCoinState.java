package org.learn.designpatterns.state.vendingmachine;

public class NoCoinState implements State {

    @Override
    public State insertCoin() {
        System.out.println("Coin Inserted.");
        return new HasCoinState();
    }

    @Override
    public State ejectCoin() {
        System.out.println("No coin to eject.");
        return this;
    }

    @Override
    public State pressButton() {
        System.out.println("Insert a coin first.");
        return this;
    }

    @Override
    public State dispense() {
        System.out.println("No coin inserted.");
        return this;
    }
}
