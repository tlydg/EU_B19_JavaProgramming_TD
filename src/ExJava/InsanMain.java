package ExJava;

public class InsanMain {
    public static void main(String[] args) {
//        Insan ilkInsan = new Insan();
//        ilkInsan.konsolaYazdir();

        Lamba salonLambasi = new Lamba ();
        salonLambasi.lambaDurumu("salon");
        salonLambasi.durumu=true;
        salonLambasi.lambaDurumu("salon");

        Lamba yatakLambasi = new Lamba();
        yatakLambasi.lambaDurumu("yatak odasi");
        yatakLambasi.durumu=true;
        yatakLambasi.lambaDurumu("yatak odasi yeni");
        yatakLambasi.durumu=false;
        yatakLambasi.lambaDurumu("yatak odasi son");



    }
}
