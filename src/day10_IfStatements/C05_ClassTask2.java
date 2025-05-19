package day10_IfStatements;

import java.util.Scanner;

public class C05_ClassTask2 {

    public static void main(String[] args) {
        /*
hava sıcaklığı isminde bir değişken declere edin ve değer atayın
sıcaklık 20 derece üzerinde ise hava sıcak yazsın
sıcaklık 20 derece ve altında ise hava soğuk yazsın
 */

        double sicaklik = -2;

        if (sicaklik>20){
            System.out.println("Hava sıcak");
        }else {
            System.out.println("Hava soguk");
        }
        System.out.println("Program bitti");

        System.out.println("--------------------------");
                /*
Class Task 2
kullanıcıdan bir tam sayı alın
ekrana tek mi çift mi olduğunu yazdırın
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz : ");

        int sayi = input.nextInt();
        System.out.println("sayi = " + sayi);

        boolean result = (sayi%2==1);

        if (result){
            System.out.println("Sayı tektir");

        }else {
            System.out.println("Sayı çiftir");
        }

        System.out.println("Program bitti");








    }
}
