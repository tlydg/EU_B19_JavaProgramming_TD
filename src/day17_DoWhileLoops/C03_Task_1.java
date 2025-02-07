package day17_DoWhileLoops;

import java.util.Scanner;

public class C03_Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sifre = 1234;
        int denemeSayisi =1;
        while (denemeSayisi<=3){
            System.out.println();
            if (denemeSayisi == 3)
                System.out.println("Dikkat, bu son hakkınız !!!");
            System.out.println("Lütfen sifrenizi giriniz : ");
            int girilenSifre = scanner.nextInt();

            if(girilenSifre == sifre){
                System.out.println("BASARILI");
                System.out.println("Hesaba yonlendiriliyorsunuz!");
                break;
            }else {
                System.out.println("!!! BASARISIZ Deneme !!!");
                System.out.println("Deneme sayisi : = " + denemeSayisi);
                if(denemeSayisi !=3){
                    denemeSayisi++;
                    continue;
                }
            }
            System.out.println("Kartınız Bloke Oldu: ");
            System.out.println("Lütfen Bankamıza basvurunuz! ");
            break;
        } // break noktası

        System.out.println("Hesaba giris icin yapılan deneme sayisi : " +denemeSayisi);

        // infinite loop : sonsuz dongu
       /** while (true){
            System.out.println("x");
        }
        */
    }
}
