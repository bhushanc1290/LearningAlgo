package com.bhushan.week2A;

// 23) WAP to find whether given number is strong or not.
//Strong number is a special number whose sum of the factorial of digits is equal to the original number.
public class Demo15 {
    public static void main(String[] args) {
        int numCopy=145;
        int num=145;
    int sum=0;
        while(num!=0){
            int rem = num %10;
            sum = sum +fact(rem);
            num = num /10;
        }
        if(sum == numCopy){
            System.out.println(numCopy +" Strong number");
        }else{
            System.out.println(numCopy +" not a Strong number");
        }


    }

    private static int fact(int num ) {

        int fact=1;
        //n-1 iteration
        for(int i=2;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
}
