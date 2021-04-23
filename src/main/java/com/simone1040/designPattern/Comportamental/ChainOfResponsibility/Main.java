package com.simone1040.designPattern.Comportamental.ChainOfResponsibility;

public class Main {
    public static void main(String[] args){
        Manager manager = new Manager();
        Director director = new Director();
        manager.setSuccessor(director);
        manager.processRequest(new PurchaseRequest(200,"General"));
    }
}
