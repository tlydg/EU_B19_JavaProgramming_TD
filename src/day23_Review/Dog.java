package day23_Review;

public class Dog {


    //
    // fields -- özellikler
    String ad;
    String cins;
    String renk;
    int yas;
    char cinsiyet;
    boolean evcilMi;

    // actions--methods

    public void havla(){
        System.out.println(ad+ " havlıyor...");
    }
    public void isir(){
        System.out.println(ad+ " ısırıyor...");
    }
    public void mamaYe(){
        System.out.println(ad+ " mama yiyor...");
    }
    public void suruGut(){
        System.out.println(ad+ " sürü güdüyor...");
    }


}
