package com.udacity;

public class Grade2DAverage {
    public static void main(String[] args) {
        int grades;
    }

    public static double gradeAverage(int [][] grades){
        int subjects = grades.length;
        int total = 0;
        for(int i=0; i <4; i++){
            total += grades[i][2];
        }
        double average = total / 4.0;
        return average;
    }
}
