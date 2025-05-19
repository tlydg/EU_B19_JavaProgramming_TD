package day38_Constructor_PassingObjects02.Okul;

public class Adres {

    String cadde;
    String ilce;
    String sehir;
    int no;

    public Adres() {
        System.out.println("No params");
        cadde="Belirtilmemiş";
        ilce="Belirtilmemiş";
        sehir="Belirtilmemiş";
        no=0;

    }

    public Adres(String sehir) {
        /*
        cadde="Belirtilmemiş";
        ilce="Belirtilmemiş";
        no=0;
        */
        this(); // constructor chaining -- bir constructor içinde başka bir constr. çağrılmasıdır
        System.out.println("Şehir parametreli");
        this.sehir = sehir;
    }

    public Adres(String ilce, String sehir) {
        this(sehir);
        System.out.println("2 parametreli");
        this.ilce = ilce;
       // this.sehir = sehir;
    }

    public Adres(String cadde, String ilce, String sehir, int no) {
        this.cadde = cadde;
        this.ilce = ilce;
        this.sehir = sehir;
        this.no = no;
    }

    public String toString(){
        return "Adres{"+
                ", Cadde = " +cadde+
                ", İlçe = " +ilce+
                ", Şehir = " +sehir+
                ", No = " +no+
                "}";

    }
}
