package com.simone1040.designPattern.structural.Decorator;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public abstract class NotebookDecorator implements NotebookInterface{
    NotebookInterface notebookInterface;

    @Override
    public List<String> notes() {
        return notebookInterface.notes();
    }

    @Override
    public int count() {
        return notebookInterface.count();
    }

    @Override
    public void add(String note) {
        notebookInterface.add(note);
    }

    @Override
    public void clear() {
        notebookInterface.clear();
    }
}
