package day08_Assingment_Relational_Logical_Operators;

import java.util.Scanner;

public class C06_SayiTerstenOlusturma {

    public static void main(String[] args) {

        // odev
        // verilen 3 basamakli sayiyi tersten olusturan kodu yaziniz.
        // 123 ------321
        //verilen sayıyı tersten olusturan kodu yazın
        //123
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen üç basamaklı bir sayı girin, \n size o sayının tersini yazayım :");

        int girilenSayi=scan.nextInt();
        int basamak, tersSayi;

        tersSayi=0;
        basamak=girilenSayi%10; //3

        tersSayi=tersSayi*10+basamak; //3
        girilenSayi/=10;  //12

        basamak=girilenSayi%10; //2
        tersSayi=tersSayi*10+basamak; //32
        girilenSayi/=10; //1
        basamak=girilenSayi;
        tersSayi=tersSayi*10+basamak;

        System.out.println("tersSayi = " + tersSayi);




    }
}
