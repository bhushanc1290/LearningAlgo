package com.bhushan.week2A;

// 15) WAP to display the perfect numbers from m to n.
public class Demo7 {
    public static void main(String[] args) {
        int m=1;
        int n = 30;
        for(int i=m;i<=n;i++){

            if(isPerfectNumber(i)){
                System.out.println(i);
            }
        }
    }

    private static Boolean isPerfectNumber(int num) {

        int sum=0;

        for(int i=1;i<= num/2;i++){
            if(num %i ==0){
                sum= sum+ i;
            }

        }
        if(sum == num){
            return  true;
        }else{
           return  false;
        }
    }
}
