package com.bhushan.week2A;

// 14) WAP to find whether given number is perfect or not.
public class Demo6 {
    public static void main(String[] args) {
        int num =30;
        int sum=0;
        for(int i=1;i<= num/2;i++){
            if(num %i ==0){
                sum= sum+ i;
                System.out.println(":"+ i);
            }

        }
        if(sum == num){
            System.out.println(num +" is a perfect number");
        }else{
            System.out.println(num +" is Not a perfect number");
        }

    }
}
