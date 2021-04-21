package com.simone1040.designPattern.creational.AbstractFactory.model;

public class LinuxButton extends Button{
    @Override
    public TypeButton paint() {
        System.out.println("Linux Button painted");
        return TypeButton.Linux;
    }
}
