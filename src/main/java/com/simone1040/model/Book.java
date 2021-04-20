package com.simone1040.model;

import lombok.NonNull;

public abstract class Book {
    public enum BookType{
        StoryBook,
        YellowBook
    }

    @NonNull
    protected int id;
    @NonNull
    protected String title;
    protected int page = 0;
    @NonNull
    protected String author;
    protected String genre;

    public BookType getGenre(){
        return null;
    }
}
