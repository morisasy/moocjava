package com.learningjava.udacity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChooseMonth {

    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a month:");
            int month = scanner.nextInt();
            System.out.print(months[month]);
        } catch (IndexOutOfBoundsException exception) {
            System.out.print("Index is out of bounds");
        } catch (InputMismatchException exception) {
            System.out.print("Input mismatch");
        }

    }
}
