package com.stackroute.generic.typeerasure.bounded;

class BoundedType {
    private Number t;

    public void add(Number t) {
        this.t = t;
    }

    public Number get() {
        return t;
    }
}

