package com.simone1040.model;

import lombok.NonNull;

public abstract class Book {
    @NonNull
    protected int id;
    @NonNull
    protected String title;
    protected int page = 0;
    @NonNull
    protected String author;
}
