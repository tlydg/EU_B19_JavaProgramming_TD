package day16_NestedForLoops;

public class C01_NestedForLoops {
    public static void main(String[] args) {
        /**
         * Nested For Loops : ic ice for Döngüleri
         * Loop nerelerde kullanılır:
         *  -Tekrarlayan benzer (aynı) işlemleri yaptırmak için
         *  ex. Sayi dizisinde istenilen sayiyi arama
         *
         *  Nested Loop nerelerde kullanılır ?
         *  2 boyutlu bir tekrar işleminde kullanılır.
         *  Ex: Tekrarlanan işlemlerin boyutları 1 den fazla ise...
         */

        for (int i =1 ; i<3; i++){ // 2 satir
            //code
            //System.out.print("x");
            System.out.print(" i = " + i);
            for (int j=1 ; j<5 ; j++){ // 4 sütun
                // code
                //System.out.print("x");
                System.out.print(" j = " + j);
            }
            System.out.println();
        }
    }
}
