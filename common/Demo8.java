package com.bhushan.common;

//8. WAP to Find whether given Number is Prime or Not
public class Demo8 {
    public static void main(String[] args) {

        int num= 11;
        int count=0;
        for (int i=2;i<= num/2;i++){
            if(num%i==0){
                count++;
                break;
            }

        }
        if(count ==0){
            System.out.println(num + " is prime");
        }else{
            System.out.println(num +" is not prime");
        }


    }
}
