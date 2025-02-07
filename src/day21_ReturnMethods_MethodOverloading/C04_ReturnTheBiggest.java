package day21_ReturnMethods_MethodOverloading;

import java.util.Scanner;

public class C04_ReturnTheBiggest {
    public static void main(String[] args) {
        System.out.println(biggerNumber(23, 12));
    }
    public static int biggerNumber (int num1, int num2){
       return num1>num2 ? num1 : num2 ;
    }
}

//a method that returns the biggest number of two numbers