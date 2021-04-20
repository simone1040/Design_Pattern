package com.simone1040.designPattern.FactoryMethod.model;

import com.simone1040.model.Book;

public class StoryBook extends Book {

    public StoryBook() {
        super();
        this.genre = "Story";
    }

    @Override
    public BookType getGenre() {
        System.out.println("Genre of Book is:" + this.genre);
        return BookType.StoryBook;
    }
}
