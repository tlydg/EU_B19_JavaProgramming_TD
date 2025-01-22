package day12_Switch_Case;


import java.util.Scanner;

public class C07_SwitchCaseBankMenu {
    public static void main(String[] args) {

        System.out.println("ABC Bankasına Hoşgeldiniz");
        System.out.println("-----------------");

        Scanner input = new Scanner(System.in);
        System.out.println("1- Bakiye Görüntüleme");
        System.out.println("2- Para Çekme");
        System.out.println("3- Para Yatırma");
        System.out.println("4- Çıkış");

        System.out.println("Yapacağınız işlem numarası giriniz : ");

        int secim = input.nextInt();
        int bakiye = 5000;

        switch (secim){
            case 1 :
                System.out.println("Bakiyeniz = " +bakiye+ " TL ");
                break;
            case 2 :
                System.out.println("Çekeceğiniz para miktarını giriniz---> ");
                int miktar = input.nextInt();
                if (miktar > bakiye){
                    System.out.println("Yetersiz bakiye ...!");
                    System.out.println("En fazla çekebileceğiniz miktar =" +bakiye+ " TL ");
                }else {
                    bakiye -= miktar;
                    System.out.println("Güncel bakiyeniz= "+bakiye+ "TL");
                }
                break;
            case 3 :
                System.out.println("Yatıracağınız para miktarını giriniz---> ");
                int yatirilanmiktar = input.nextInt();
                bakiye +=  yatirilanmiktar;
                System.out.println("Güncel bakiyeniz= "+bakiye+ "TL");
                break;
            case 4 :
                System.out.println("Bankamızı tercih ettiğiniz için teşekkürler");
                break;

                default:
                System.out.println("Geçersiz işlem...");

        }
    }
}


