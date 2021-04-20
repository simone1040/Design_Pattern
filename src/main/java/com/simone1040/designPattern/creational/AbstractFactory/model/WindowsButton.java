package com.simone1040.designPattern.creational.AbstractFactory.model;

public class WindowsButton extends Button{
    @Override
    public void paint() {
        System.out.println("Windows Button painted");
    }
}
