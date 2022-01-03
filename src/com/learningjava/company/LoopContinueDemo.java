package com.company;

public class LoopContinueDemo {
    public static void main(String[] args) {
        String[] names = {"Anna", "Ali", "Bob", "Mike"};
        for (String name : names) {
            if(name.equals("A")){
                continue;
            }
            System.out.println(name);
        }
    }
}
