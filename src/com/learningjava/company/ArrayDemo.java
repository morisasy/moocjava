package com.company;

public class ArrayDemo {
    public static void main(String[] args) {

        int nums[] = new int[4];
        // int nums = {8, 12, 76, 54}
        nums[0] = 8;
        nums[1] = 12;
        nums[2] = 76;
        nums[3] = 54;

        //nums[0]= 8;
        for (int i = 0; i < 4; i++) {
            System.out.println(nums[i]);
        }
        String[] names = {"Anna", "Susanna", "Daudi"};
        for(String name : names){
            System.out.println("list of name :" + name);
        }
    }
}
