package com.company;

/**
 * inner class
 * member class
 * Static class
 * anonymous class
 *
 *
 */

class Outer{
    int a;

    public void show(){

    }

    class Inner {
        // Outer$Inner
        public void display(){
            System.out.println("In dispaly");
        }
    }
}

public class InnerDemo {
    // variable, method

    public static void main(String[] args) {
         Outer obj = new Outer();
         obj.show();
         Outer.Inner obje1 = obj.new Inner();
    }
}
