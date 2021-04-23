package com.simone1040.designPattern.structural.Proxy;

import java.util.ArrayList;
import java.util.List;

public class AuthzRules {
    private List<String> readpermits = new ArrayList<String>();
    private static AuthzRules ar = new AuthzRules();

    private AuthzRules() {
        fillRules();
    }

    public static AuthzRules getAuthRules() {
        return ar;
    }
    public boolean canRead(Object o) {
        return readpermits.contains(o.getClass().getName());
    }

    public boolean canWrite(Object o) {
        return readpermits.contains(o.getClass().getName());
    }

    public void fillRules() {
// select rules to be checked, e.g. according to user id, etc.
        readpermits.add("Book"); // in this example read permits are given to anyone
    }
}
