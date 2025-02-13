package day24_Reading_User_Input_Scanner;

import java.util.Scanner;

public class C02_UserInputs {

    public static void main(String[] args) {

        System.out.println("Reading User's input with Scanner Class");

        Scanner sc = new Scanner(System.in);

        System.out.print("Klavyeden byte türünde bir veri giriniz: ");
        byte byte1 = sc.nextByte();
        System.out.println("Girilen değer : " + byte1);

        System.out.print("Klavyeden short türünde bir veri giriniz: ");
        short short1 = sc.nextShort();
        System.out.println("Girilen değer : " + short1);

        System.out.print("Klavyeden int türünde bir veri giriniz: ");
        int int1 = sc.nextInt();
        System.out.println("Girilen değer : " + int1);

        System.out.print("Klavyeden float türünde bir veri giriniz: ");
        float float1 = sc.nextFloat();
        System.out.println("Girilen değer : " + float1);

        System.out.print("Klavyeden double türünde bir veri giriniz: ");
        double double1 = sc.nextDouble();
        System.out.println("Girilen değer : " + double1);

        System.out.print("Klavyeden boolean türünde bir veri giriniz: ");
        boolean bl1 = sc.nextBoolean();
        System.out.println("Girilen değer : " + bl1);

        System.out.print("Klavyeden String türünde bir veri giriniz: ");
        String s1 = sc.next();
        System.out.println("Girilen değer : " + s1);

        sc.nextLine();

        System.out.print("Klavyeden String türünde bir veri daha giriniz: ");
        String s2 = sc.nextLine();
        System.out.println("Girilen değer : " + s2);

        // Klavyeden tek harf girişi
        System.out.println("Klavyeden bir harf giriniz : ");
        char harf = sc.next().charAt(0); // İlk harfi döner
        System.out.println("Girilen harf : " + harf);

        sc.close();

        //uygun değer girilmezse: InputMismatchException hatası alırız.


    }
}
