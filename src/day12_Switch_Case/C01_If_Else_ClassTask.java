package day12_Switch_Case;

import java.util.Scanner;

public class C01_If_Else_ClassTask {
    public static void main(String[] args) {

        /*
Verilen bir sayı eğer 3 e bölünüyorsa cizz yazsın
eğer 5 e bölünüyorsa bizz yazsın
eğer hem 3 e hem 5 e bölünüyorsa cizzbizz yazsın
eğer 3 e ve 5 e bölünmüyorsa "Bölünmez" yazsın.
 */

        Scanner sayiGir = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int girilenSayi = sayiGir.nextInt();

     if (girilenSayi >0) System.out.println("artı");
     else if (girilenSayi >1) {
         System.out.println("1 den büyük");

     }

        if (girilenSayi % 3 ==0 && girilenSayi % 5 ==0){
            System.out.println("cizzbizz");
        } else if (girilenSayi % 3 ==0) {
            System.out.println("cizz");
        } else if (girilenSayi % 5 ==0) {
            System.out.println("bizz");
        }else {
            System.out.println("Bölünmez");
        }








    }



}
