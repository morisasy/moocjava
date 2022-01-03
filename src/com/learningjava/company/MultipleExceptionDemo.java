package com.company;

public class MultipleExceptionDemo {
    public static void main(String[] args) {
        try {
            int a[] = new int[7];
            a[6] = 8;
            int i = 7;
            int j = 2;
            int k = i/j;
            System.out.println("output is: " + k);
        } catch (ArithmeticException e){
            System.out.println("Cannot divide by Zero: ");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit ");
        }catch (Exception e) {
            System.out.println("Something wrong ");
        }finally {
            System.out.println("Bye");
        }

    }
}
