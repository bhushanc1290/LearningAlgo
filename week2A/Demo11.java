package com.bhushan.week2A;

// 19) WAP to find sum of Squares of individual digits of given number?
public class Demo11 {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;

        for(;num!=0;num = num /10) {
            int rem = num %10;
            sum = sum +rem*rem;
        }

        System.out.println("Sum : "+ sum);
    }
}
