package day24_Reading_User_Input_Scanner;

import java.util.Scanner;

public class C04_ScannerProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yaşınızı giriniz : ");
        int age = input.nextInt();

        input.nextLine(); // nexInt() ve diğer metodlarından sonra klavye ön belleği temizlenmeden
        //String değer girişi yapılırsa, son giriş değeri \n oldupu için bu değer Stringe atanır.
        //yeni değer alınamaz..

        System.out.println("Adınızı giriniz : ");
        String name = input.nextLine();

        System.out.println("adıniz: " +name+ "Yaşınız : " +age);
    }
}
