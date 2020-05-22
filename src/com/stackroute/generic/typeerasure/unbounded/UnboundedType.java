package com.stackroute.generic.typeerasure.unbounded;

public class UnboundedType {
    private Object t;

    public void add(Object t) {
        this.t = t;
    }

    public Object get() {
        return t;
    }
}

