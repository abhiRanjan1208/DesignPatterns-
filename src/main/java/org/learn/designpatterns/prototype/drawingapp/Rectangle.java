package org.learn.designpatterns.prototype.drawingapp;

public class Rectangle implements Shape{

    Double length;
    Double width;
    String color;

    public Rectangle(Double length, Double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this.length, this.width, this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle of length - " + this.length + " and width - " + width + ", of color - " + this.color + ".");
    }
}
