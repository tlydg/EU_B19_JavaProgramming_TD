package day39_Encapsulation_01;

public class AdresTest {
    public static void main(String[] args) {
        Adres adres =  new Adres("Atatürk caddesi no:345","İstanbul", "Türkiye");
        System.out.println("adres = " + adres);

        adres.setStreet("");
        System.out.println("adres = " + adres);
    }
}
