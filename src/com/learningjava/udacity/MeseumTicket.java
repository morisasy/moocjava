package com.udacity;

public class MeseumTicket {
    public static void main(String[] args) {
        int ticketPrice = 10;
        int age = 15;
        boolean isStudent = true;
        if (age<= 15){
            ticketPrice = 15;
        }else if (age > 60){
            ticketPrice = 5;
        }else if (isStudent ){
            ticketPrice = 5;
        }
    }
}
