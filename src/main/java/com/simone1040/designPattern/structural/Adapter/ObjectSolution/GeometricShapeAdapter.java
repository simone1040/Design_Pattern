package com.simone1040.designPattern.structural.Adapter.ObjectSolution;

import com.simone1040.designPattern.structural.Adapter.GeometricShape;
import com.simone1040.designPattern.structural.Adapter.Shape;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GeometricShapeAdapter implements Shape {
    private GeometricShape adaptee;

    @Override
    public double perimeter() {
        return adaptee.perimeter();
    }

    @Override
    public double area() {
        return adaptee.area();
    }
}
