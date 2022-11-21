package com.bhushan.week2B;

//1 1 6 4 11 9 16 21 25 series
public class Demo2 {
    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        //input only even numbers
        int num = 8;



        for (int i = 1; i < num/2+1; i++) {
            System.out.print(a +"\t" + b +"\t");
            a = a + 5;

            b = (i+1) * (i+1);


        }


    }
}
