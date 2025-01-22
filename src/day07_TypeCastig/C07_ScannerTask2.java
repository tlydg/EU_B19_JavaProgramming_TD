package day07_TypeCastig;

import java.util.Scanner;

public class C07_ScannerTask2 {

    public static void main(String[] args) {

        //      Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
       //    Isminiz : Himmet
      //    Soyisminiz : Abi
     //    Yasiniz : 38
     //      Dogum Yeriniz : Kayseri
     //    Kaydiniz basariyla tamamlanmistir.

        Scanner input = new Scanner(System.in);


        System.out.println("Lütfen isminizi giriniz :");
        String isim = input.nextLine();


        System.out.println("Lütfen soyisminizi giriniz :");
        String soyAd = input.nextLine();

        System.out.println("Lütfen yaşinizi giriniz :");
        int yas = input.nextInt();

        input.nextLine(); // enter için

        System.out.println("Lütfen dogum yerinizi giriniz :");
        String dogumYeri = input.nextLine();

        System.out.println("isim = " + isim);
        System.out.println("soyAd = " + soyAd);
        System.out.println("yas = " + yas);
        System.out.println("dogumYeri = " + dogumYeri);
        System.out.println("Kaydınız başarılı bir şekilde oluşturulmuştur");




    }
}
