package com.simone1040.designPattern.structural.Composite;

import java.util.ArrayList;
import java.util.List;
//Composite
public class Carrello implements Product{
    private List<Product> products = new ArrayList<>();

    @Override
    public void print() {
        System.out.println("============ CARRELLO ==============");
        products.forEach(product -> product.print());
        System.out.println("====================================");
        System.out.println("=========== TOTAL PRICE ============");
        System.out.println(this.getPrezzo());
    }

    @Override
    public float getPrezzo() {
        return products.stream().map(e -> e.getPrezzo()).reduce(0f,Float::sum);
    }

    @Override
    public void add(Product p) {
        products.add(p);
    }

    @Override
    public void remove(Product p) {
        products.remove(p);
    }
}
