package com.alexandermervar;

public class MyTriangle {

    private double base;
    private double height;

    public MyTriangle(double b, double h) {
        base = b;
        height = h;
    }

    public String toString() {
        return "Height: " + height + " Base: " + base;
    }

    public double getArea() {
        return (base * height)/2;
    }
}
