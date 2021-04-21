package com.simone1040.designPattern.structural.Adapter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
//Quadrato
@NoArgsConstructor
@AllArgsConstructor
public class Square implements Shape{
    private double side = 1.0;

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
