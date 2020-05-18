package com.company;


import processing.core.PApplet;

public abstract class Shape implements Comparable<Shape> {
    private Point position;
    private static int numShapes;
    private int id;

    public Shape(Point position){
        this.position=position;
        ++numShapes;
        setId(numShapes);
    }

    public Point getPosition() {
        return position;
    }
    public void setPosition(Point position) {
        this.position = position;
    }
    public static int getNumShapes(){
        return numShapes;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    abstract public double computeArea();
    abstract public double getPerimeter();
    abstract public void draw(PApplet p);

    public String toString(){
        return String.format("Shape type: %s, ID: %d, Area: %f, Perimeter: %f", getClass().getName(),id, computeArea(),getPerimeter());
    }

    @Override
    public int compareTo(Shape o) {
        int x = 0;
        if (this.computeArea() == o.computeArea()) {
            if (this.getPerimeter() < o.getPerimeter()) {
                x = 1;
            } else if (this.getPerimeter() > o.getPerimeter()) {
                x = -1;
            } else {
                x = 0;
            }
        } else if (this.computeArea() > o.computeArea()) {
            x = -1;
        } else {
            x = 1;
        }
        return x;
    }
}
