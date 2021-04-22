package com.simone1040.designPattern.structural.Facade;


import java.util.*;

public class Prestiti {
    Map<String, List<Libro>> tabPrestati = new HashMap<>();

    public void registra(String nome,Libro libro){
        if(tabPrestati.containsKey(nome)){
            tabPrestati.get(nome).add(libro);
        }
        else{
            tabPrestati.put(nome,new ArrayList<>(Arrays.asList(libro)));
        }
    }

    public String trovaPersona(Libro libro) {
        System.out.println("Prestiti: trova persona");
        if(libro != null) {
            for (String s : tabPrestati.keySet())
                if (tabPrestati.get(s).contains(libro)) return s;
        }
        return "Nessuno";
    }
}
