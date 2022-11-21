package com.bhushan.common;

//4. WAP to Print the Numbers Divisible by 5 from 1 to N.
public class Demo5 {
    public static void main(String[] args) {

        int num= 25;
        for (int i=1;i<= num;i++){
            if(i%5==0){
                System.out.print(i +" ");
            }

        }

    }
}
