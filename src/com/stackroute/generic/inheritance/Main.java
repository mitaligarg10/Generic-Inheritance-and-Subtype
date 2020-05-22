package com.stackroute.generic.inheritance;

public class Main {
    public static void main(String[] args) {
        SubClass<String> subClass = new SubClass<>("HelloWorld!!");

        System.out.println(subClass.t);
    }
}