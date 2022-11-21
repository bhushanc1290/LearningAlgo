package com.bhushan.week2B;

/*
37) Print the following Pattern
*
* *
* * *
* * * *
* * * * *
*/
public class Demo9 {
    public static void main(String[] args) {

        int row = 5;
        int star = 5;
        //int star="*";

        for (int i = 1; i <= row; i++) {
            //task1 print star
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
                if(i==j){
                    break;
                }

            }
            //task2 print newline
            System.out.println();
        }

    }
}
