package com.company;

public class LoopBreakDemo {
    public static void main(String[] args) {
        String[] names = {"Anna", "Ali", "Bob", "Mike"};
        for (String name : names) {
            if(name.equals("Bob")){
                break;
            }
            System.out.println(name);
        }
    }
}
