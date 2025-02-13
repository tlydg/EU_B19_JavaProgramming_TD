package day12_Switch_Case;

import java.util.Scanner;

public class C08_If_Homework1 {

    public static void main(String[] args) {

        //Soru 2- Kullanicidan aldigi urun adedi ve urun fiyatini alin,
//        kullaniciya musteri karti olup olmadigini sorun.
//        Musteri karti varsa
//              10 urun veya fazla alirsa %20,
//              10 urunden az alirsa %15 indirim yapin,
//        Musteri karti yoksa
//              10 urun veya fazla alirsa %15,
//              10 urunden az %10 indirim yapin

        Scanner input = new Scanner(System.in);
        System.out.println("Ürün miktarını giriniz : ");
        int  urunmiktari = input.nextInt();
        System.out.println("Ürün fiyatını giriniz : ");
        int  urunfiyati= input.nextInt();
        System.out.println("urunmiktari = " + urunmiktari);
        System.out.println("urunfiyati = " + urunfiyati);
        int ucret = urunmiktari * urunfiyati;
        System.out.println("ucret = " + ucret);
        input.nextLine();
        System.out.println("Müşteri kartı var mı ? -> Evet / Hayır : ");
        String musteriKarti = input.nextLine();


        if (musteriKarti.equalsIgnoreCase("Evet") &&  urunmiktari>= 10){
            System.out.println(" % 20 indirim uygula : ");
            ucret -= ucret * 0.20 ;
            System.out.println("ucret = " + ucret);
        } else if (musteriKarti.equalsIgnoreCase("Evet") &&  urunmiktari<10) {
            System.out.println(" %15 indirim uygula : ");
            ucret -= ucret * 0.15;
            System.out.println("ucret = " + ucret);

        } else if (musteriKarti.equalsIgnoreCase("Hayır") &&  urunmiktari>= 10){
            System.out.println(" % 15 indirim uygula : ");
            ucret -= ucret * 0.15;
            System.out.println("ucret = " + ucret);

        }else if (musteriKarti.equalsIgnoreCase("Hayır") &&  urunmiktari < 10) {

            System.out.println(" %10 indirim uygula : ");
            ucret -= ucret * 0.10;
            System.out.println("ucret = " + ucret);
        }
        System.out.println("Mağazamızı tercih ettiğiniz için teşekkür ederiz. ");
    }
}
