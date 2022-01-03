package com.udacity;

public class TrafficLight {

    public static void main(String[] args) {
        boolean isLightGreen = false;
        boolean isLightYellow = true;
        if (isLightGreen) {
            // traffic light is green
            System.out.println("Drive!");
        }else if (isLightYellow){
            System.out.println("Slowdown!");
         }else {
            // light is not green
            System.out.println("Stop!");
        }
    }
}
