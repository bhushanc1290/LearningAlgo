package com.bhushan.common;

//8.  WAP to print the prime numbers between M to N.
public class Demo9A {
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
        boolean primeFlag=true;
       // int count = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                primeFlag=false;
                break;
            }
        }
    return  primeFlag;
    }
}
