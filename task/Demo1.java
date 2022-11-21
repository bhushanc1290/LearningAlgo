package com.bhushan.task;

//8.  WAP to Display first 10 Prime Numbers
public class Demo1 {
    public static void main(String[] args) {

        int m = 1;
        int n = 100;
        int count = 0;
        for (int i = m; i <= n; i++) {
            if (isprime(i)) {
                System.out.println(i);
                count++;
                if (count == 10)
                    break;
            }
        }
    }

    private static Boolean isprime(int num) {
        boolean primeFlag = false;
        int count = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            primeFlag = true;

        }
        return primeFlag;
    }
}
