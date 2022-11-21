package com.bhushan.week2A;

// 27) WAP to print the Reverse of the given number.
public class Demo20 {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println(rev);
    }
}

