package day15_ForLoops;

import java.util.Scanner;

public class C09_SayiBasamakDegeriToplama {

    public static void main(String[] args) {
        // klavyeden girilen sayının basamak değeri toplamını veren kod
        // örnek : 123 = 6
        // 45897 = 33
        // meraklısına : aynı loop içinde basamak sayısını da bulabilirsiniz.

        //psvm main metot kısa yolu

        // 1. step kullanıcıdan input al
        Scanner input = new Scanner(System.in);
        // Scanner scanner = new Scanner ();
        System.out.print("Lütfen bir sayı giriniz : ");
        int number = input.nextInt();
        //sout
        //variable.soutv
        System.out.println("number = " + number);
        // 2. Loop içerisinde inputun uzunluğunu kaydet.
        // 3. Loop içerisinde her bir basamağın değerini alarak bir değişkende tut.
        int basamakSayisi = 0;
        int basamakDegerleriToplami = 0;
        for(int i = number; 0<i; ){
            // 123
            // %10 : 10'a bölümünden kalanı verecek
            // number%10 = 3,
            // number = number/10 = 12
            // number%10 =2,
            // number = number/10 = 1
            // number%10 =1
            // number = number/10 = 0
            basamakSayisi++;
            basamakDegerleriToplami = basamakDegerleriToplami + i%10 ;
            i /= 10; // i= i/10

        }

        // 4. print : basamak değerlerini toplamını ve basamak sayısını yazdır.

        System.out.println("basamakSayisi = " + basamakSayisi);
        System.out.println("basamakDegerleriToplami = " + basamakDegerleriToplami);


    }
}
