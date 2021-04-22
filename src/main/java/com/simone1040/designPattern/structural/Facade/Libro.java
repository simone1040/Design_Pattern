package com.simone1040.designPattern.structural.Facade;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Libro {
    private String titolo;
    private String autore;

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }
}
