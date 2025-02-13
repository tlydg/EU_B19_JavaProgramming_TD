package day23_Review;

public class C04_HesapMakinesi {
    public static void main(String[] args) {

        double islemSonucu;
        islemSonucu =hesapMakinesi(10,2,'+');
        System.out.println("islemSonucu = " + islemSonucu);

        islemSonucu =hesapMakinesi(10,2,'-');
        System.out.println("islemSonucu = " + islemSonucu);

        islemSonucu =hesapMakinesi(10,2,'*');
        System.out.println("islemSonucu = " + islemSonucu);

        islemSonucu =hesapMakinesi(10,2,'/');
        System.out.println("islemSonucu = " + islemSonucu);

        islemSonucu =hesapMakinesi(10,2,'&');
        System.out.println("islemSonucu = " + islemSonucu);

    }

    public static double hesapMakinesi(int sayi1, int sayi2, char islem){

        double sonuc=0;
        switch (islem){
            case '+':
                sonuc=sayi1+sayi2;
                break;
            case '-':
                sonuc=sayi1-sayi2;
                break;
            case '*':
                sonuc=sayi1*sayi2;
                break;
            case '/':
                sonuc=sayi1/sayi2;
                break;

                default:
                sonuc=-1000;
        }
        return sonuc;
    }

}
