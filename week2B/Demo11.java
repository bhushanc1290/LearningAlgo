package com.bhushan.week2B;

/*
 39) Print the following Pattern
*
* * *
* * * * *
* * * * * * *
* * * * *
* * *
*

 */

public class Demo11 {
    public static void main(String[] args) {
        int row=5;
        int star=1;
        for (int i=1;i<=row/2+1;i++){
            //task to print *
            for (int j=1;j<=star;j++){
                System.out.print("*");
            }
            //task to print new line
            System.out.println();
            star++;
        }

         //row=5;
         //star=2;
       star = row/2;

        for (int i=1;i<=row/2;i++){
            //task to print *
            for (int j=1;j<=star;j++){
                System.out.print("*");
            }
            //task to print new line
            System.out.println();
            star--;
        }
    }
}
