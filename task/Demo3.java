package com.bhushan.task;

// 23) WAP to find first 10 strong numbers
//Strong number is a special number whose sum of the factorial of digits is equal to the original number.
public class Demo3 {
    public static void main(String[] args) {
        int m = 1;
        int n = 1000000000;
        int count = 0;
        for (int k = m; k <= n; k++) {
            if (isStrong(k)) {
                System.out.println(k);
                count++;
            }
            if (count == 10) {
                break;
            }
        }
    }

    private static boolean isStrong(int num) {
        int numCopy = num;

        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = sum + fact(rem);
            num = num / 10;
        }
        if (sum == numCopy) {
            return true;
        } else {
            return false;
        }
    }

    private static int fact(int num) {

        int fact = 1;
        //n-1 iteration
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
