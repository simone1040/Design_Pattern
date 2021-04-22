package com.simone1040.designPattern.structural.Decorator.concreteDecorator;

import com.simone1040.designPattern.structural.Decorator.NotebookDecorator;
import com.simone1040.designPattern.structural.Decorator.NotebookInterface;

import java.util.ArrayList;
import java.util.List;

public class FixedLenghtNotebook extends NotebookDecorator {
    private int size = 4;

    public FixedLenghtNotebook(NotebookInterface notebookInterface) {
        super(notebookInterface);
        System.out.println("istanzio FixedLenghtNotebook");
    }

    public FixedLenghtNotebook(NotebookInterface notebook, int size ) {
        super(notebook);
        System.out.println("istanzio FixedLenghtNotebook");
        this.size = size;
        resize();
    }

    @Override
    public void add(String sentence){
        if(super.count() < size){
            super.add(sentence);
        }
    }

    @Override
    public List<String> notes() {
        return super.notes();
    }

    @Override
    public int count() {
        System.out.println("count FixedLenghtNotebook");
        return super.count();
    }

    @Override
    public void clear() {
        super.clear();
    }

    // Rezide the original notebook
    private void resize() {
        if ( count() > size ) {
            List<String> notes = new ArrayList<>();
            notes.addAll( super.notes().subList(0, size) );
            super.clear();
            super.notes().addAll( notes );
        }
    }
}
