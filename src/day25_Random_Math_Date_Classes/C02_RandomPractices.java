package day25_Random_Math_Date_Classes;

import java.util.Random;
import java.util.Scanner;

public class C02_RandomPractices {
    public static void main(String[] args) {

        Random random = new Random();

        int number;

        while (true){
            number=random.nextInt(50) + 50; //50-99
            System.out.println("all " +number);
            if(number % 2 == 1){
                break;
            }
        }
        System.out.println("number = " + number);

        System.out.println("---------------------------------");

        int number2;
        do {
            number2=random.nextInt(50) + 50; //50-99

        }while(number2 %2==0);
        System.out.println("number2 = " + number2);

    }
}
