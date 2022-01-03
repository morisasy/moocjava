package com.company;


abstract class Human {
    // you can not create object from abstract class
    // you can create abstract method to non-abstract class
    abstract public void eat();

    public void walk(){

    }
}
class  Man extends Human{

    public void eat() {

    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Human obj = new Man();
    }
}
