package com.bhushan.week2B;

//1 1 6 4 11 9 16 21 25 series
public class Demo3 {
    public static void main(String[] args) {
        //input only even numbers
        int num = 7;


        int a = 1;
        int b = 1;

        int count = 0;


        for (int i = 1; i <= num / 2 + 1; i++) {

            System.out.print(a + "\t");
            a = a + 5;
            count++;

            if (count == num) {
                break;
            } else {
                System.out.print(b + "\t");
                b = (i + 1) * (i + 1);
                count++;
            }


        }


    }
}
