package com.simone1040.designPattern.structural.Decorator.concreteDecorator;

import com.simone1040.designPattern.structural.Decorator.NotebookDecorator;
import com.simone1040.designPattern.structural.Decorator.NotebookInterface;

import java.util.List;

public class NotebookWithLoggin extends NotebookDecorator {
    public NotebookWithLoggin(NotebookInterface notebookInterface) {
        super(notebookInterface);
        System.out.println("istanzio NotebookWithLoggin");
    }

    @Override
    public List<String> notes() {
        System.out.println("Getting all notes");
        return super.notes();
    }

    @Override
    public int count() {
        System.out.println("count NotebookWithLoggin");
        System.out.println("Count all notes");
        return super.count();
    }

    @Override
    public void add(String note) {
        System.out.println("add notes");
        super.add(note);
    }

    @Override
    public void clear() {
        System.out.println("Clear all notes");
        super.clear();
    }
}
