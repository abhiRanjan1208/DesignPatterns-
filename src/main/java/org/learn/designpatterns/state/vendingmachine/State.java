package org.learn.designpatterns.state.vendingmachine;

public interface State {

    State insertCoin();
    State ejectCoin();
    State pressButton();
    State dispense();
}
