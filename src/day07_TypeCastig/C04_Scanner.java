package day07_TypeCastig;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        // 1. Scanner sınıfında bir obje oluştur
        Scanner scan = new Scanner(System.in);

// 2. Kullanıcıyı bilgilendir!! Ne istediğini söyle
        System.out.print("Lütfen isminiz giriniz :");

// 3. Girilen veriyi içene koyabileceğimiz uygun bir değişken oluştur.
// scanner uygun methodu ile veriyi değişken içersine yaz.

        String name= scan.next();
//scan.next();  ===> ilk boşluğa kadar alır ---   Ali Osman --- Ali alır
//scan.nextLine() ===> ilke entera kadar alır --->  Ali Osman --- Ali Osman

        System.out.println("İsminiz : "+ name);

        // 4. close scanner

        scan.close();



    }
}
