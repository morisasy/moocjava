package com.freecodecamp;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> t = new HashSet<>();
        t.add(5);
        t.add(7);
        t.add(5);
        t.add(9);
        t.add(8);
        // t.clear()
        // t.remove(8)
        // t.size()
       // t.contains(5);
        System.out.println(t);

    }
}
