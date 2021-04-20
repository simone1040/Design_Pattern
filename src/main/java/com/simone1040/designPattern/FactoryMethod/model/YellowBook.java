package com.simone1040.designPattern.FactoryMethod.model;

import com.simone1040.model.Book;

public class YellowBook extends Book {
    public YellowBook() {
        super();
        this.genre = "Yellow Book";
    }

    @Override
    public BookType getGenre() {
        System.out.println("Genre of Book is: " + this.genre);
        return BookType.YellowBook;
    }
}
