package day24_Reading_User_Input_Scanner;

import java.lang.*; // import etsem de etmesem de java bunu otomatik görür.
// * kullanırsak bir package içindeki bütün classları import eder.


import java.util.Scanner; // sadece scanner classı import edilir.

public class C01_UserInput {
    public static void main(String[] args) {

        System.out.println("User Input in Java");

        Scanner klavye = new Scanner(System.in);
        //System.in -- klavyeden bir şey girmek için bir keyword.

        System.out.print("Klavyeden isminizi giriniz : ");
        String name = klavye.nextLine();

        System.out.println("İsminiz : " + name);

    }
}
