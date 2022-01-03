package com.udacity;

public class CalculateAverageDemo {
    public static void main(String[] args) {
        average();

    }

    static void average(){
        double maths=97.5;
        double english=98;
        double science=83.5;
        double drama=75;
        double sum=maths+english+science+drama;
        double average=sum/4;
        System.out.println(average);

    }

}
