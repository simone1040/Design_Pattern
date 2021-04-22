package com.simone1040.designPattern.structural.Bridge;

public interface DisegnaApi {
    enum DrawType{
        CerchioRosso,
        CerchioVerde
    }

    DrawType disegnaCerchio(int raggio,int x, int y);
}
