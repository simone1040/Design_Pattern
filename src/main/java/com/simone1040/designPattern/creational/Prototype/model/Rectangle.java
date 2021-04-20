package com.simone1040.designPattern.creational.Prototype.model;

public class Rectangle extends Shape {
    public Rectangle(int id){
        type = ShapeType.Rectangle;
        this.setId(id);
    }

    @Override
    public ShapeType draw() {
        System.out.println("Rectangle::draw() ");
        return type;
    }
}
