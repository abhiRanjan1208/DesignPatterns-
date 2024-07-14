package org.learn.designpatterns.template.dataprocessing;

public abstract class DataProcessor {

    protected abstract void loadData();
    protected abstract void operate();
    protected abstract void saveData();

    public final void processData(){
        loadData();
        operate();
        saveData();
    }
}
