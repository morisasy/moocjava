package com.company;

public class LensDemo {

    public static void main(String[] args) {
        // classes and objects
        Lens lensOne = new Lens("sonny","85mm", true);
        Lens lensTwo = new Lens("canon","24-700mm", false);
        Lens lensThree = new Lens("sonny","30mm", true);

        System.out.println("***************************");
        System.out.println("Lens 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);
        System.out.println("***************************");
        System.out.println("Lens 3");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrime);
        System.out.println("***************************");
        System.out.println("Lens 3");
        System.out.println(lensThree.brand);
        System.out.println(lensThree.focalLength);
        System.out.println(lensThree.isPrime);


    }

    static class Lens{
        String brand;
        //String model;
        //String colour;
       // double price;
        //double weight;
        String focalLength;
        Boolean isPrime;
        Lens(String brand,
             String focalLength,
             boolean isPrime){
            // this current instances of this class
            this.brand = brand;
            //this.model = model;
           // this.colour = colour;
            //this.price = price;
            //this.weight= weight;
            this.focalLength = focalLength;
            this.isPrime = isPrime;

        }
    }



}
