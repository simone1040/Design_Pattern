package com.simone1040.designPattern.structural.Decorator;

import java.util.List;

//Component
public interface NotebookInterface {
    List<String> notes();
    int count();
    void add(String note);
    void clear();
}
