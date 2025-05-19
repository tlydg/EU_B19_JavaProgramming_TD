package day30_Arrays01;

import java.util.Scanner;

public class C08_AlisVeris {
    public static void main(String[] args) {

        // Dongu kullanarak, kullanicidan urunleri almak kaydiyla bir urun listesi olusturunuz.

        System.out.println("Alişveriş Listesi.....");

        String [] sepet = new String[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Lütfen sepetinize ürün ekleyiniz ");

        for (int i = 0; i < sepet.length ; i++) {
            System.out.println(i+1 + " . ürünü");
            sepet[i] = sc.nextLine();
        }

        System.out.println("Seçtiğiniz ürün listesi");

        for (int i = 0; i < sepet.length ; i++) {

            System.out.println(i+1+ ".ürün" + sepet[i]);
        }



    }
}
