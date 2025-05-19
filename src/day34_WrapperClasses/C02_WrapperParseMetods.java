package day34_WrapperClasses;

import java.util.Arrays;

public class C02_WrapperParseMetods {
    public static void main(String[] args) {
        String str = "123455.4444";
        Double doubleSayi = Double.parseDouble(str);
        System.out.println("doubleSayi = " + doubleSayi);

        double dblSayi = Double.parseDouble(str);
        System.out.println("dblSayi = " + dblSayi);

        String strInt = "1235";
        System.out.println(strInt + 5); //12355

        int sayiInt = Integer.parseInt(strInt);
        System.out.println("sayiInt = " + sayiInt);
        System.out.println(sayiInt + 5); //1240

        System.out.println("-----------------------------");
        /**
         * veri yapısı
         * 1.eleman -- isim
         * 2.eleman --- dogumYılı
         * 3.eleman --- dogumyeri
         * 4. eleman ---- dogumülkesi
         *
         */

        String str2="Süleyman 1982 Ankara Türkiye; 25000";
        System.out.println("str2 = " + str2);
        String[] strArr = str2.split(" ");

        System.out.println("--------------------");
        System.out.println(Arrays.toString(strArr));
        System.out.println("Adı        = " + strArr[0]);
        System.out.println("Doğum yılı = " + strArr[1]);
        System.out.println("Doğum İli  = " + strArr[2]);
        System.out.println("Dogum Ülke = " + strArr[3]);


        int dogumYili = Integer.parseInt(strArr[1]);
        int yas=2025-dogumYili;
        System.out.println("yas = " + yas);


        String [] strArray={"Ahmet 1978 İstanbul Türkiye", "Hasan 1976 Berlin Almanya", "Selda 1993 Washington ABD"};
        for (String str3: strArray ) {
            String[] eleman = str3.split(" ");
            System.out.println("Adı        = " + eleman[0]);
            System.out.println("Doğum yılı = " + eleman[1]);
            System.out.println("Doğum İli  = " + eleman[2]);
            System.out.println("Dogum Ülke = " + eleman[3]);
            System.out.println();

        }
//                     5940
//                                    "5940"
        int i = Integer.parseInt("  5940   ".trim());
        System.out.println("i = " + i);

    }
}
