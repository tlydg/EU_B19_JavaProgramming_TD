package day19_Methods1;

import java.util.Scanner;

public class C03_UniqueNumber {
    public static void main(String[] args) {

        farkliSayi();

    }
    /*
    verilen 3 sayı içerisinde kaç farklı sayı olduğunu yazdıran metod nedir?
     */
    public static void farkliSayi (){

        Scanner input = new Scanner(System.in);
        System.out.println(" 3 tane sayı giriniz :");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        int sayi3 = input.nextInt();

        int sonuc;

        if (sayi1 == sayi2 && sayi2 == sayi3 ){
            sonuc =1;
        } else if (sayi1 == sayi2 || sayi1 == sayi3 || sayi2 ==sayi3 ) {
            sonuc =2;
        }else {
            sonuc=3;
        }
        System.out.println("Farklı sayı adedi : " +sonuc);


    }

}
