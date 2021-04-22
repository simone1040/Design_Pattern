package com.simone1040.designPattern.creational.AbstractFactory;

public class GuiProducer {
    public static GuiFactory getGuiFactory(boolean rounded){
        return rounded ? new AbstractFactoryRounded() : new AbstractFactory();
    }
}
