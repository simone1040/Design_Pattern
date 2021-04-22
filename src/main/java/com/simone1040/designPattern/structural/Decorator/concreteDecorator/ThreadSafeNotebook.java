package com.simone1040.designPattern.structural.Decorator.concreteDecorator;

import com.simone1040.designPattern.structural.Decorator.NotebookDecorator;
import com.simone1040.designPattern.structural.Decorator.NotebookInterface;

import java.util.List;

public class ThreadSafeNotebook extends NotebookDecorator {
    public ThreadSafeNotebook(NotebookInterface notebookInterface) {
        super(notebookInterface);
        System.out.println("istanzio ThreadSafeNotebook");
    }

    @Override
    public synchronized List<String> notes() {
        return super.notes();
    }

    @Override
    public synchronized  int count() {
        System.out.println("count ThreadSafeNotebook");
        return super.count();
    }

    @Override
    public synchronized  void add(String note) {
        super.add(note);
    }

    @Override
    public synchronized  void clear() {
        super.clear();
    }
}
