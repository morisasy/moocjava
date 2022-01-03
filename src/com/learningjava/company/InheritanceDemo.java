package com.company;

/**
 *
 * @author: Risasi
 */

class Calculator // super class , parent, base
{
    public int add(int i, int j){
        return  i + j;
    }
}

class CalcAdv extends Calculator{ // sub, child, derived

    public int sub(int i, int j){
        return  i - j;
    }

}

class CalcVeryAdv extends  CalcAdv{

    public int multi(int i, int j){
        return  i * j;
    }

}

public class InheritanceDemo {

    public static void main(String[] args) {
        CalcVeryAdv c1 = new CalcVeryAdv();
        int result = c1.add(5, 4);
        int result1 = c1.sub(6,3);
        int res = c1.multi(4,5);

        System.out.println(" add: "+ result);
        System.out.println(" sub: "+ result1);
        System.out.println(" multi: "+ res);
    }
}
