package org.learn.designpatterns.state.vendingmachine;

/**
 Consider a vending machine that dispenses items when money is inserted. The
 vending machine has different states such as:
 - NoCoinState: No coin has been inserted.
 - HasCoinState: A coin has been inserted.
 - SoldState: An item is being dispensed.
 - SoldOutState: The machine is out of items.

 */

public class Runner {

    public static void main(String[] args){

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertCoin();
        vendingMachine.pressButton();
        vendingMachine.dispense();

        vendingMachine.insertCoin();
        vendingMachine.ejectCoin();
        vendingMachine.ejectCoin();

        vendingMachine.setState(new SoldOutState());
        vendingMachine.insertCoin();
    }
}
