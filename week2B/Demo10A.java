package com.bhushan.week2B;

/*
37) Print the following Pattern
                 *
              *  *  *
           *  *  *  *  *
        *  *  *  *  *  *  *
     *  *  *  *  *  *  *  *  *
        *  *  *  *  *  *  *
           *  *  *  *  *
              *  *  *
                 *
*/
public class Demo10A {
    public static void main(String[] args) {
        int stars = 1;
        int rows = 6;
        int space = 25;
        for (int i = 1; i <= rows/2+1; i++) {
            //Task 1: Print space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");

            }
            //Task 1: Print Stars
            for (int k = 1; k <= stars; k++) {
                System.out.print(" * ");

            }

            //Task 2: Print Newline
            System.out.println(" ");
            space = space - 2;
            stars = stars + 2;

        }

        //int stars = 1;
        //int rows = 6;
        //int space = 15;
        for (int i = 1; i <= rows; i++) {
            //Task 1: Print space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");

            }
            //Task 1: Print Stars
            for (int k = 1; k <= stars; k++) {
                System.out.print(" * ");
                //num++;
            }

            //Task 2: Print Newline
            System.out.println(" ");
            space = space +2;
            stars = stars - 2;

        }
    }
}
