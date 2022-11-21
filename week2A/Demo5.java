package com.bhushan.week2A;

// 13) WAP to find sum of divisible of a given number
public class Demo5 {
    public static void main(String[] args) {
        int num =10;
        int sum=0;
        for(int i=1;i<= num;i++){
            if(num %i ==0){
                sum= sum+ i;
                System.out.println(":"+ i);
            }

        }
        System.out.println(sum);
    }
}
