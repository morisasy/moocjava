package com.udacity;

public class CoffeeMachine {

    public static void main(String[] args) {
        int passcode = 555;
        String coffeeType;
        switch (passcode){
            case 555: coffeeType = "Expresso";
                break;
            case 312: coffeeType = "Vanilla latte";
                break;
            case 629: coffeeType = "Drip coffee";
                break;
            default: coffeeType = "Unknown";
                break;
        }
        System.out.println(coffeeType);
    }
}
