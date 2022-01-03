package com.company;

class A {
    public A(){
        System.out.println(" in A");

    }

}

class B extends A {
    public B(){
        System.out.println("In B");

    }

}

public class SuperDemo {

    public static void main(String[] args) {
        B obj1 = new B();


    }
}
