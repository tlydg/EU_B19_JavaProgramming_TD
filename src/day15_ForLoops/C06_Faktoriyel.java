package day15_ForLoops;

import java.util.Scanner;

public class C06_Faktoriyel {
    public static void main(String[] args) {

        // girilen sayının faktöriyel değerini bulunuz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktöriyeli alınacak pozitif tam sayıyı giriniz : ");
        int gilenSayi = scanner.nextInt();
        int sonuc =1;

        for ( int i = 1; i<= gilenSayi; i++ ){
            sonuc *= i;
        }
        System.out.println("sonuc = " + sonuc);
    }
}
