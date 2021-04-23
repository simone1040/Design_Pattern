package com.simone1040.designPattern.Comportamental.ChainOfResponsibility;

public class Manager extends PurchasePower {
    protected double getAllowable(){
        return BASE*10;
    }

    protected String getRole(){
        return "Manager";
    }
}
