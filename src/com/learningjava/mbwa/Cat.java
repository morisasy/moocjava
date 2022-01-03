package com.mbwa;

public class Cat extends Dog{
    private  int food; // private variable only used within the class
    public Cat(String name, int age, int food){
        super(name, age);
        this.food = food;
    }

    public Cat(String name, int age){
        super(name, age);
        this.food = 0;

    }

    public  void  speak(){
        System.out.println("Meow my name  " + this.name + " and I get fed " + this.food + " delicious food");
    }

    public void eact(int x){
        this.food -=x;
    }


}
