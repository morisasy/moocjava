package com.udacity;

public class CountBlock {


    public  int countBlocks(int levels){
        int total = 0;
        for(int i=1; i <=levels; i++){
            total = total + (i*i);
        }
        return total;
    }

    public static void main(String[] args) {
       CountBlock countBlock = new CountBlock();
        System.out.println(countBlock.countBlocks(3));

    }
}
