package day18_Review_BranchmentAndLabeledStatements;

import java.util.Scanner;

public class C19_HomeWork5 {
    public static void main(String[] args) {
        /*Soru 5- Kullanicidan bir pozitif sayi isteyin,
        verilen sayı tam kare değilse kullanıcı sayı girmeye devam etsin, tam kare ise :
        “Girilen sayı 2 sayısının tam karesidir.” yazdırsın..
        Ornek : input : 16,  output : Girilen sayı 4 sayısının tam karesidir.

         */
        Scanner input = new Scanner(System.in);

       /* while (true){
            System.out.println("Lütfen bir sayı giriniz : ");
            int sayi = input.nextInt();
            if(sayi == (int) Math.sqrt(sayi)*Math.sqrt(sayi)){
                System.out.println("sayi = " + (int) Math.sqrt(sayi) + " sayinın tam karesidir. ");
                break;
            }else {
                System.out.println("Girilen sayi tam kare değildir. ");
            }

        }

        */

        outer :
        while (true){
            System.out.println("Lütfen bir sayı giriniz : ");
            int sayi1 = input.nextInt();

            for (int i = 1; i < sayi1 ; i++) {
                if (i * 1 == sayi1){
                    System.out.println("sayi = " + i + " sayinın tam karesidir. ");
                    break outer;
                }

            }
            System.out.println("Girilen sayı tam kare değildir. ");
        }
    }
}
