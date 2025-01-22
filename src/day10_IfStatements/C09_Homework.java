package day10_IfStatements;

import java.util.Scanner;

public class C09_Homework {
    public static void main(String[] args) {
        /*
        task
2 adet vize notu alin
bir adet final notu alın
vizeler ortalamaya %20 etki ediyor
final ise %60 etki ediyor
ortalamayı hesaplayın
geçme notunu yazdırın
         */
        // 90 ve üzeri A ---max notumuz 100 olur. logical ope. bak
        // 80 ve üzeri B
        // 70 ve üzeri C
        // 60 ve üzeri D
        // 60 altı F

        Scanner input = new Scanner(System.in);
        System.out.println("Ders notlarını giriniz");

        System.out.println("Vize1 notu giriniz: ");
        double vize1 = input.nextDouble();

        System.out.println("Vize2 notu giriniz: ");
        double vize2 = input.nextDouble();

        System.out.println("Final notu giriniz: ");
        double finalNotu = input.nextDouble();

        double gecmeNotu = 50;
        System.out.println("gecmeNotu = " + gecmeNotu);

        double ortalama = ((vize1 +vize2)*20/100) + (finalNotu*60)/100;
        System.out.println("ortalama = " + ortalama);

        if (ortalama>=90 && ortalama <= 100){

            System.out.println("Sınav notunuz : A ");

        } else if (ortalama >= 80 && ortalama < 90) {

            System.out.println("Sınav notunuz : B ");

        } else if (ortalama >= 70 && ortalama < 80) {

            System.out.println("Sınav notunuz : C ");

        } else if ( ortalama >= 60 && ortalama < 70) {

            System.out.println("Sınav notunuz : D");

        }else {

            System.out.println("Sınav notunuz : F");
        }
        System.out.println("Program bitti.");


    }
}
