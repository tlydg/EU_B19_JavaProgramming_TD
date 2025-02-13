package day23_Review;

public class C02_HierarcicalMethodCall {
    public static void main(String[] args) {
        System.out.println("Main Metod");
        mesajGoster();
        System.out.println("Tekrar Main Metod");

    }

    public static void mesajGoster(){
        System.out.println("Merhaba Dünya");
        hesapMakinasi();
        System.out.println("Tekrar mesaj göster Metodunda");
    }
    public static void hesapMakinasi(){
        System.out.println(10*3/2+1);
    }
}
