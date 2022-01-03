package com.company;

import java.util.ArrayList;
import java.util.Collection;


public class CollectionDemo {
    public static void main(String[] args) {
        //Collection values = new ArrayList();
        ArrayList<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(5);
        values.add(9);

        //Collection.sort(values);
        //Collection.reverse(values);

        for(Integer o : values){
            System.out.println(o);
        }
    }
}
