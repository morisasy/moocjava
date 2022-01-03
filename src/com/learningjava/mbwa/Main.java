package com.mbwa;

public class Main {
    public static void main(String[] args) {
        Dog simba = new Dog("Simba", 5);
        simba.speak();

        simba.setAge(10);
        int x = simba.getAge();
        System.out.println(x);
    }
}
