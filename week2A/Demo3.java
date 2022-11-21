package com.bhushan.week2A;

// 11) WAP to find sum of squares of numbers from 1 to n.
public class Demo3 {
    public static void main(String[] args) {
        int num =3;
        int sum=0;
        for(int i=1;i<= num;i++){
           sum= sum+ i*i;
        }
        System.out.println(sum);
    }
}
