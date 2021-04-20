package com.simone1040.designPattern.Prototype.model;

public class Square extends Shape{
    public Square(int id){
        type = ShapeType.Square;
        this.setId(id);
    }

    @Override
    public ShapeType draw() {
        System.out.println("Square::draw()");
        return type;
    }
}
