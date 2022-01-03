package com.learningjava.student;

public class Student {
    public String sName;
    public int sMark;

    //defaults constructor of the class
    public Student(){
         // this call the constructor with String param
        this("Rajabu");
    }
    public  Student(String name){
        // call the constructor with (String , int) param
        this(name, 70);
    }

    public  Student(String name, int mark){
        this.sName = name;
        this.sMark = mark;
    }


    public boolean equals(Student other){
        if(this.sName == other.sName){
            return true;
        }
        else {
            return false;
        }
    }

    void display(){
        System.out.println("Student Name: " + sName);
        System.out.println("Student Marks: " + sMark);
    }
}
