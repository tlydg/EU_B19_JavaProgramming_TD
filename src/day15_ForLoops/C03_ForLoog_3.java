package day15_ForLoops;

import java.util.Scanner;

public class C03_ForLoog_3 {

    public static void main(String[] args) {
        // döngü 0 dan 10 a index yazdırın.
        for (int i = 0; i <= 10 ; i++ ){
            System.out.println("i = " + i);

        }

        System.out.println("-----------------------");

        // 10 dan 0 index yazdırın

        for (int i = 10; i >= 0 ; i-- ){
            System.out.println("i = " + i);

        }
        System.out.println("-------------------------");
        // 28 den 97 ye kadar olan sayıları 8 er 8 er yazdır
        for (int i = 28; i <= 97 ; i+=8 ){
            System.out.println("i = " + i);

        }
        // 97 den 28 e kadar olan sayıları 8 er 8 er yazdır

        System.out.println("--------------------------");
        for (int i = 97; i >= 28 ; i-=8 ){
            System.out.println("i = " + i);

        }
        System.out.println("--------------------------");

        // 1 den 50 ye kadar olan sayıların toplamı nedir.
        System.out.println(50*51/2); // gauss formülü - 1 den n'e kadar olan sayıların toplamı : n*(n+1)/2

        int sonuc =0;
        for (int i = 1; i <= 50 ; i++ ){
            sonuc += i; // sonuc= sonuc + i

        }
        System.out.println("sonuc = " + sonuc);

        System.out.println("--------------------------------");

        // verilen sayıya kadar olan sayıları toplayalım.
        // Scanner kullanalım.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int number = input.nextInt();

        int toplam =0;
        for (int i = 0; i <= number ; i++ ){
            toplam += i;

        }
        System.out.println(number + "'e kadar sayıların toplamı = " + toplam);

    }
}
