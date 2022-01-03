package com.company;

class Emp{
    int eid;
    int salary;
     static String ceo;
    // static keyword the object will be the same to all object
    // you do not need to create object when you call static method.
    // static variables are the same for all the objects
    // non-static variables are different for all the objects.
    // cannot use non-static variable in static block
    static
    {
        // will be excuted when you load a class
        // class will load only once
        ceo = "Larry";
        System.out.println("in static");
    }

    public Emp(){
        // when create an object
        eid = 1;
        salary = 3000;
        System.out.println(" in constructor");
    }

    public void show(){
        System.out.println(eid + " : " + salary + " : "+ ceo);
    }


}

public class StaticDemo {
    public static void main(String[] args) {
        // 1000 auto-generated method stub
        Emp navin = new Emp();
        navin.eid = 8;
        navin.salary = 4000;
        //navin.ceo = "Mukeshi";
        Emp rahaul = new Emp();
        rahaul.eid = 9;
        rahaul.salary = 5000;
        //rahaul.ceo = "Mahesh";
        navin.show();
        rahaul.show();

    }
}
