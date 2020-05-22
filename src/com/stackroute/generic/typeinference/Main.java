package com.stackroute.generic.typeinference;

public class Main {
    public static void main(String args[]) {
        TypeInference<String> typeInference = new TypeInference<>();
        typeInference.setName("Simon");
        System.out.println(typeInference.getName());
        String result = typeInference.genericMethod(new TypeInference<>());
        System.out.println(result);
    }
}
