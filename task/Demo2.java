package com.bhushan.task;

public class Demo2 {
    public static void main(String[] args) {
        int m = 1;
        int n = 5000000;
        int count = 0;
        for (int k = m; k <= n; k++) {
            if (isPerfect(k)) {
                System.out.println(k);
                count++;
            }
            if (count == 10) {
                break;
            }
        }
    }

    private static boolean isPerfect(int k) {
        int sum = 0;
        int copyNum = k;

        for (int i = 1; i <= k / 2; i++) {
            if (k % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == copyNum) {
            return true;
        } else {
            return false;
        }

    }
}
