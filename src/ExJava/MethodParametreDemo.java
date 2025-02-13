package ExJava;

public class MethodParametreDemo {
    public static void main(String[] args) {
        konsolCiktisi(" Tulay");
        konsolCiktisi(" Ozan");
        System.out.println(toplamaislemi(10, 11));
        System.out.println(toplamaislemi(100, 200));
        sinavNotlari("Emre", 77);
        sinavNotlari("Osman", 100);

        System.out.println("--------------------------");
        System.out.println(carpma(3,5));
        System.out.println(carpma(10,2));
        System.out.println("--------------------------");
        System.out.println(toplama(10,8));
        System.out.println(toplamaislemi(20,30,40));
        System.out.println(toplamaislemi(8.2,4.1));


    }
    private static void konsolCiktisi(String isim){
        System.out.println("Merhaba Dunya!" + " ve Merhaba" + isim);
    }
    private static int toplamaislemi(int a, int b){
       return a+b;
    }
    private static int toplamaislemi(int a, int b, int c){
        return a+b+c;
    }
    private static double toplamaislemi(double a, double b){
        return a+b;
    }
    // Konsola kişinin adini ve sinav notu yazdıran bir method oluşturun.

    private static void sinavNotlari(String ad, int not){
        System.out.println(ad + " isimli öğrencinin notu " + not);
    }
    // Dönüş tipli Metod Yapalım:
    private static int carpma (int a, int b){
        int carpmaSonucu = a*b;
        return carpmaSonucu;
    }
    // toplama işlemi
    private static int toplama(int sayi1, int sayi2){
        return sayi1 + sayi2;
    }


}
