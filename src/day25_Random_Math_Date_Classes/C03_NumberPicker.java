package day25_Random_Math_Date_Classes;

import java.util.Random;
import java.util.Scanner;

public class C03_NumberPicker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 1-10 arasında bir sayı giriniz :");
        int hedefSayi = scanner.nextInt();

        System.out.println("Bu program kaç denemede tutduğunuz sayıyı bulunduğunu gösterir. ");

        Random random = new Random();
        int denemeSayisi =0;

        while (true){
            denemeSayisi++;
            int randomSayi =random.nextInt(10)+1;
            System.out.println(denemeSayisi+ "---------->" +randomSayi);

            if(randomSayi==hedefSayi){
                System.out.println("Tutduğunuz sayi olan " +hedefSayi+ "---> "+denemeSayisi+ " denemede bulunmustur. ");
                break;
            }

        }
    }
}
