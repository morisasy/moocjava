package com.jifunzejava;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        System.out.println(list);
        list.addLast("C");
        System.out.println(list);
        list.addFirst("D");
        System.out.println(list);
        list.add(2, "E");
        System.out.println(list);
        list.remove("B");
        //list.removeFirst();
        //list.removeLast();


    }
}
