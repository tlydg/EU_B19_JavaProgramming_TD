package day11_If_else_Nestedlf;

import java.util.Scanner;

public class C02_Homework {

    public static void main(String[] args) {

        // aslında vize ve final notlarına kontrol koymalıyız, değerler sıfır ile yüz arasında olmalı.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vize1 giriniz:");
        double vize1=scanner.nextDouble();
        System.out.println("Vize2 giriniz:");
        double vize2 = scanner.nextDouble();
        System.out.println("Final notu giriniz :");
        double finalNotu = scanner.nextDouble();

        double ortalama = (vize1*0.2 + vize2*0.2 + finalNotu*0.6);

        System.out.println("ortalama = " + ortalama);

        if (ortalama>=90 && ortalama<=100){
            System.out.println("Geçme notu A");
        } else if (ortalama>=80 && ortalama<90) {
            System.out.println("Geçme notu B");
        } else if (ortalama>=70 && ortalama<80) {
            System.out.println("Geçme notu C");
        } else if (ortalama>=60 && ortalama<70) {
            System.out.println("Geçme notu D");
        }else if (ortalama>=0 && ortalama<60){
            System.out.println("Dersten Kaldınız Notunuz F");
        }else {
            System.out.println("Notları yanlış girdiniz tekrar giriniz");
        }

    }
}
