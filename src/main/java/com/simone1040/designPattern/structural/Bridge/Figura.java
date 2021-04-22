package com.simone1040.designPattern.structural.Bridge;

public abstract class Figura {
    protected DisegnaApi disegnaApi;

    protected Figura(DisegnaApi disegnaApi) {
        this.disegnaApi = disegnaApi;
    }

    public abstract DisegnaApi.DrawType disegna();
}
