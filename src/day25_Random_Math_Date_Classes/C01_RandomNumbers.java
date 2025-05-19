package day25_Random_Math_Date_Classes;

import java.util.Random;

public class C01_RandomNumbers {
    public static void main(String[] args) {

        Random randomNumber = new Random();

        System.out.println(randomNumber.nextInt());
        System.out.println(randomNumber.nextDouble());
        System.out.println(randomNumber.nextFloat());
        System.out.println(randomNumber.nextLong());
        System.out.println(randomNumber.nextBoolean());

        System.out.println(randomNumber.nextInt(10)); // 0-9
        System.out.println(randomNumber.nextInt(2)); // 0-1
        System.out.println(randomNumber.nextInt(10)+5); // 5-14
        System.out.println(randomNumber.nextInt(31)+20); // 20-50
        System.out.println(randomNumber.nextInt(100)+50); // 50-149
        System.out.println(randomNumber.nextInt(100)-50); // -50 +49

        for (int i = 0; i < 100; i++) {
            int sayi = randomNumber.nextInt(100)+1; // 1-100
            System.out.println("sayi = " + sayi);
        }
    }
}
