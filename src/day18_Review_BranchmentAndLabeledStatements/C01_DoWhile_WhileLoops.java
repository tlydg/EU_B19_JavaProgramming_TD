package day18_Review_BranchmentAndLabeledStatements;

import java.util.Scanner;

public class C01_DoWhile_WhileLoops {
    public static void main(String[] args) {
        // do - while loop ile verilen sayıdan başlayıp, birer azaltalarak
        // 3 e kadar olan sayıları yazdıralım...

        Scanner sayiGir = new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz : ");
        int sayi = sayiGir.nextInt();

        do {
            System.out.println(sayi);
            sayi --;

        }while (sayi >3);


        System.out.println("Bir tam sayı giriniz : ");
        sayi = sayiGir.nextInt();

        while (sayi >3){
            System.out.println(sayi);
            sayi --;

        }
    }
}
