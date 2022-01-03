package com.company;
import java.time.LocalDate;
import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String username = sc.nextLine();
        System.out.println("Hello " + username);
        System.out.println("How old are you?");
        int age = sc.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("Your were born in " + year);
        if (age < 18){
            System.out.println(" and you are not an adult");
        }else {
            System.out.println(" You are an adult :)");
        }

    }
}
