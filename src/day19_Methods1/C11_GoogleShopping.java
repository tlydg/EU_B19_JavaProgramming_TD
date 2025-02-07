package day19_Methods1;

public class C11_GoogleShopping {
    public static void main(String[] args) {
        /**
         * google git
         * arama yap
         * ürünü bul ve sitesine git
         * ürünü sepete ekle
         * ödeme yap
         * onay kodu al
         * ödemeyi tamamla
         * google geri dön
         */
        google();
        aramaYap();
    }
    public static void google(){
        System.out.println("Google sitesine gidildi");
        aramaYap();
    }
    public static void aramaYap(){
        System.out.println("Ürün girildi ve arama yapıldı");
        System.out.println("Arama sonuçlarından uygun olana tiklandı");
        urunSitesineGit();
    }

    public static void urunSitesineGit(){
        System.out.println("İlgili siteye gidildi");
        System.out.println("ürün seçildi ve sepete eklendi");
        odemeYap();
    }

    public static void odemeYap(){
        System.out.println("Hesap bilgileri girildi");
        onayKoduAl();
        System.out.println("Alınan kod girildi");
        System.out.println("Odeme tamamlandı");
        //  google(); sonsuz döngüye sebep olur
        System.out.println("Google sitesine geri dönüldü");
    }
    public static void onayKoduAl(){
        System.out.println("Onay kodu verildi");
    }
}
