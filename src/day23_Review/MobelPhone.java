package day23_Review;

public class MobelPhone {

    /**
     * marka, model, renk, fiyat, boyut, kapasite, mesaj atabiliyorMu
     * aramaYap(), mesajAt(), fotografcek(), interneteBaglan()
     *
     */

    String marka;
    String model;
    String renk;
    double fiyat;
    double boyut;
    double kapasite;
    boolean mesajAtabiliyorMu;


    public void aramaYap(){
        System.out.println(marka+" Arama yapıyor...");
    }

    public void mesajAt(){
        System.out.println(marka+" Mesaj atıyor...");
    }
    public void fotografcek(){
        System.out.println(marka+" Fotograf cekiyor...");
    }
    public void interneteBaglan(){
        System.out.println(marka+" Internete baglaniyor...");
    }
}
