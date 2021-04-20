package com.simone1040.designPattern.creational.AbstractFactory;

import com.simone1040.designPattern.creational.AbstractFactory.model.GuiFactory;

public class GuiProducer {
    public static GuiFactory getGuiFactory(boolean rounded){
        return rounded ? new AbstractFactoryRounded() : new AbstractFactory();
    }
}
