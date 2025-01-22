package day11_If_else_Nestedlf;

import java.util.Scanner;

public class C04_Calculator {

    public static void main(String[] args) {
///+,-,*,/
// 4 işlem yapacak şekilde bir hesap makinesi yapın
// kullanıcıdan 2 sayı alın
//yapmak istediği işlemi seçsin +,-,*,/
//hatalı işlem girişlerinde kullanıcıya uyarı verin
//ekrana sonuç döndüren programı yazınız.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı1 giriniz:");
        double sayi1 =scanner.nextDouble();
        System.out.println("Sayı2 giriniz:");
        double sayi2 =scanner.nextDouble();
        System.out.println("Yapmak istediğiniz işlemi seçiniz : ");
        String islem = scanner.next();

        // islem == + - * /

        if (islem.equals("+")){
            System.out.println(sayi1+sayi2);
        } else if (islem.equals("-")) {
            System.out.println(sayi1-sayi2);
        } else if (islem.equals("*")) {
            System.out.println(sayi1*sayi2);
        } else if (islem.equals("/")) {
            System.out.println(sayi1/sayi2);
        }else {

            System.out.println("Hatalı işlem girdiniz");
        }

    }
}
