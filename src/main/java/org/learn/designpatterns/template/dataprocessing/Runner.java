package org.learn.designpatterns.template.dataprocessing;

/**
 You are developing a data processing framework that processes different
 types of data files (e.g., CSV, JSON, XML). The framework needs to support a
 series of common steps such as reading data, processing data, and saving the
 results, but each data file type might have specific variations in these steps.
 */

public class Runner {

    public static void main(String[] args){

        CSVDataProcessor csvDataProcessor = new CSVDataProcessor();
        csvDataProcessor.processData();

        XMLDataProcessor xmlDataProcessor = new XMLDataProcessor();
        xmlDataProcessor.processData();
    }
}
