package day17_DoWhileLoops;

import java.util.Scanner;

public class C06_SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomSayi =43;
        int girilenSayi =0;

        do {
            System.out.print("Lütfen 1-100 arasında bir sayi giriniz : ");
            girilenSayi = scanner.nextInt();
        }while (girilenSayi != randomSayi);
        /**
         * eger kosulda kullanılan input, belirli degilse, ve code calısınca elde edilecekse, do-while kullanılır.
         *
         */

        System.out.println("----------------------------------------------------");


        System.out.println("Lütfen 1-100 arasında bir sayi giriniz : ");
        girilenSayi = scanner.nextInt();
        while (girilenSayi !=randomSayi) {
           System.out.println("Lütfen 1-100 arasında bir sayi giriniz : ");
           girilenSayi = scanner.nextInt();
        }

    }
}
