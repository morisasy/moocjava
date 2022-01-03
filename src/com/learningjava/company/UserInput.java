package com.company;
import java.util.Scanner;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;

// BufferedReader
// Scanner


public class UserInput{
    public static void main(String[] args)  {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
    }
}
