package com.simone1040.designPattern.BuilderPattern.simple;

import com.simone1040.model.Book;

public class BuilderSimpleBook extends Book {

    private BuilderSimpleBook(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPage() {
        return page;
    }

    public String getAuthor() {
        return author;
    }

    public static class Builder {
        private int id;
        private String title;
        private int page;
        private String author;

        public Builder(int id){
            this.id = id;
            title = "";
            page = 0;
            author = "";
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setPage(int page) {
            this.page = page;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public BuilderSimpleBook build(){
            if(!title.equals("") && !author.equals("")){
                BuilderSimpleBook ret = new BuilderSimpleBook(id);
                ret.title = title;
                ret.page = page;
                ret.author = author;
                return ret;
            }
            throw new IllegalArgumentException("Title or Author not setted");
        }
    }
}
