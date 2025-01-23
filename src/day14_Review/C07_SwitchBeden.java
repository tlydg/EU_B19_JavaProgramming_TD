package day14_Review;

import java.util.Scanner;

public class C07_SwitchBeden {
    public static void main(String[] args) {
        /*
    bir program yazın switch yapısını kullanın
    beden numarası alsın
    small 38 , 40, 42
    medium 44, 46, 48
    large 50, 52, 54
    example output : 50 numara bir large bedendir.

    */

        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen bir beden giriniz : ");
        int beden = scn.nextInt();

        switch (beden){

            case 38, 40, 42:
                System.out.println(beden + " numara bir small bedendir. ");
                break;
            case 44, 46, 48:
                System.out.println(beden + " numara bir medium bedendir. ");
                break;
            case 50, 52, 54:
                System.out.println(beden + " numara bir large bedendir. ");
                break;

                default:
                System.out.println("Elimizde istediğiniz beden bulunmamaktadır. ");
        }

    }

}
// bu soruyu ifle çöz.
