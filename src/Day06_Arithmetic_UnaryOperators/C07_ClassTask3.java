package Day06_Arithmetic_UnaryOperators;

public class C07_ClassTask3 {

    public static void main(String[] args) {
        /*
        Toplantı salonunda 15 adet sıra ve her sırada 12 adet koltuk vardır.
        Toplantıya 113 kişi katılmıştır.

        */

        int sira =15;
        int siraKoltukSayisi=12;
        int katilan=113;

        // 1. Toplantı salonunun kapasitesi nedir?

        int kapasite = sira*siraKoltukSayisi;
        System.out.println("kapasite = " + kapasite);

        // 2. Toplantida kaç adet koltuk boş kalmıştır.

        int bosKoltukSayisi = kapasite-katilan;
        System.out.println("bosKoltukSayisi = " + bosKoltukSayisi);

        // 3. Kaç adet sirada oturulmaktadır.

        int oturulanSiraSayisi = katilan/siraKoltukSayisi+1;

        System.out.println("oturulanSiraSayisi = " + oturulanSiraSayisi);

        // 4. Kaç sıra tamamen boş kalmıştır.

        int bosSiraSayisi = sira-oturulanSiraSayisi;
        System.out.println("bosSiraSayisi = " + bosSiraSayisi);

        // 5. Oturulan sırılarda kaç adet boş koltuk vardır?

        int oturulanSiradakiBosKoltuk= siraKoltukSayisi -(katilan%siraKoltukSayisi);
        System.out.println("oturulanSiradakiBosKoltuk = " + oturulanSiradakiBosKoltuk);

        int cevap2= bosKoltukSayisi%12;
        System.out.println("cevap2 = " + cevap2);


    }
}
