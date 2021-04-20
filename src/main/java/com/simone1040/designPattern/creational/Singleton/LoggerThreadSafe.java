package com.simone1040.designPattern.creational.Singleton;


import java.util.ArrayList;
import java.util.List;

public class LoggerThreadSafe {
    private static final LoggerThreadSafe istance = new LoggerThreadSafe();
    private List<String> list;

    private LoggerThreadSafe(){
        empty();
    }

    public static LoggerThreadSafe getInstance(){
        synchronized (LoggerThreadSafe.class){
            return istance;
        }
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
