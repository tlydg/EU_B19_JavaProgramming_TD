package day18_Review_BranchmentAndLabeledStatements;

import java.util.Scanner;

public class C02_DoWhile_WhileLoops2 {
    public static void main(String[] args) {

        /**
         * koşulun baştan bilindiği ve döndügünün hi çalışmama ihtimali oldugunda
         * while kullanılır.
         * Örneğin : kullanıcıdan geçerli bir sayı girmesi istendiğinde
         */
        Scanner sc = new Scanner(System.in);
        int sayi =0;

        while (sayi <=0){
            System.out.println("Lütfen pozitif bir sayi giriniz : ");
            sayi = sc.nextInt();
        }
        System.out.println(sayi + " girilmiştir. ");

        /**
         * Kullanıcıya bir menu bilgisi verilmek istendiğinde
         * Do-While kullanırız, kullanıcı hatalı girse bile menüyü görür.
         */

        int secim;
        do {
            System.out.println("1- Başla");
            System.out.println("2- Çıkış");
            secim =sc.nextInt();
        }while (secim !=1 && secim !=2);

        System.out.println("Seçilen menü : " +secim);
    }
}
