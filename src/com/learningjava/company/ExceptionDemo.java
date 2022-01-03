package com.company;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int i = 7;
            int j = 2;
            int k = i/j;
            System.out.println("output is " + k);
        } catch (Exception e){
            System.out.println("Error: ");
        }
        System.out.println("Bye");
    }
}
