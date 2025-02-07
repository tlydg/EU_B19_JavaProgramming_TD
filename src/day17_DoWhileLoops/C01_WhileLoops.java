package day17_DoWhileLoops;

import java.util.Scanner;

public class C01_WhileLoops {
    public static void main(String[] args) {
        /**
         * Do-while Loops
         * - Loops tekrar eden aynı islemleri defalarca yazmadan islem yapmamızı saplayan bir fonksiyon
         * - bir sayı aralıgında birer arttırarak bir sayıyı bulma veya o sayıları kullanma
         * - bir uygulamada son kullanıcıdan input alarak isleme sokma ve bu isi tekrarlama
         *
         * - While Loops : while (Kosul) olacak sekilde , kosul true, dogru iken dwvam eden, ta ki kosul false, yanli
         * olana kadar devam edecek olan looplardır.
         *
         *    for (assign ; kosul ; increment/decrement){
         *    // code
         *    }
         *    // assign
         *    while(kosul){
         *        // code
         *        // increment/decrement
         *    }
         */

        Scanner scanner = new Scanner(System.in);

        int sifre = 1234;
        for (int denemeSayisi =1; denemeSayisi<=3; denemeSayisi++){

            System.out.println("Lütfen sifrenizi giriniz : ");
            int girilenSifre = scanner.nextInt();

            if(girilenSifre == sifre){
                System.out.println("BASARILI");
                System.out.println("Hesaba yonlendiriliyorsunuz!");
                break;
            }else {
                System.out.println("!!! BASARISIZ Deneme !!!");
                if(denemeSayisi !=3){
                    continue;
                }
            }
            System.out.println("Kartınız Bloke Oldu: ");
            System.out.println("Lütfen Bankamıza basvurunuz! ");
        } // break noktası

        /** continue kullanmadan
         /** int sifre = 1234;
        for (int denemeSayisi =1; denemeSayisi<=3; i++){
            System.out.println("Lütfen sifrenizi giriniz : ");
            int girilenSifre = scanner.nextInt();
            if(girilenSifre == sifre){
                System.out.println("BASARILI");
                System.out.println("Hesaba yonlendiriliyorsunuz!");
                break;
            }else {
                System.out.println("!!! BASARISIZ Deneme !!!");
                if(denemeSayisi !=3){

                }
            }
            if (denemeSayisi ==3)
            System.out.println("Kartınız Bloke Oldu: ");
            System.out.println("Lütfen Bankamıza basvurunuz! ");
            }
        }  // break noktası
        */







    }

}
