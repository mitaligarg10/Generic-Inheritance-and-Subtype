package com.stackroute.generic.typeinference;

class TypeInference<X> {
    X name;

    public void setName(X name) {
        this.name = name;
    }

    public X getName() {
        return name;
    }

    public String genericMethod(TypeInference<String> x) {
        x.setName("Daniel");
        return x.name;
    }
}