package Day13_Ternary;

import java.util.Scanner;

public class C04_TernaryExample1 {
    public static void main(String[] args) {

        // klavyeden bir sayı (x) girişi yapalım, girilen sayı 15 den büyükse
        // diğer sayıya (y) 90 değerini atayalım değilse 50 değerini atayalım

        Scanner sayiGir = new Scanner(System.in);
        int x,y;
        System.out.println("Bir tam sayı girelim : " );
        x = sayiGir.nextInt();

        y = x > 15 ? 90 : 50;
        System.out.println("y = " + y);


    }
}
