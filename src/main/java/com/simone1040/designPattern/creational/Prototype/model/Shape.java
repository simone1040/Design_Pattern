package com.simone1040.designPattern.creational.Prototype.model;

import lombok.Data;

@Data
public abstract class Shape implements Cloneable{
    public enum ShapeType{
        Rectangle,
        Square
    }
    private Integer id;
    protected ShapeType type;

    abstract ShapeType draw();

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("{CloneNotSupportedException} Exception -->" + e.getMessage());
        }
        return clone;
    }
}
