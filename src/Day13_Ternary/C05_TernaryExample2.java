package Day13_Ternary;

import java.util.Scanner;

public class C05_TernaryExample2 {
    public static void main(String[] args) {
        // klavyeden bir kişinin adını ve yaşını alalım
        // eğer yaşı 18 e eşit ve büyükse name + "oy kullanabilirsiniz" mesajı verelim
        // eğer yaşı 18 den küçükse name + "oy kullanamazsınız" mesajını verelim.

        Scanner input = new Scanner(System.in);
        System.out.println("Adınızı giriniz : " );
        String name = input.nextLine();
        System.out.println("Yaşınızı giriniz : ");
        int age = input.nextInt();

        System.out.println(age >= 18 ?  name+ "oy kullanabilirsiniz " : name+ "oy kullanamazsınız " );



    }
}
