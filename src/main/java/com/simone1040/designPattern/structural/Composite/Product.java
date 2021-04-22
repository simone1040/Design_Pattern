package com.simone1040.designPattern.structural.Composite;

//Component
public interface Product {
    void print();
    float getPrezzo();
    void add(Product p);
    void remove(Product p);
}
