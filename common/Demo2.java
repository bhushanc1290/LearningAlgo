package com.bhushan.common;

//wap to find maximum number between 2 number
public class Demo2 {
    public static void main(String[] args) {
        int a=33;
        int b=33;
        int max=0;
        if(a !=b){
            if(a > b){
                max = a;
                System.out.println("maximum number is "+max);
            }else{
                max =b;
                System.out.println("maximum number is "+max);
            }
        }else{
            System.out.println("Both are Same ");
        }

    }
}
