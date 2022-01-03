package com.universityOfHelsinki;
import java.util.Scanner;
public class ProgramUserInput {
    // Making the scanner available in the program

        public static void main(String[] main) {
            // Creating the scanner
            Scanner reader = new Scanner(System.in);

            // Examples of reading different types of user input
            System.out.println("Enter a words: ");
            String text = reader.nextLine();
            System.out.println("Enter a number: ");
            int number = Integer.valueOf(reader.nextLine());
            System.out.println("Enter a number with max two decimal place:");
            double numberWithDecimals = Double.valueOf(reader.nextLine());
            System.out.println("Enter a true or false: ");
            boolean trueOrFalse = Boolean.valueOf(reader.nextLine());

        }

}
