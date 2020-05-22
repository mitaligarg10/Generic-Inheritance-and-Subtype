package com.stackroute.generic.typeerasure.bounded;

public class Main {
    public static void main(String[] args) {
        BoundedType integerBox = new BoundedType();
        BoundedType doubleBox = new BoundedType();

        integerBox.add(1);
        doubleBox.add(10.0);

        System.out.println("Integer Value: " + integerBox.get());
        System.out.println("Double Value: " + doubleBox.get());
    }
}
