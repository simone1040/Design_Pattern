package com.simone1040.designPattern.structural.Flyweight;

public class CounterTerrorist implements Player{
    private final String Task;
    private String weapon;

    public CounterTerrorist() {
        this.Task = "DIFFUSE BOMB";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terrorist with weapon "
                + weapon + "|" + " Task is " + Task);
    }
}
