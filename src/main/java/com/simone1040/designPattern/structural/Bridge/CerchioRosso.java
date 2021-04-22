package com.simone1040.designPattern.structural.Bridge;

public class CerchioRosso implements DisegnaApi{
    @Override
    public DrawType disegnaCerchio(int raggio, int x, int y) {
        System.out.println("[CERCHIOROSSO]: Cerchio disegnato! ");
        System.out.println("[CERCHIOROSSO]: COLORE: ROSSO, RAGGIO: " + raggio + ", X: " + x + ", Y:" + y + "]");
        return DrawType.CerchioRosso;
    }
}
