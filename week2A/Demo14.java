package com.bhushan.week2A;

import java.math.BigInteger;

//22) WAP to find sum of Factorials of individual digits of given number?
public class Demo14 {
    public static void main(String[] args) {
        int num=123;

    int sum=0;
        while(num!=0){
            int rem = num %10;
            sum = sum +fact(rem);
            num = num /10;
        }
        System.out.println("sum of factorial of number :"+ sum);

    }

    private static int fact(int num ) {

        int fact=1;
        //n-1 iteration
        for(int i=2;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
}
