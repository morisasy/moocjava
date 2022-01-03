package com.company;


class Calc {

    int num1;
    int num2;
    int result;



    public Calc(){
        // constructor should have same name as class
        // constructor does not return value
        // whenever you create an object. Constructor is created automatically.
        // you can have more than one constructor in the same class
        // if you don't create constructor. system will run default constructor.
        // every java class has default constructor.
       num1 = 5;
        num2 = 5;
        System.out.println("in constructor");

    }
    public Calc(int num1, int num2){

        this.num1 = num1; // current object
        this.num2 = num2;
    }

    public Calc(int n){
        // second constructor has a parameter.
        num1 = n;
        num2 = n;
    }

    public  void perform(){
        result = num1 + num2;
    }
    public Calc(double d, int n){
        // second constructor has a parameter.
        // multiple constructor with different signature.
        num1 = (int) d;
        num2 = n;
    }

}



public class ObjectDemo {

    public static void main(String[] args){
        Calc obj = new Calc(); // knows something and does something. constructor
        obj.num1 = 3;
        obj.num2 = 5;
        obj.perform();

        System.out.println(obj.result);


    }
}
