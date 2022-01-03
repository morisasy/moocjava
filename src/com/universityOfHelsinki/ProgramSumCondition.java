package com.universityOfHelsinki;
import java.util.Scanner;

public class ProgramSumCondition {
    // Bringing Scanner to the program's use



        public static void main(String[] main) {
            // Creating the scanner
            Scanner reader = new Scanner(System.in);

            // Declaring the variables and assigning user input to them
            System.out.println("Enter an integer: ");
            int first = Integer.valueOf(reader.nextLine());
            System.out.println("Enter a second integer:");
            int second = Integer.valueOf(reader.nextLine());

            // Identifying the operation and declaring variable for the result
            int sum = first + second;

            // Doing something with the result. In this case
            // the result is used in the conditional operations.

            if (sum > 100) { // if the sum is over 100
                System.out.println("too much");
            } else if (sum < 0) { // if the sum is less than 0
                System.out.println("too little");
            } else { // otherwise
                System.out.println("ok");
            }
        }

}


