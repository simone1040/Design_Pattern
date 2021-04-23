package com.simone1040.designPattern.structural.Proxy;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

//RealSubject
@NoArgsConstructor
public class Book implements Volume{
    private int current = 0;
    private List<String> content = new ArrayList<>();

    @Override
    public String getText() {
        return content.get(current++);
    }

    @Override
    public void append(String s) {
        content.add(s);
    }
}