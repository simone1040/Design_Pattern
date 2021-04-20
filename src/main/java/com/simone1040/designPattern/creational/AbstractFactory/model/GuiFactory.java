package com.simone1040.designPattern.creational.AbstractFactory.model;

public abstract class GuiFactory {
    public enum TypeGui{
        LinuxGui,
        WindowsGui
    }

    public abstract Button createButton(TypeGui gui);
}
