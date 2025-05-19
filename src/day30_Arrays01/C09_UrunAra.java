package day30_Arrays01;

import java.util.Scanner;

public class C09_UrunAra {
    public static void main(String[] args) {

        // Kullanicidan bir urun alarak, urunun listede olup olmadigini bildiren bir program yaziniz

        String [] urunler = {"Elma", "Armut", "Muz", "Karpuz", "Şeftali"};

        System.out.println("Lütfen bir ürün giriniz : ");

        Scanner sc = new Scanner(System.in);
        String arananUrun = sc.nextLine();

        boolean flag = false;

        for (int i = 0; i < urunler.length ; i++) {
            if (urunler[i].equalsIgnoreCase(arananUrun)) {
                flag =true;
                break;
            }
        }
        if(flag){
            System.out.println("Aradığınız ürün listede var");
        }else {
            System.out.println("Aradığınız ürün listede yok");
        }


    }
}
