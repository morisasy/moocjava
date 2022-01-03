package com.company;
import java.util.Locale;
import java.util.Scanner;
//import java.util.*;

/**
 * @author  Jifunze  na Risasi
 */

public class Main {

    public static void main(String[] args) {
        // this is the first java program
        /*
         multiline comments
        * */
        System.out.println("Jambo Rafiki");
        // variable declaration

        double numberfloat =  2.58;

        /*
        String name = "Ali";
        boolean isStudent = true;
        char grade = 'A';

         */

        add();
        div();
        calculations();
        grade();
        marks();
        inputData();
        repeatation();
        checkBalance();
        salio();



    }

    public static void add(){
        // x++; ++x; x+=1
        int x = 2;
        int y= 5;
        int z = x + y;
        System.out.println("Addition");
        System.out.println(z);
    }

    public static void div(){
        int x = 10;
        int y = 4;
         int z = x/y;
        System.out.println(" Division");
        System.out.println(z);

    }

    public static void calculations(){
        Scanner sc = new Scanner(System.in);
        System.out.println("calculator");
        System.out.println("Ingiza x: ");
        int x = sc.nextInt();
        System.out.println("Ingiza y: ");
        int y = sc.nextInt();
        int z = x + y;
        System.out.println(x + " + " + y + " = " + z);
        z = x - y;
        System.out.println(x + " - " + y + " = " + z);
        z = x * y;
        System.out.println(x + " * " + y + " = " + z);
        z = x / y;
        System.out.println(x + " / " + y + " = " + z);
        z = x % y;
        System.out.println(x + " % " + y + " = " + z);
    }
    public static void info(){
        Scanner sc = new Scanner(System.in);
        System.out.println("If condition");
        System.out.println("Ingiza umri wako: ");
        int age = sc.nextInt();
        if (age > 18){
            System.out.println("Karibu");
        }else {
            System.out.println("Hairuhusiwi kuingia!");
        }
    }

    public static void grade(){
        Scanner sc = new Scanner(System.in);
        System.out.println("If condition");
        System.out.println("Ingiza marks: ");
        int grade = sc.nextInt();
        if (grade >= 80 && grade <= 100){
            System.out.println("A");
        }else if ( grade >= 60 && grade <= 79 ) {
            System.out.println("B");
        }else if ( grade >= 50 && grade <= 59 ) {
             System.out.println("C");
        }else if ( grade >= 40 && grade <= 49 ) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }

    public static void marks(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Switch");
        System.out.println("Ingiza marks: ");
        int grade = sc.nextInt();
        switch (grade) {
            case 80 -> System.out.println("A");
            case 70 -> System.out.println("B");
            case 60 -> System.out.println("C");
            case 50 -> System.out.println("D");
            default -> System.out.println("E");
        }
    }

    public static void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" String Manipulations");
        //int grade = sc.nextInt();
        String name = "Risasi Rajabu";
        String nameUpper = name.toUpperCase();
        String nameLower = name.toLowerCase();

        if(nameUpper.equals(nameLower)){
            System.out.println("ziko sawa");
        }

        if(nameUpper.equalsIgnoreCase(nameLower)){
            System.out.println("ziko sawa");
        }

        System.out.println("Urefu wa jina ni: "+name.length());

    }

    public static void repeatation(){
        System.out.println("Print For loop");
        int i =0;
        for(i=0; i <10; i++){
            System.out.println(i + " ");
        }


    }

    public static void checkBalance(){
        System.out.println("Print While loop");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Switch");
        System.out.println("Ingiza marks: ");
        //int kiasi = sc.nextInt();

        int balance = 50000;
        while (balance > 10000){
            System.out.println("Toa pesa: ");
            int amount = sc.nextInt();
            if(balance - amount < 10000){
                System.out.println("Huruhusiwi kutoa chini ya 10000!");
            }else{
                balance -= amount;
            }
        }
    }

    public static void salio(){
        System.out.println("Print While loop");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Switch");
        System.out.println("Ingiza marks: ");
        //int kiasi = sc.nextInt();

        int balance = 90000;
        do{
            System.out.println("Toa pesa: ");
            int amount = sc.nextInt();
            if(balance - amount < 10000){
                System.out.println("Huruhusiwi kutoa chini ya 10000!");
            }else{
                balance -= amount;
            }
        } while (balance > 10000);
    }




}
