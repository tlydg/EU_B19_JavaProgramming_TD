package day14_Review;

public class C05_IfExample2 {
    public static void main(String[] args) {
        // Elimizde belirli sayıda 5 kilo ve ve 1 kiloluk un paketleri var
        // Müşterinin istediği kilo sayıda paketleri verip vermediğimizi kontrol edin.

        int beslikPaketSayisi = 4;
        int birlikPaketSayisi = 4;
        int talep= 10;
        boolean karsilanabilirMi = false;

       if (talep > 0){

            if (beslikPaketSayisi*5 >= talep){
                if (birlikPaketSayisi >= talep%5){
                    karsilanabilirMi = true;
                }
            }else if (birlikPaketSayisi >= talep - beslikPaketSayisi*5){
                karsilanabilirMi = true;
            }
            if (karsilanabilirMi){
                System.out.println(talep + " kilo talebiniz depolarımızda mevcut. ");
            }else {
                System.out.println(talep + " kilo talebiniz depolarımızda mevcut değildir. ");
            }
       }  else {
           System.out.println(" Talebi yanlış oluşturdunuz. ");

       }
    }
}
