package com.company;
import processing.core.PApplet;

public class Circle extends Shape  {
    private double radius;
    private ShapeCreator shape = new ShapeCreator();

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI*Math.pow(radius,2);
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public float getPositionX() {
        return (float)getPosition().getX();
    }

    public float getPositionY() {
        return (float)getPosition().getY();
    }

    public void draw(PApplet p) {
        p.ellipse(getPositionX(), getPositionY(),(float)this.radius,(float)this.radius);
    }
}
