package com.company;

import java.time.LocalDate;

public class PassportDemo {

    public static void main(String[] args) {
        // classes
        Passport ukpassport = new Passport("124343",
                LocalDate.of(2025, 1, 4), "England Uk");
        Passport usPassport = new Passport("237237", LocalDate.of(2026, 4, 1), "Usa");
    }
    static class Passport{
        String number;
        LocalDate expirydate;
        String country;

        Passport(String number, LocalDate expirydate, String country){
            this.number = number;
            this.expirydate = expirydate;
            this.country = country;
        }

    }
}
