package com.simone1040.designPattern.structural.Proxy;

public class Protection implements Volume{
    private Volume b;
    private AuthzRules ar;

    public Protection(){
        ar = AuthzRules.getAuthRules();
        b = new Book();
    }

    @Override
    public String getText() {
        if(ar.canRead(b)) return b.getText();
        return null;
    }

    @Override
    public void append(String s) {
        if(ar.canWrite(b)) b.append(s);
    }
}
