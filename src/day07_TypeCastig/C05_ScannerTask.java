package day07_TypeCastig;

import java.util.Scanner;

public class C05_ScannerTask {

    public static void main(String[] args) {

        // Kullanıcıdan bir sayi alın
        // Sayiyi iki ile topla karesini al

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz : ");
        int number = input.nextInt();
        System.out.println("number = " + number);

        System.out.println("Girdiğiniz sayının iki fazlasının karesi : " + (number + 2) * (number + 2));

        // 2.yol
        int ikiFazlasi = number + 2;
        System.out.println("Math.pow(ikiFazlasi,2) = " + Math.pow(ikiFazlasi, 2));

        // veya kuvvet girdirip hesaplarsak
        System.out.println("Lütfen kuvvet giriniz:");
        int kuvvet = input.nextInt();
        System.out.println("Math.pow(number,kuvvet) = " + Math.pow(number, kuvvet));

    }
}
