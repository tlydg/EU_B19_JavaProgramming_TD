package day27_StringClass2;

import java.util.Scanner;

public class C07_Frekans {
    public static void main(String[] args) {

        // String str = "AABACCCDC";
        // char ch = 'C';
        // 4

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz: ");
        String s1= sc.nextLine();
        System.out.println("Lütfen karakter giriniz: ");
        char c1 = sc.nextLine().charAt(0);

        int sayac=0;

        for (int i = 0; i < s1.length() ; i++) {
            if (s1.charAt(i) == c1)
                sayac++;

        }
        System.out.println(sayac);

    }
}
