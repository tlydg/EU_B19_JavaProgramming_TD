package day27_StringClass2;

import java.util.Scanner;

public class C04_Empty {
    public static void main(String[] args) {

       /*
        Write a method that asks user to enter a string.--kullanıcıdan bir string alın
        if the string is empty, print: string is empty-- boş ise String is empty
        if the string has more than 3 characters, print the last three characters
        --3 den fazla karakteri varsa son 3 karakteri yazsın.
        if the string has less than or equal 3 characters, print the string itself
        --3 den az karakteri varsa kendisini yazdır.

        ali---> ali
        ak----->ak
        ankara----> ara
        ""----> empty

                */

        String s1="tülay";
        if(s1.length()==0){
            System.out.println("Empty");
        }else if (s1.length()>3) {
            System.out.println(s1.substring(s1.length() - 3));
        } else {
            System.out.println(s1);

        }


    }
}
