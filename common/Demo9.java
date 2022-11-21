package com.bhushan.common;

//8.  WAP to print the prime numbers between M to N.
public class Demo9 {
    public static void main(String[] args) {

        int m = 1;
        int n = 11;
        for (int i = m; i <= n; i++) {
            if(isprime(i)){
                System.out.println(i);
            }
        }
    }

    private static Boolean isprime(int num) {
        boolean primeFlag=false;
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
    return  primeFlag;
    }
}
