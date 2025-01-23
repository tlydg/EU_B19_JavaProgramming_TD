package Day13_Ternary;

import java.util.Scanner;

public class C06_IfElseTernary {

    public static void main(String[] args) {

        // Girilen sayının pozitif mi ya da negatif oldupunu yazdıran kod

        // if - else

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        double sayi = scan.nextDouble();

        if (sayi>=0)
            System.out.println(sayi + " Pozitif bir sayıdır. ");
        else
            System.out.println(sayi + " Negatif bir sayıdır. ");

        System.out.println("--------------------");

        // Ternary
        String sonuc = sayi >= 0 ? sayi + " Pozitif bir sayıdır. " : sayi + " Negatif bir sayıdır. " ;

        System.out.println("sonuc = " + sonuc);

    }
}
