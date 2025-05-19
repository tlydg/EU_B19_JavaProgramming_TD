package day30_Arrays01;

import java.util.Scanner;

public class C05_Aylar {
    public static void main(String[] args) {
        // Yilin aylarini gosteren bir array olusturarak,
        // kullanicidan aldiginiz dogdugu ayi bastiran bir code yaziniz

        String [] aylar = new String[12];
        aylar[0]="Ocak";
        aylar[1]="Şubat";
        aylar[2]="Mart";
        aylar[3]="Nisan";
        aylar[4]="Mayıs";
        aylar[5]="Haziran";
        aylar[6]="Temmuz";
        aylar[7]="Ağustos";
        aylar[8]="Eylül";
        aylar[9]="Ekim";
        aylar[10]="Kasım";
        aylar[11]="Aralık";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen doğduğunuz ayı rakam olarak giriniz: ");
        int index= scanner.nextInt();

        if (index >0 && index<=12){
            System.out.println("Doğum ayınız : " + aylar[index-1]);
        }
        else {
            System.out.println("Yanlış ay girdiniz.");
        }



    }
}
