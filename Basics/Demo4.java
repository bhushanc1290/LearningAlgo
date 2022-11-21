package com.bhushan.Basics;

//wap to find maximum number between 3 number
public class Demo4 {
    public static void main(String[] args) {
        int a=33;
        int b=25;
        int c= 75;
        int max=0;
        if(a > b && a> c){
             max = a;
            System.out.println("maximum number is "+max);
        }else if( b>c ){
              max =b;
            System.out.println("maximum number is "+max);
        }
        else{
            max =c;
            System.out.println("maximum number is "+max);
        }
    }
}
