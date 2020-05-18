package com.company;

import processing.core.PApplet;

public class Rectangle extends Shape {
    private double length, height;

    public Rectangle(Point upperLeft, double length, double height) {
        super(upperLeft);
        this.length = length;
        this.height = height;
    }

    public double computeArea() { return  length*height; }
    public double getPerimeter() {return 2*length + 2*height;}

    public float getPositionX() {
        return (float)getPosition().getX();
    }

    public float getPositionY() {
        return (float)getPosition().getY();
    }

    public void draw(PApplet p) {
        p.rect(getPositionX(), getPositionY(),(float)this.length,(float)this.height);
    }
}
