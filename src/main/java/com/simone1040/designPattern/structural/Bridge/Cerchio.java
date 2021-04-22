package com.simone1040.designPattern.structural.Bridge;

public class Cerchio extends Figura{
    private int x, y, raggio;

    public Cerchio(int x, int y ,int radius, DisegnaApi disegnaApi) {
        super(disegnaApi);
        this.x = x;
        this.y = y;
        this.raggio = radius;
    }

    @Override
    public DisegnaApi.DrawType disegna() {
        return disegnaApi.disegnaCerchio(raggio,x,y);
    }
}
