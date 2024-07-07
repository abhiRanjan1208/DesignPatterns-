package org.learn.designpatterns.proxy.imagehosting;

public class ProxyImage implements Image{

    String filename;
    Boolean loggingEnabled;
    Boolean isAuthenticated;

    RealImage realImage;

    public ProxyImage(String filename, Boolean loggingEnabled, Boolean isAuthenticated){
        this.filename = filename;
        this.loggingEnabled = loggingEnabled;
        this.isAuthenticated = isAuthenticated;
    }

    @Override
    public void display() {
        if(this.loggingEnabled){
            if(this.isAuthenticated){
                if(realImage == null){
                    realImage = new RealImage(this.filename);
                }
                realImage.display();
            }
            else {
                System.out.println("Access denied.");
            }
        }
        else{
            if(realImage == null){
                realImage = new RealImage(this.filename);
            }
            realImage.display();
        }
    }
}
