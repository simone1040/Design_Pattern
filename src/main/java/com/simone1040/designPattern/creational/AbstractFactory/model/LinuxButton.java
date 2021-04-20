package com.simone1040.designPattern.creational.AbstractFactory.model;

public class LinuxButton extends Button{
    @Override
    public void paint() {
        System.out.println("Linux Button painted");
    }
}
