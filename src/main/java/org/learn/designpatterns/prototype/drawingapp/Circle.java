package org.learn.designpatterns.prototype.drawingapp;

public class Circle implements Shape{

    Double radius;
    String color;

    public Circle(Double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Circle(this.radius, this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle of radius - " + this.radius + " and color - " + this.color + ".");
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
