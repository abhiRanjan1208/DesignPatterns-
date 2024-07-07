package org.learn.designpatterns.adapter.printer;

//Adapter class - implements target interface
public class PrinterAdapter implements Printer{

    LegacyPrinter legacyPrinter;

    public PrinterAdapter(){
        legacyPrinter = new LegacyPrinter();
    }

    @Override
    public void print() {
        legacyPrinter.printDocument();
    }
}
