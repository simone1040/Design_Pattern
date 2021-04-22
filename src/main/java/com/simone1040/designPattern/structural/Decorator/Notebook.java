package com.simone1040.designPattern.structural.Decorator;

import java.util.ArrayList;
import java.util.List;

//ConcreteComponent
public class Notebook implements NotebookInterface{
    List<String> notes = new ArrayList<>();

    @Override
    public List<String> notes() {
        return notes;
    }

    @Override
    public int count() {
        return notes.size();
    }

    @Override
    public void add(String note) {
        notes.add(note);
    }

    @Override
    public void clear() {
        notes.clear();
    }
}
