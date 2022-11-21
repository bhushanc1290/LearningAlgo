package com.bhushan.common;

//4. WAP to Print Divisibles of the given Number.
public class Demo6 {
    public static void main(String[] args) {

        int num= 25;
        for (int i=2;i<= num-1;i++){
            if(num%i==0){
                System.out.print(i +" ");
            }

        }

    }
}
