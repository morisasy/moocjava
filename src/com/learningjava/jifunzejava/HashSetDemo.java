package com.jifunzejava;

import  java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("C");
        System.out.println();
        System.out.println(hashSet);
        System.out.println("List contains C or not? " + hashSet.contains("C"));

        hashSet.remove("C");
        System.out.println("List after removing AL" + hashSet);

        for(String item : hashSet){
            System.out.println(item);
        }

    }
}
