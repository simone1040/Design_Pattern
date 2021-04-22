package com.simone1040.designPattern.structural.Facade;

import java.util.Arrays;
import java.util.List;

public class Socio {
    private final List< String > listaSoci = Arrays.asList("Alan", "Dan");
    public boolean verificaId(String nome) {
        return listaSoci.contains(nome);
    }
}
