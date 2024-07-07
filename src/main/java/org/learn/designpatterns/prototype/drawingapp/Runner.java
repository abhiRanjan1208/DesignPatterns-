package org.learn.designpatterns.prototype.drawingapp;

/**
 Imagine you’re working on a drawing application, and you need to create and manipulate various
 shapes. Each shape might have different attributes like color or size.
 Creating a new shape class for every variation becomes cumbersome.
 Also, dynamically adding or removing shapes during runtime can be challenging.
 */

public class Runner {

    public static void main(String[] args){

        Shape circle = new Circle(1.0, "red");
        Shape circleClone = circle.clone();
        circleClone.draw();

        Shape rectangle = new Rectangle(2.0, 1.0, "yellow");
        Shape rectangleClone = rectangle.clone();
        rectangleClone.draw();
    }
}
