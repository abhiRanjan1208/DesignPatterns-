package org.learn.designpatterns.template.dataprocessing;

public class CSVDataProcessor extends DataProcessor{

    @Override
    protected void loadData() {
        System.out.println("Load CSV data.");
    }

    @Override
    protected void operate() {
        System.out.println("Process CSV data.");
    }

    @Override
    protected void saveData() {
        System.out.println("Save data to CSV file.");
    }
}
