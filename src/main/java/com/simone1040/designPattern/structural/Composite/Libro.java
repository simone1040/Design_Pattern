package com.simone1040.designPattern.structural.Composite;

//Leaf
public class Libro implements Product{
    private String titolo;
    private float prezzo;


    public Libro(String titol, float prez) {
        titolo = titol;
        prezzo = prez;
    }

    @Override
    public void print() {
        System.out.println("Libro: " + titolo + "\tPrezzo: " + getPrezzo());
    }

    @Override
    public float getPrezzo() {
        return prezzo;
    }

    @Override
    public void add(Product p) {}

    @Override
    public void remove(Product p) {}
}
