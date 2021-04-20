package com.simone1040.designPattern.creational.Prototype;

import com.simone1040.designPattern.creational.Prototype.model.Rectangle;
import com.simone1040.designPattern.creational.Prototype.model.Shape;
import com.simone1040.designPattern.creational.Prototype.model.Square;

import java.util.Hashtable;

public class CloneFactory {
    private static final Hashtable<Shape.ShapeType, Shape> shapeMap  = new Hashtable<>(){
        {
            put(Shape.ShapeType.Rectangle, new Rectangle(1));
            put(Shape.ShapeType.Square, new Square(2));
        }
    };

    public static Shape getShape(Shape.ShapeType type){
        return (Shape) shapeMap.get(type).clone();
    }
}
