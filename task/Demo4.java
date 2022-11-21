package com.bhushan.task;

// 25) WAP to find whether given number is armstrong or not.
//Armstrong number is a number that is equal to the sum of cubes of its digits.
// For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
public class Demo4 {
    public static void main(String[] args) {
        int m = 1;
        int n = 500000000;
        int count = 0;
        for (int k = m; k <= n; k++) {
            if (isArmstrongNumber(k)) {
                System.out.println(k);
                count++;
            }
            if (count == 10) {
                break;
            }
        }


    }

    private static boolean isArmstrongNumber(int num) {

        int copyNum = num;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = sum + cube(rem);
            num = num / 10;
        }
        if (sum == copyNum) {
            return true;
        } else {
            return false;
        }
    }

    private static int cube(int rem) {
        return rem * rem * rem;
    }
}
