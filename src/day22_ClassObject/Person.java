package day22_ClassObject;

public class Person {
    /*

      özellikleri (fields) yaş, ismi, cinsiyet, tcNo, yılsonuOrtlaması
      aksiyonları (metodları) uyu(), oyunOynasın(), gecmeNotu()
 */
    String isim;
    int yas;
    String cinsiyet;
    String tcNo;
    double yilsonuOrtalama;

    public void uyu(){
        System.out.println(isim+ " uyuyor");
    }
    public void oyunOyna(){
        System.out.println(isim+ " oyun oynuyor");
    }

}

