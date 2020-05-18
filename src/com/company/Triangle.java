package com.company;

public class Triangle extends Shape {
    double height, base, leftSide, rightSide;

    public Triangle(Point position, double height, double base, double leftSide, double rightSide) {
        super(position);
        this.height = height;
        this.base = base;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    public double computeArea(){
        return (base*height)/2;
    }
    public double getPerimeter() {
        return base + leftSide + rightSide;
    }
    public void draw() {}
}
