package com.bhushan.common;

//4. WAP to Find the Number of Divisibles of the given Number.
public class Demo7 {
    public static void main(String[] args) {

        int num= 25;
        int count=0;
        for (int i=1;i<= num;i++){
            if(num%i==0){
                //System.out.print(i +" ");
                count++;
            }

        }
        System.out.println(count);

    }
}
