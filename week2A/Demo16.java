package com.bhushan.week2A;

// 24) WAP to display the strong numbers from m to n.
//Strong number is a special number whose sum of the factorial of digits is equal to the original number.
public class Demo16 {
    public static void main(String[] args) {
        int m=1;
        int n=500;
        for(int k=m;k<=n;k++){
            if(isStrong(k)){
                System.out.println(k);
            }
        }



    }

    private static boolean isStrong(int num) {
        int numCopy=145;
        int sum=0;
        while(num!=0){
            int rem = num %10;
            sum = sum +fact(rem);
            num = num /10;
        }
        if(sum == numCopy){
            return true;
        }else{
            return false;
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
