package com.simone1040.designPattern.creational.AbstractFactory.model;

public class LinuxButtonRounded extends Button{
    @Override
    public TypeButton paint() {
        System.out.println("Linux Button rounded painted");
        return TypeButton.LinuxRounded;
    }
}
