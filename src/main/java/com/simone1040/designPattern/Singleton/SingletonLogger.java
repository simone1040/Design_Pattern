package com.simone1040.designPattern.Singleton;

import com.simone1040.model.Book;

import java.util.ArrayList;
import java.util.List;

public class SingletonLogger extends Book {
    private static final SingletonLogger istance = new SingletonLogger();
    private List<String> list;

    private SingletonLogger(){
        empty();
    }

    public static SingletonLogger getInstance(){
        return istance;
    }

    public void addRecord(String record){
        list.add(record);
    }

    public String dumpLast(){
        return list.size() > 0 ? list.get(list.size() - 1) : "";
    }

    public List<String> dumpAll(){
        return list;
    }

    private void empty(){
        this.list = new ArrayList<>();
    }
}
