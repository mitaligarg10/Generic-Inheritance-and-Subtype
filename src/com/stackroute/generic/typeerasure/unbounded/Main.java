package com.stackroute.generic.typeerasure.unbounded;

public class Main {
    public static void main(String[] args) {
        UnboundedType integerBox = new UnboundedType();
        UnboundedType stringBox = new UnboundedType();

        integerBox.add(1);
        stringBox.add("HelloWorld");

        System.out.println("Integer Value : " + integerBox.get());
        System.out.println("String Value : " + stringBox.get());
    }
}
