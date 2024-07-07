package org.learn.designpatterns.adapter.printer;

/**
 Let’s consider a scenario where we have an existing system that uses a LegacyPrinter
 class with a method named printDocument() which we want to adapt into a new system that expects a Printer interface with a method named print().
 We’ll use the Adapter design pattern to make these two interfaces compatible.
 */

public class Runner {

    public static void main(String[] args){
        Client client = new Client();
        client.clientCode(new PrinterAdapter());
    }
}
