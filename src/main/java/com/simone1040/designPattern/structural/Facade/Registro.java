package com.simone1040.designPattern.structural.Facade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Facade
public class Registro {
    private final Permessi perm = new Permessi();
    private final Socio so = new Socio();
    private static Prestiti prt = new Prestiti();
    List<Libro> libreria = new ArrayList<>(
            Arrays.asList(new Libro("Titolo","Simone"),new Libro("Titolo2","Lorenzo"))
    );

    public boolean prestaLibro(String nomeSocio, String libro){
        if(so.verificaId(nomeSocio) && perm.checkPrestito(nomeSocio)){
            prt.registra(nomeSocio,libreria.stream().filter(l -> l.getTitolo().equals(libro)).findFirst().orElse(null));
            return true;
        }
        return false;
    }

    public void leggiLibro(String libro){
        final String nomePers = prt.trovaPersona(libreria.stream().filter(l -> l.getTitolo().equals(libro)).findFirst().orElse(null));
        System.out.println("Registro: persona che ha in prestito il libro " + nomePers);
    }
}
