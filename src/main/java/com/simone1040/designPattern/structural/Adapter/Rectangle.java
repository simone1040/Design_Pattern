package com.simone1040.designPattern.structural.Adapter;

public class Rectangle implements GeometricShape{
    private double side1;
    private double side2;

    @Override
    public double perimeter() {
        return (side1 + side2) * 2 ;
    }

    @Override
    public double area() {
        return side1 * side2;
    }
}
