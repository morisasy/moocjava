package com.company;

// Encapsulation -> concept of binding data with methods is called encapsulation.
class Student {
    private int rollno;
    private String name;

    // Getters and Setters

    public void setRollno(int r){
        this.rollno = r;
    }
    public int getRollno(){
        return rollno;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollno(2);
        s1.setName("Adile");
        System.out.println("Roll no: " + s1.getRollno());
        System.out.println("Get the name: " + s1.getName());

    }
}
