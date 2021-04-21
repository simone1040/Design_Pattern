package com.simone1040.designPattern.creational.AbstractFactory.model;


public abstract class Button {
    public enum TypeButton{
        Linux,
        Windows,
        LinuxRounded,
        WindowsRounded
    }

    public abstract TypeButton paint();
}
