package com.simone1040.designPattern.structural.Decorator;

import com.simone1040.designPattern.structural.Decorator.concreteDecorator.FixedLenghtNotebook;
import com.simone1040.designPattern.structural.Decorator.concreteDecorator.NotebookWithLoggin;
import com.simone1040.designPattern.structural.Decorator.concreteDecorator.ThreadSafeNotebook;

public class Main {
    public static void main(String[] args){
        NotebookInterface book = new NotebookWithLoggin(
                new FixedLenghtNotebook(
                        new ThreadSafeNotebook(
                                new Notebook()
                        ),2
                )
        );
        book.add("ciao");
        book.add("ciao1");
        book.add("ciao2");
        book.count();
        for (String s: book.notes()) {
            System.out.println(s);
        }
    }
}
