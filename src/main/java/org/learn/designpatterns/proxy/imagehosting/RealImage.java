package org.learn.designpatterns.proxy.imagehosting;

public class RealImage implements Image{

    String filename;

    public RealImage(String filename){
        this.filename = filename;
        loadImageFromDisk();
    }

    //high performance task
    private void loadImageFromDisk(){
        System.out.println("Load image - " + filename + " from disk.");
    }

    @Override
    public void display() {
        System.out.println("Display image - " + this.filename);
    }
}
