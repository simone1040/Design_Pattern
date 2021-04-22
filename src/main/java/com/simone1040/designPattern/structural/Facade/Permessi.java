package com.simone1040.designPattern.structural.Facade;

import java.util.Arrays;
import java.util.List;

public class Permessi {
    // autorizzati alla lettura
    private final List < String > lettura = Arrays.asList("Alan", "Brian", "Claire", "Dan");
    // autorizzati ai prestiti
    private final List< String > prestito = Arrays.asList("Alan", "Brian");

    public boolean checkLettura(String nome){
        return lettura.contains(nome);
    }

    public boolean checkPrestito(String nome){
        return prestito.contains(nome);
    }
}
