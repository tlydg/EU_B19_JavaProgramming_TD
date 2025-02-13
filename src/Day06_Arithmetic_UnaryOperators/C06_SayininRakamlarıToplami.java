package Day06_Arithmetic_UnaryOperators;

import java.util.Scanner;

public class C06_SayininRakamlarıToplami {

    public static void main(String[] args) {
        // Kullanicidan 3 basamakli bir sayi alin
        // ve sayinin rakamlari toplamini ekrana yazdirin!

        // 112  = 1 + 1 + 2 = 4
        // 952  = 9 + 5 + 2 = 16


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz :");

        int number = scanner .nextInt();
        System.out.println("number = " + number);

        // 567

        int lastDigit = number %10; // 567/10   kalan 7

        number/=10;
        System.out.println("number = " + number);  // 56

        int secondDigit = number%10; // 6

        int thirdDigit = number/10 ; // 5

        int toplam = lastDigit +secondDigit + thirdDigit;
        System.out.println("toplam = " + toplam);


    }
}
