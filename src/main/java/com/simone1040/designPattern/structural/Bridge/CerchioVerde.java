package com.simone1040.designPattern.structural.Bridge;

public class CerchioVerde implements DisegnaApi{
    @Override
    public DrawType disegnaCerchio(int raggio, int x, int y) {
        System.out.println("[CERCHIOVERDE]: Cerchio disegnato! ");
        System.out.println("[CERCHIOVERDE]: COLORE: ROSSO, RAGGIO: " + raggio + ", X: " + x + ", Y:" + y + "]");
        return DrawType.CerchioVerde;
    }
}
