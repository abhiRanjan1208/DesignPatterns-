package org.learn.designpatterns.template.dataprocessing;

public class XMLDataProcessor extends DataProcessor{


    @Override
    protected void loadData() {
        System.out.println("Load XML Data.");
    }

    @Override
    protected void operate() {
        System.out.println("Process XML Data.");
    }

    @Override
    protected void saveData() {
        System.out.println("Save data to XML file.");
    }
}
