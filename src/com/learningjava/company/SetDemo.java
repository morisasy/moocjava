package com.company;
import java.util.HashSet;
import java.util.Set;


public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> values = new HashSet<>();
        values.add(5);
        values.add(7);
        values.add(9);
        values.add(14);

        for(int i : values){
            System.out.println(i);
        }

    }
}
