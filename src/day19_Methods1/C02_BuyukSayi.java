package day19_Methods1;

import java.util.Scanner;

public class C02_BuyukSayi {
    public static void main(String[] args) {

        buyukSayi();
    }
    /*
    girilen iki sayıdan büyük olanını yazdıran metod nedir.
     */

    public static void buyukSayi (){
        Scanner input = new Scanner(System.in);
        System.out.println("iki tane sayı giriniz :");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        if (sayi1 >=sayi2){
            System.out.println(sayi1 + " büyük olan sayıdır.");
        }else {
            System.out.println(sayi2 + " büyük olan sayıdır.");
        }
    }

}
