package org.learn.designpatterns.proxy.imagehosting;

/**
 You are working on a software application that interacts with an external image
 hosting service. The application needs to display images from this service on
 demand. However, fetching and displaying images directly from the remote server
 can be slow, especially if the images are large or the network is slow.
 Additionally, some images might require authentication or logging to access them.
 */

public class Runner {

    public static void main(String[] args){

        //Create proxy proxyImage and display it twice.
        ProxyImage proxyImage = new ProxyImage("Image1.txt", true, true);
        proxyImage.display();
        proxyImage.display();

    }
}
