package com.udacity;

public class MoviesCondition {

    public static void main(String[] args) {
        boolean action = true;
        boolean romance = true;
        boolean horror = false;
        boolean comedy = true;

        if(action && romance){
            System.out.println("This movie includes action and romance");
            if(comedy || horror){
                System.out.println("This also includes comedy or horror!");
            }
        }
    }
}
