package com.simone1040.designPattern.structural.Facade;

public class FacadeClient {
    private static String nome = "Alan";
    private static Registro r = new Registro();

    public static void main(String[] args){
        if(r.prestaLibro(nome,"titolo2")){
            System.out.println("Libro prestato");
        }
        r.leggiLibro("titolo");
    }
}
