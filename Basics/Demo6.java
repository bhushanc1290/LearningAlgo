package com.bhushan.Basics;

//wap to find alphabet is vowel or consonent
public class Demo6 {
    public static void main(String[] args) {
        char ch ='V';
        if(ch>=65 && ch<=90){
            switch(ch){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':

                    System.out.println("ITs Vowel");
                    break;

                default:
                    System.out.println("its Consonant");
            }
        }else {
            System.out.println("Invalid Alphabet");
        }

    }
}
