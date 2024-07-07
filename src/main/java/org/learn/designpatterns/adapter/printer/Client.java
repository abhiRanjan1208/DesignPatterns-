package org.learn.designpatterns.adapter.printer;

public class Client {

    //Client code that accepts target interface - Printer
    public void clientCode(Printer printer){
        printer.print();
    }
}
