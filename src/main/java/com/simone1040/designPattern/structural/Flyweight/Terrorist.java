package com.simone1040.designPattern.structural.Flyweight;

public class Terrorist implements Player{
    private final String Task;
    // Extrinsic Attribute
    private String weapon;

    public Terrorist() {
        Task = "PLANT THE BOMB";
    }

    public Terrorist(String task) {
        Task = task;
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon "
                + weapon + "|" + " Task is " + Task);
    }
}
