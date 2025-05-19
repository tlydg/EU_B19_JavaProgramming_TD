package day52_Errors_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_MultipleExceptions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Lütfen bir tamsayı giriniz : ");
            int sayi = scanner.nextInt();

            System.out.println("Lütfen ikinci bir tamsayı(bölen) giriniz : ");
            int bolen = scanner.nextInt();

            int sonuc = sayi/bolen;
            System.out.println("sonuc = " + sonuc);
        } catch (ArithmeticException e) {
            System.out.println("Aritmetik işlem hatası oluştu");
            System.out.println("0'a bölünme hatası");
            System.out.println("exception class is = " + e.getClass().getSimpleName());
        }catch (InputMismatchException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println("Hata oluştu :"+e);
        }finally {
            scanner.close();
            System.out.println("Finally blok her durumda mutlaka çalışan bloktur");
        }

    }
}
