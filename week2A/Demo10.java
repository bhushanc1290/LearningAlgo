package com.bhushan.week2A;

// 18) WAP to find sum of individual digits of given number?
public class Demo10 {
    public static void main(String[] args) {
        int num=123456;
        int sum=0;
        while(num !=0){
            int rem= num%10;
            sum= sum+rem;
            num=num/10;
        }
        System.out.println("Sum of Digits : "+ sum);
    }
}
