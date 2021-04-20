package com.simone1040.designPattern.Prototype;

import com.simone1040.designPattern.Prototype.model.Rectangle;
import com.simone1040.designPattern.Prototype.model.Shape;
import com.simone1040.designPattern.Prototype.model.Square;

import java.util.Hashtable;

public class CloneFactory {
    private static Hashtable<Shape.ShapeType, Shape> shapeMap  = new Hashtable<Shape.ShapeType, Shape>(){
        {
            put(Shape.ShapeType.Rectangle, new Rectangle(1));
            put(Shape.ShapeType.Square, new Square(2));
        }
    };

    public static Shape getShape(Shape.ShapeType type){
        return (Shape) shapeMap.get(type).clone();
    }
}
