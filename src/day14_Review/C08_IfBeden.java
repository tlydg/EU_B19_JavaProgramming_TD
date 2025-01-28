package day14_Review;

import java.util.Scanner;

public class C08_IfBeden {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen bir beden giriniz : ");
        int beden = scn.nextInt();

        if (beden == 38 || beden == 40 || beden == 42) {
            System.out.println(beden + " numara small bedendir.");
        } else if (beden == 44 || beden == 46 || beden == 48) {
            System.out.println(beden + " numara medium bedendir.");
        } else if (beden == 50 || beden == 52 || beden == 54) {
            System.out.println(beden + " numara bir large bedendir. ");
        }
        else {
            System.out.println("Elimizde istediğiniz beden bulunmamaktadır.");
        }
    }
}
