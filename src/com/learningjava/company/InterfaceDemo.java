package com.company;

// abstract class => define and declare
// interface => declare 1.7
// 1.8 can define methods in interface
// use default keyword to define method
@FunctionalInterface
interface Demo{
    void abc();

    default  void show(){
        System.out.println("in show");
    }
}
 class DemoImp implements Demo{
    public void abc(){
        System.out.println("in abc");
    }
 }
public class InterfaceDemo {
    public static void main(String[] args) {
        Demo obj = new DemoImp();
        obj.abc();
        obj.show();
    }
}
