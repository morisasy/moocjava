package com.company;

public class ReferenceDemo {

    public static void main(String[] args) {
        // Non primitive data types AKA reference types
        String name = new String("amigoscode");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(1));
        String code = new String("codes");
        System.out.println(name.contains(code));

    }
}
