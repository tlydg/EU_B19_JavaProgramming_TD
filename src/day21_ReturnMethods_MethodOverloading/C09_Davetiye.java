package day21_ReturnMethods_MethodOverloading;

import java.util.Scanner;

public class C09_Davetiye {
    public static void main(String[] args) {
        davetiye();
    }
    public static void davetiye(){
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Kelime");
            String kelime1 = scanner.nextLine();
            System.out.println("2. Kelime");
            String kelime2 = scanner.nextLine();

            if (kelimeKontrol(kelime1, kelime2)) {
                System.out.println("Kelimeler farklı olmalıdır.");
                continue;
            } else {
                davetiyeYazdir(kelime1, kelime2);
                return;
            }
        }
    }
    public static boolean kelimeKontrol(String kelime1, String kelime2){

        return kelime1.equals(kelime2);
    }
    public static void davetiyeYazdir(String str, String str2 ){
        System.out.println("******"+str+"***********"+str2+"***********");
    }

}
