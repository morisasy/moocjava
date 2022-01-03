package com.company;



class  Casio {

    // method overload ,
    // when you have same method but different parameter types or signature.

    public Casio(){

    }

    public Casio(int i){

    }
    public Casio(int i, int j){

    }
    public  void add(int i, int j){
        System.out.println(i + j);
    }

    public  void add(int i, int j, int k){
        System.out.println(i + j + k);
    }
    public  void add(double i, double j){
        System.out.println(i + j);
    }
}

public class MethodOverLoadingDemo {

    public static void main(String[] args){
        Casio obj = new Casio();
        obj.add(5, 2);
        obj.add(4,3,5);
    }
}
