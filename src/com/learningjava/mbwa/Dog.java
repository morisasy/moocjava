package com.mbwa;

public class Dog {
    // protected means can only be used with this package
   protected String name;
   protected static int count = 0;
   public int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
        Dog.count ++;

    }

    public  void  speak(){
        System.out.println("I am " + this.name + " and Im " + this.age + " years old");
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
