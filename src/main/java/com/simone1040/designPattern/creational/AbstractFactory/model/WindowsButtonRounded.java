package com.simone1040.designPattern.creational.AbstractFactory.model;

public class WindowsButtonRounded extends Button{
    @Override
    public TypeButton paint() {
        System.out.println("Windows Button rounded painted");
        return TypeButton.WindowsRounded;
    }
}
