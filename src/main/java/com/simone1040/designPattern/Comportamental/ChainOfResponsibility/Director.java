package com.simone1040.designPattern.Comportamental.ChainOfResponsibility;

public class Director extends PurchasePower{

    protected double getAllowable(){
        return BASE*20;
    }

    protected String getRole(){
        return "Director";
    }
}
