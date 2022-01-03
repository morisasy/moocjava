package com.udacity;

public class BirthCertificateCondition {
    public static void main(String[] args) {
        boolean passport = false;
        boolean birthCertificate = true;
        boolean driversLicense = true;

        if(passport){
            System.out.println("A passport is a valid ID.");
        }else if (birthCertificate){
            System.out.println("A birth certifacte is a valid ID.");
        }else if(driversLicense){
            System.out.println("A driver's license is a valid ID.");
        }else {
            System.out.println("Invalid ID. Your application is denied.");
        }
    }
}
