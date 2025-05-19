package day37_Constructor_PassingPbjects01;

public class BankaTest {
    public static void main(String[] args) {
        Banka banka1 = new Banka();
        System.out.println("banka1.name = " + banka1.name);
        System.out.println("banka1.name.length() = " + banka1.name.length());

        System.out.println("banka1.adress = " + banka1.adress);
        System.out.println("banka1.hesapNo = " + banka1.hesapNo);
        System.out.println("banka1.hashCode() = " + banka1.hashCode());

        banka1.name="ABC Bankası";
        System.out.println("banka1.name = " + banka1.name);
        System.out.println("banka1.name.length() = " + banka1.name.length());

        Banka banka2 = new Banka("XYZ Bankası","XYZ bulvarı no:3",5000);
        System.out.println("banka2.name = " + banka2.name);
        System.out.println("banka2.adress = " + banka2.adress);
        System.out.println("banka2.hesapNo = " + banka2.hesapNo);


        System.out.println("banka1.musteriler.size() = " + banka1.musteriler.size());

        Musteri musteri = new Musteri("Alper Falanca","90-316-567-89-09");
        Musteri musteri1 = new Musteri("Melek Erva","90-212-567-59-09");
        Musteri musteri2 = new Musteri("Elif Dilek","1-316-5674459");
        Musteri musteri3 = new Musteri("Melek Noname","49-316-5674589909");

        System.out.println("musteri.name = " + musteri.name);

        banka2.musteriEkle(musteri); // passinh object to method
        banka2.musteriEkle(musteri1); // passinh object to method
        banka2.musteriEkle(musteri2); // passinh object to method
        banka2.musteriEkle(musteri3); // passinh object to method

        System.out.println("banka2.musteriler.size() = " + banka2.musteriler.size());

        banka2.paraYatir(musteri,100);

        System.out.println("musteri.bakiye = " + musteri.bakiye);

        banka2.paraYatir(musteri,340);
        System.out.println("musteri.bakiye = " + musteri.bakiye);

        banka2.paraYatir(musteri1,1575);
        banka2.paraYatir(musteri2,1000000);

        banka2.musteriListe();

        banka2.paraCek(musteri,123);

        banka2.musteriListe();

        banka2.findByHesapNo(5001);
        banka2.findByHesapNo(50011);

        banka2.findByName("Melek");



    }
}
