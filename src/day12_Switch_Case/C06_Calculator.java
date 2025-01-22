package day12_Switch_Case;

import java.util.Scanner;

public class C06_Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hesap Makinesi");
        System.out.println("----------------------");

        int sonuc = 0;

        System.out.println("1. sayıyı giriniz : ");
        int sayi1 = input.nextInt();

        input.nextLine(); // Scanner clasında sayı inputundan sonra string alınması için araya bir nextLine konulmalıdır.

        System.out.println("Bir işlem operatoru giriniz -> '+', '-', '*','/' : ");
        String islemOperatoru = input.nextLine();

        System.out.println("2. sayıyı giriniz : ");
        int sayi2 = input.nextInt();


        switch (islemOperatoru) {
            case "+" -> sonuc = sayi1 + sayi2;
            case "-" -> sonuc = sayi1 - sayi2;
            case "*" -> sonuc = sayi1 * sayi2;
            case "/" -> {
                if (sayi2 == 0){
                    System.out.println("İkinci sayı 0 olamaz.. tekrar giriniz...");
                    sayi2 =input.nextInt();
                }
                sonuc = sayi1 / sayi2;

            }
            default -> System.out.println("Yanlış operator girdiniz !!!");
        }
        System.out.println("sonuc = " + sonuc);

    }
}


