package com.bhushan.week2B;

//fibonacci series
public class Demo1 {
    public static void main(String[] args) {
        int num = 5;
        int firstNum = 0;
        int secNum = 1;

        int nextnum = 0;
        System.out.print(firstNum + "\t" + secNum);
        /*if (num <= 0) {

        }*/
        if (num > 3) {
            for (int i = 1; i <= num - 2; i++) {
                nextnum = firstNum + secNum;
                System.out.print("\t" + nextnum);
                firstNum = secNum;
                secNum = nextnum;

            }
        }


    }
}
