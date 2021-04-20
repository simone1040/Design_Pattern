package com.simone1040.designPattern.FactoryMethod.model;

import com.simone1040.model.Book;

import java.util.Optional;

public class BookFactory {

    public static Optional<Book> getBook(Book.BookType type){
        Optional<Book> typeBook = Optional.empty();
        switch (type){
            case StoryBook:
                typeBook = Optional.of(new StoryBook());
                break;
            case YellowBook:
                typeBook = Optional.of(new YellowBook());
                break;
        }
        return typeBook;
    }
}
