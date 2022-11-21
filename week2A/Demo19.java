package com.bhushan.week2A;

//  28) WAP to find whether given number is Palindrome or not.
public class Demo19 {
    public static void main(String[] args) {
        int num = 111;
        int numCopy = num;
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        if(numCopy == rev)
            System.out.println( numCopy + " is Palindrome");
        else
            System.out.println( numCopy + " is NOT Palindrome");
    }
}

