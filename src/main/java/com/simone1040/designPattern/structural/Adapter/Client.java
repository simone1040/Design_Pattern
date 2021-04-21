package com.simone1040.designPattern.structural.Adapter;

import com.simone1040.designPattern.structural.Adapter.ObjectSolution.GeometricShapeAdapter;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args){
        List<Shape> list = new ArrayList<>();
        list.add(new Square());
        list.add(new Triangle());
        list.add(new GeometricShapeAdapter(new Rectangle()));
    }
}
