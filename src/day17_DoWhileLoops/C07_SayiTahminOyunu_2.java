package day17_DoWhileLoops;

import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

public class C07_SayiTahminOyunu_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomSayi = random.nextInt(0,100); // 100 dagil degil
        // System.out.println("Random Sayi : " + randomSayi);
        int girilenSayi = 0;
        int denemeSayisi=1;
        do{
            System.out.print("Lütfen 1-99 araliginda bir sayi giriniz! : ");
            girilenSayi = scanner.nextInt();
            if(girilenSayi < randomSayi)
                System.out.println("Kücük bir sayi girdiniz! \n Deneme Sayisi : " + denemeSayisi);
            else if(girilenSayi > randomSayi)
                System.out.println("Büyük bir sayi girdiniz! \n Deneme Sayisi : " + denemeSayisi);
            else
                System.out.println("Bravoooo! Sayiyi buldunuz! \n Deneme Sayisi : " + denemeSayisi);
            denemeSayisi++;
        } while(girilenSayi != randomSayi);

    }

}
